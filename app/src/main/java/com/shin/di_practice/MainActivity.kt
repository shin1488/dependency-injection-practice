package com.shin.di_practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MenuDefaults.ShadowElevation
import androidx.compose.material3.MenuDefaults.TonalElevation
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import com.shin.di_practice.ui.theme.TestTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        car.startCar()
        setContent {
            TestTheme {
                Surface(modifier = Modifier,
                    shape = RectangleShape,
                    color = Color.Red,
                    contentColor = Color.White,
                    tonalElevation = TonalElevation,
                    shadowElevation = ShadowElevation
                ) {
                    Greeting("앱이 실행되었습니다. 로그를 확인하세요!")
                }
            }
        }
    }
}

@Composable
fun Greeting(text: String) {
    Box(contentAlignment = Alignment.Center) {
        Text(text = text)
    }
}