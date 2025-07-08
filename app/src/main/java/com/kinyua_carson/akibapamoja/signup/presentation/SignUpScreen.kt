package com.kinyua_carson.akibapamoja.signup.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SignUpScreen() {
    Box(
        modifier =
            Modifier
                .fillMaxSize()
                .background(Color.White)
                .verticalScroll(rememberScrollState()),
    ) {
        TitleText()

        Column(
            modifier =
                Modifier
                    .width(335.dp)
                    .height(409.dp)
                    .offset(x = 20.dp, y = 164.dp),
            verticalArrangement = Arrangement.spacedBy(37.dp),
        ) {
            CustomInputFieldWithLabel(
                label = "First Name",
                value = "",
                onValueChange = {},
            )

            CustomInputFieldWithLabel(
                label = "Last Name",
                value = "",
                onValueChange = {},
            )

            CustomInputFieldWithLabel(
                label = "Password",
                value = "",
                onValueChange = {},
            )
            Text(
                text = "Your password should be at least 8 characters long with one special character ($, #, !, *, &, @)",
                fontSize = 10.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xFF5A5A5A),
                modifier = Modifier
                    .width(214.dp)
                    .height(26.dp)
            )

            CustomInputFieldWithLabel(
                label = "Confirm Password",
                value = "",
                onValueChange = {},
            )
        }
        SignUpAgreementSection(
            onSignUpClick = {
            },
        )

        BottomRoundedBox(
            onLoginClick = {
            },
        )
    }
}
