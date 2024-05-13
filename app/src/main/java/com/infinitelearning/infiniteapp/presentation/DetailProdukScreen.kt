package com.infinitelearning.infiniteapp.presentation


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.infinitelearning.infiniteapp.data.DummyData
import com.infinitelearning.infiniteapp.model.Vendor

@Composable
fun DetaiProdukScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    vendorId: Int?
) {

    val newVendorsList = DummyData.mobileVendor.filter { vendor ->
        vendor.id == vendorId
    }
    Column(
        modifier = modifier
    ) {
        DetailVendorContent(newVendorsList = newVendorsList)
    }
}
@Composable
private fun DetailVendorContent(
    newVendorsList: List<Vendor>,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(16.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(data = newVendorsList[0].photo)
                .build(),
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .size(height = 180.dp, width = 100.dp)
                .clip(RoundedCornerShape(10.dp)),
            contentDescription = "Poster Movie"
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = newVendorsList[0].name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "(${newVendorsList[0].address})",
                style = MaterialTheme.typography.titleSmall,
            )
            Text(
                text = "Telephone : ${newVendorsList[0].Telephone}",
                style = MaterialTheme.typography.titleSmall,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DetailVendorContentPreview() {
    DetailVendorContent(newVendorsList = DummyData.mobileVendor)
}