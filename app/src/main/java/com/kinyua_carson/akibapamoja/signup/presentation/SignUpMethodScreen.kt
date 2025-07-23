package com.kinyua_carson.akibapamoja.signup.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SignUpMethodScreen() {
    var selectedTab by remember { mutableStateOf("Phone") }

    Box(
        modifier =
            Modifier
                .fillMaxSize()
                .background(Color(0xFFF9F8F8)),
    ) {
        Column(
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(48.dp))

            // Back Arrow
            Row(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(bottom = 32.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.Black,
                    modifier = Modifier.size(24.dp),
                )
            }

            Text(
                text = "Create your account",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black,
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Register your account using either\nyour phone number or email",
                fontSize = 14.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Tabs
            Row(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                        .background(color = Color(0xFFF1EDF9), shape = RoundedCornerShape(12.dp)),
            ) {
                Box(
                    modifier =
                        Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .background(
                                if (selectedTab == "Phone") Color(0xFFE7DDFD) else Color.Transparent,
                                shape = RoundedCornerShape(12.dp),
                            )
                            .clickable { selectedTab = "Phone" },
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        text = "Phone",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                    )
                }
                Box(
                    modifier =
                        Modifier
                            .weight(1f)
                            .fillMaxHeight()
                            .background(
                                if (selectedTab == "Email") Color.White else Color.Transparent,
                                shape = RoundedCornerShape(12.dp),
                            )
                            .clickable { selectedTab = "Email" },
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        text = "Email",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black,
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Label
            Text(
                text = if (selectedTab == "Phone") "Phone number" else "Email address",
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .padding(bottom = 8.dp),
                color = Color.Black,
            )

            // Input Placeholder
            Box(
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .height(56.dp)
                        .background(Color(0xFFF3F3F3), shape = RoundedCornerShape(8.dp)),
                contentAlignment = Alignment.CenterStart,
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    if (selectedTab == "Phone") {
                        Text(
                            text = "KE +254",
                            color = Color.Gray,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(text = "|", color = Color.Gray)
                        Spacer(modifier = Modifier.width(8.dp))
                    }
                    Text(
                        text = if (selectedTab == "Phone") "Phone number" else "Email address",
                        color = Color.Gray,
                        fontSize = 14.sp,
                    )
                }
            }
        }

        // Bottom section
        Column(
            modifier =
                Modifier
                    .align(Alignment.BottomCenter)
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp, vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(
                onClick = { /* TODO */ },
                modifier =
                    Modifier
                        .fillMaxWidth()
                        .height(48.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF3F008F)),
                shape = RoundedCornerShape(8.dp),
            ) {
                Text(text = "Next", color = Color.White, fontSize = 16.sp)
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Terms
            Text(
                text =
                    buildAnnotatedString {
                        append("By clicking Sign up, you agree to Akiba Chama’s\n")
                        withStyle(style = SpanStyle(color = Color(0xFF3F008F))) {
                            append("Constitution")
                        }
                        append(" and ")
                        withStyle(style = SpanStyle(color = Color(0xFF3F008F))) {
                            append("Privacy Policy")
                        }
                        append(".")
                    },
                fontSize = 12.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center,
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Log in
            Text(
                text =
                    buildAnnotatedString {
                        append("Already a member? ")
                        withStyle(
                            style =
                                SpanStyle(
                                    color = Color(0xFF3F008F),
                                    textDecoration = TextDecoration.Underline,
                                ),
                        ) {
                            append("Log in")
                        }
                    },
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpMethodScreenPreview() {
    SignUpMethodScreen()
}
