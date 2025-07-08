package com.kinyua_carson.akibapamoja.signup.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TitleText() {
    Box(
        modifier =
            Modifier
                .width(226.dp)
                .height(42.dp)
                .offset(x = 21.dp, y = 99.dp),
    ) {
        Text(
            buildAnnotatedString {
                append("You are signing up to join the ")
                withStyle(style = SpanStyle(fontWeight = FontWeight.SemiBold)) {
                    append("Akili Dada Chama")
                }
            },
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xFF303030),
        )
    }
}

@Composable
fun SignUpAgreementSection(onSignUpClick: () -> Unit) {
    Column(
        modifier =
            Modifier
                .width(335.dp)
                .height(120.dp)
                .padding(start = 20.dp, bottom = 53.dp),
        verticalArrangement = Arrangement.spacedBy(23.dp),
    ) {
        Box(
            modifier =
                Modifier
                    .width(335.dp)
                    .height(48.5.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFF4107A5))
                    .clickable { onSignUpClick() },
            contentAlignment = Alignment.Center,
        ) {
            Text(text = "Join", fontSize = 14.sp, color = Color.White, fontWeight = FontWeight.Medium)
        }
        Box(
            modifier =
                Modifier
                    .width(294.dp)
                    .height(48.5.dp),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                buildAnnotatedString {
                    append("By clicking Sign up, you agree to Akili Dada’s ")
                    withStyle(
                        style =
                            SpanStyle(
                                fontWeight = FontWeight.Medium,
                                color = Color(0xFF4107A5),
                            ),
                    ) {
                        append("Constitution")
                    }
                    append(" and ")
                    withStyle(
                        style =
                            SpanStyle(
                                fontWeight = FontWeight.Medium,
                                color = Color(0xFF4107A5),
                            ),
                    ) {
                        append("Privacy Policy")
                    }
                    append(" and you acknowledge that 10% of your begging proceeds goes to Begr.")
                },
                fontSize = 10.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xFF4107A5),
                lineHeight = 10.sp,
            )
        }
    }
}
