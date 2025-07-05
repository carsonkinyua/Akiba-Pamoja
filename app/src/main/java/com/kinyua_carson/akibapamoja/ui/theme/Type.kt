package com.kinyua_carson.akibapamoja.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.kinyua_carson.akibapamoja.R


val fontFamily = FontFamily(
    Font(R.font.geist_black, weight = FontWeight.Black),
    Font(R.font.geist_bold, weight = FontWeight.Bold),
    Font(R.font.geist_extrabold, weight = FontWeight.ExtraBold),
    Font(R.font.geist_extralight, weight = FontWeight.ExtraLight),
    Font(R.font.geist_light, weight = FontWeight.Light),
    Font(R.font.geist_medium, weight = FontWeight.Medium),
    Font(R.font.geist_regular, weight = FontWeight.Normal),
    Font(R.font.geist_semibold, weight = FontWeight.SemiBold),
    Font(R.font.geist_thin, weight = FontWeight.Thin)
)

val AppTypography = Typography(
    bodySmall = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    labelMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Normal,
    ),
    headlineMedium = TextStyle(
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )
)

