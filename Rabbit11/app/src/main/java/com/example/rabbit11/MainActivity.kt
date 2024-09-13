package com.example.rabbit11

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.rabbit11.ui.theme.Rabbit11Theme


class MainActivity : ComponentActivity() {

    private lateinit var animImageView: ImageView
    private lateinit var startButton: Button
    private lateinit var pauseButton: Button
    private lateinit var frameAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animImageView = findViewById(R.id.animImageView)
        startButton = findViewById(R.id.startButton)
        pauseButton = findViewById(R.id.pauseButton)

        frameAnimation = animImageView.drawable as AnimationDrawable

        startButton.setOnClickListener {
            if (!frameAnimation.isRunning()){
                frameAnimation.start()

            }
        }

        pauseButton.setOnClickListener {
            if (frameAnimation.isRunning()){
                frameAnimation.stop()
            }
        }

        enableEdgeToEdge()



    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Rabbit11Theme {
        Greeting("Android")
    }
}