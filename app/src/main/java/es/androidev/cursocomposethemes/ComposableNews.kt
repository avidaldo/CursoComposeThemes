package es.androidev.cursocomposethemes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import es.androidev.cursocomposethemes.ui.theme.CursoComposeThemesTheme


@Preview
@Composable
fun ScreenNew() {

    CursoComposeThemesTheme() {

        Scaffold(topBar = { AppBar() }) {
            Column(
                modifier = Modifier
                    .padding(it)  // Es necesario pasar los parámetros de padding del scaffold
                    .fillMaxWidth()

            ) {
                Image(
                    painter = painterResource(R.drawable.gasol),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,

                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                        .clip(shape = MaterialTheme.shapes.medium)

                )
                Spacer(Modifier.height(16.dp))
                val padding = Modifier.padding(horizontal = 16.dp)
                Text(
                    text = stringResource(R.string.titulo),
                    style = MaterialTheme.typography.h4,
                    modifier = padding
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = stringResource(R.string.subtitulo),
                    style = MaterialTheme.typography.subtitle2,
                    modifier = padding
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = stringResource(R.string.contenido),
                    style = MaterialTheme.typography.body2,
                    modifier = padding
                )


            }
        }
    }


}

@Composable
private fun AppBar() {
    TopAppBar(
        title = {
            Text(stringResource(R.string.noticia))
        },
        backgroundColor = MaterialTheme.colors.primary
    )
}

