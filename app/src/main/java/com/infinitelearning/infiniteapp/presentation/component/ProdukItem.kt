package com.infinitelearning.infiniteapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinitelearning.infiniteapp.R
import com.infinitelearning.infiniteapp.model.Produk
import com.infinitelearning.infiniteapp.ui.theme.InfiniteAppTheme

@Composable
fun ProdukItem(
    produk: Produk,
    modifier: Modifier = Modifier,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = produk.photo),
            contentDescription = produk.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = produk.name, style = MaterialTheme.typography.titleMedium)
            Row {
                Text(text = produk.Variant, color = MaterialTheme.colorScheme.primary)
                Text(text = " - ${produk.Harga}")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MentorItemPreview() {
    InfiniteAppTheme {
        ProdukItem(
            produk = Produk(
                id= 1,
                name= "Indomie Goreng",
                photo= R.drawable.indomiegoreng,
                Variant= "Goreng",
                Keterangan= "Mi goreng yang lezat dan nikmat, terbuat dari bahan berkualitas dan rempah rempah terbaik.",
                Harga = " Rp. 3500 "
            )
        )
    }
}