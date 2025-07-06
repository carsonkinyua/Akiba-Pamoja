package com.kinyua_carson.akibapamoja.signup.presentation

import androidx.compose.foundation.MutatePriority
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CustomInputFieldWithLabel(
    label : String,
    value :String,
    onValueChange :(String) -> Unit,
    modifier: Modifier =Modifier
){
    Column(
        modifier = Modifier
            .width(335.dp)
            .height(66.dp),
        verticalArrangement =  Arrangement.spacedBy(8.dp)

    ){
        Text(
            text = label,
            fontSize =  14.sp,
            color = Color(0xFF303030),
            fontWeight = FontWeight.Normal,
            // didnt find geist but we are supposed to used geist for fontweight , we will remember
        )
        Box(
            modifier = Modifier
                .width(335.dp)
                .height(40.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Color(0xffE9E9E9))
                .padding(horizontal = 12.dp, vertical = 6.dp),

        )
        {
            BasicTextField(
                value = value,
                onValueChange = onValueChange,
                textStyle = TextStyle(
                    fontSize = 14.sp,
                    color = Color.Black
                ),
                singleLine = true,
                modifier = Modifier.fillMaxSize()
            )
    }
}}
//check on this and fix it............
@Composable
fun PasswordInputFieldWithHint(
    password: String,
    onPasswordChange: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .width(335.dp)
            .height(100.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ){
    Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .background(Color(0xFFE9E9E9)) // Change to your desired color
            ) {
        CustomInputFieldWithLabel(
            label = "Password",
            value = password,
            onValueChange = onPasswordChange
        )
    }

    Text(
            text = "Your password should be at least 8 characters long with one special character ($, #, !, *, &, @)",
            fontSize = 10.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xFF5A5A5A),
            modifier = Modifier.width(214.dp)
        )
    }
}
