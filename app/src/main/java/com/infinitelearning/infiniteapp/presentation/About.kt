import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.infinitelearning.infiniteapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
 public fun AboutScreen(modifier: Modifier.Companion = Modifier, navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Profile") },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBackIosNew,
                            contentDescription = "Back Icon"
                        )
                    }
                }
            )
        }
    ) { contentPadding ->
        AboutContent(contentPadding)
    }
}

@Composable
private fun AboutContent(contentPadding: PaddingValues) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(contentPadding)
    ) {
        val borderWidth = 4.dp
        ProfileImage(
            painter = painterResource(id = R.drawable.fotoku),
            contentDescription = "Image Profile",
            borderWidth = borderWidth
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Jefri Hardiawan Wijaya",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "jefriwijaya17011998@gmail.com",
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "Universitas Amikom Purwokerto",
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = "Teknik Informatika",
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )
    }
}

@Composable
private fun ProfileImage(
    painter: Painter,
    contentDescription: String,
    borderWidth: Dp,
) {
    Image(
        painter = painter,
        contentDescription = contentDescription,
        modifier = Modifier.size(200.dp)
            .border(
                BorderStroke(borderWidth, Color.LightGray),
                CircleShape
            )
            .padding(borderWidth)
            .clip(CircleShape),
        contentScale = ContentScale.Crop
    )
}
