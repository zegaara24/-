package com.example.alabzikrapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val DarkGreen = Color(0xFF063F42)
private val CardGreen = Color(0xFF0B5557)
private val Gold = Color(0xFFFFC247)
private val White = Color(0xFFF5F5F5)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AzkarApp()
        }
    }
}

@Composable
fun AzkarApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = DarkGreen
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "🌙",
                fontSize = 50.sp
            )

            Text(
                text = "الأذكار",
                color = White,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "تطبيقك اليومي لذكر الله",
                color = Color.LightGray,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(25.dp))

            CardButton("☀️  أذكار الصباح")
            CardButton("🌙  أذكار المساء")
            CardButton("🛏️  أذكار النوم")
            CardButton("🕌  أذكار بعد الصلاة")

            Spacer(modifier = Modifier.height(15.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = CardGreen
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "المسبحة",
                        color = White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "33",
                        color = Gold,
                        fontSize = 42.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "سبحان الله",
                        color = White,
                        fontSize = 16.sp
                    )
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                BottomButton("♡", "المفضلة")
                BottomButton("⌂", "الرئيسية")
                BottomButton("☷", "المزيد")
            }
        }
    }
}

@Composable
fun CardButton(text: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp),
        colors = CardDefaults.cardColors(
            containerColor = CardGreen
        ),
        shape = RoundedCornerShape(18.dp)
    ) {
        Text(
            text = text,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            color = White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun BottomButton(icon: String, title: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = icon,
            color = Gold,
            fontSize = 28.sp
        )

        Text(
            text = title,
            color = White,
            fontSize = 13.sp
        )
    }
}
