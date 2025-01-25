package edu.cs501.cs501hw1part2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import edu.cs501.cs501hw1part2.ui.theme.Cs501hw1part2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Cs501hw1part2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val showMessage = remember { mutableStateOf(false) }

                    Box(modifier = Modifier.padding(innerPadding).fillMaxSize()) {
                        if (showMessage.value) {
                            Text(
                                text = "Hello, World!",
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }

                        Button(onClick = {showMessage.value = !showMessage.value }, modifier = Modifier.align(Alignment.BottomCenter)) {
                            Text("Show Message")
                        }
                    }
                }
            }
        }
    }
}

