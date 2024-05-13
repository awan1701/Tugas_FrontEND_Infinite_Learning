package com.infinitelearning.infiniteapp.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.infinitelearning.infiniteapp.data.DummyData
import com.infinitelearning.infiniteapp.model.Produk
import com.infinitelearning.infiniteapp.model.Vendor
import com.infinitelearning.infiniteapp.navigation.Screen
import com.infinitelearning.infiniteapp.presentation.component.ProdukItem
import com.infinitelearning.infiniteapp.presentation.component.VendorItem

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
    vendor: List<Vendor> = DummyData.mobileVendor,
    produk: List<Produk> = DummyData.mobileProduk,
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        item {
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = modifier
            ) {
                items(vendor, key = { it.id }) {
                    VendorItem(vendor = it) { vendorId ->
                        navController.navigate(Screen.Detail.route + "/$vendorId")
                    }
                }
            }
        }
        items(produk, key = { it.id }) {
            ProdukItem(produk = it, modifier = Modifier.padding(horizontal = 16.dp))
        }
    }
}