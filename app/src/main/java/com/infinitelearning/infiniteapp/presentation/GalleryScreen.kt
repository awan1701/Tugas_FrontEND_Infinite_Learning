import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinitelearning.infiniteapp.data.DummyData
import com.infinitelearning.infiniteapp.model.Koleksi
import com.infinitelearning.infiniteapp.navigation.Screen
import com.infinitelearning.infiniteapp.ui.theme.InfiniteAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KoleksiScreen(
    modifier: Modifier = Modifier,
    galleries: List<Koleksi> = DummyData.Koleksi
) {
    Column(modifier = modifier.fillMaxSize()) {
        TopAppBar(
            title = { Text(text = "Koleksi") }
        )
        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Adaptive(160.dp),
            verticalItemSpacing = 4.dp,
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(galleries, key = { it.id }) {
                Image(
                    painter = painterResource(id = it.photo),
                    contentDescription = it.name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                     )
                        }

            }
        }
    }


@Preview(showSystemUi = true)
@Composable
private fun GalleryScreenPreview() {
    InfiniteAppTheme {
        KoleksiScreen(galleries = DummyData.Koleksi)
    }
}
