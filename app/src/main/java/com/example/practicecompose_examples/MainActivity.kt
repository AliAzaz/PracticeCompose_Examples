package com.example.practicecompose_examples

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.core.setContent
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.Button
import androidx.ui.material.Card
import androidx.ui.material.Divider
import androidx.ui.material.MaterialTheme
import androidx.ui.material.icons.Icons
import androidx.ui.material.icons.filled.ArrowForward
import androidx.ui.material.icons.filled.Check
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                CardGreeting()
            }
        }
    }
}

@Composable
fun CardGreeting() {

    VerticalScroller() {
        Column {
            for (x in 0..2) {
                cardViewImplementer()
                Divider()
            }
        }
    }

}

@Composable
fun cardViewImplementer() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .clip(shape = RoundedCornerShape(6.dp))
    ) {

        Column {
            Image(
                imageResource(id = R.drawable.scene_01),
                modifier = Modifier.preferredHeightIn(160.dp, 260.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                "A day in Shark Fin Cove",
                style = MaterialTheme.typography.h4,
                modifier = Modifier.padding(15.dp, 20.dp, 0.dp, 0.dp)
            )
            Column(Modifier.padding(15.dp)) {
                Text("Davenport, California", style = MaterialTheme.typography.body1)
                Text("December 2018", style = MaterialTheme.typography.body2)
                Row(modifier = Modifier.padding(0.dp, 25.dp, 0.dp, 5.dp)) {
                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(5.dp),
                        modifier = Modifier.padding(5.dp)
                    ) {
                        Icon(asset = Icons.Filled.Check)
                    }
                    Button(
                        onClick = {},
                        shape = RoundedCornerShape(5.dp),
                        modifier = Modifier.padding(5.dp)
                    ) {
                        Icon(asset = Icons.Filled.ArrowForward)
                    }
                }
            }
        }

    }
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        CardGreeting()
    }
}