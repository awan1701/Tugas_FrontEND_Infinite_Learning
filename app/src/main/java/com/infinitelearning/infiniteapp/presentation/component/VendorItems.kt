package com.infinitelearning.infiniteapp.presentation.component


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinitelearning.infiniteapp.R
import com.infinitelearning.infiniteapp.model.Vendor
import com.infinitelearning.infiniteapp.ui.theme.InfiniteAppTheme

@Composable
fun VendorItem(
    vendor: Vendor,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.clickable {
            onItemClicked(vendor.id)
        }
    ) {
        Image(
            painter = painterResource(id = vendor.photo),
            contentDescription = vendor.name, modifier = Modifier
                .clip(CircleShape)
                .size(120.dp)
        )
        Text(
            text = vendor.name,
            style = MaterialTheme.typography.titleMedium,
            overflow = TextOverflow.Ellipsis,
            textAlign = TextAlign.Center,
            modifier = Modifier.width(120.dp),
            maxLines = 1
        )
        Text(
            text = vendor.address,
            color = MaterialTheme.colorScheme.primary,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.width(120.dp),
            maxLines = 1
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun VendorItemHorizontalPreview() {
    InfiniteAppTheme {
        VendorItem(
            vendor = Vendor(1, "Unilever", "Cikarang Bekasi", 12124567, R.drawable.unilever),
            onItemClicked = { vendorId ->
                println("Vendor Id : $vendorId")
            }
        )
    }
}