package eu.tutorial.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import eu.tutorial.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainGame()
                }
            }
        }
    }
        @Composable
        fun CaptainGame() {
            val treasureFound = remember { mutableStateOf(0) }
            val direciton = remember { mutableStateOf("North") }
            val stormOrTreasure = remember { mutableStateOf("")}

            Column {
                Text(text = "Treasures Found: ${treasureFound.value}")
                Text(text = "Current Direction: ${direciton.value}")
            }
            Button(onClick = {
                direciton.value = "East"
                if (Random.nextBoolean()) {
                    treasureFound.value += 1
                    stormOrTreasure.value = "Found a treasure!"
                } else {
                    stormOrTreasure.value = "Storm Ahead!"
                }
            }) {
                Text(text = "Sail East")
            }
            Button(onClick = {
                direciton.value = "West"
                if (Random.nextBoolean()) {
                    treasureFound.value += 1
                    stormOrTreasure.value = "Found a treasure!"
                } else {
                    stormOrTreasure.value = "Storm Ahead!"
                }
            }) {
                Text(text = "Sail West")
            }
            Button(onClick = {
                direciton.value = "North"
                if (Random.nextBoolean()) {
                    treasureFound.value += 1
                    stormOrTreasure.value = "Found a treasure!"
                } else {
                    stormOrTreasure.value = "Storm Ahead!"
                }
            }) {
                Text(text = "Sail North")
            }
            Button(onClick = {
                direciton.value = "South"
                if (Random.nextBoolean()) {
                    treasureFound.value += 1
                    stormOrTreasure.value = "Found a treasure!"
                } else {
                    stormOrTreasure.value = "Storm Ahead!"
                }
            }) {
                Text(text = "Sail South")
            }
            Text(text = stormOrTreasure.value)
        }
}
