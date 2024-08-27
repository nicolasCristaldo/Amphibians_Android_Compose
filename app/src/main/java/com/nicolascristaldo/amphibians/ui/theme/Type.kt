package com.nicolascristaldo.amphibians.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.nicolascristaldo.amphibians.R

val Mitr = FontFamily(
    Font(R.font.mitr_medium, FontWeight.Normal),
    Font(R.font.mitr_bold, FontWeight.Bold)
)

val Questrial = FontFamily(
    Font(R.font.questrial_regular, FontWeight.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Mitr,
        fontWeight = FontWeight.Bold,
        fontSize = 38.sp,
    ),
    displayMedium = TextStyle(
        fontFamily = Mitr,
        fontWeight = FontWeight.Normal,
        fontSize = 26.sp,
        letterSpacing = 0.sp
    ),
    displaySmall = TextStyle(
        fontFamily = Questrial,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    )
)