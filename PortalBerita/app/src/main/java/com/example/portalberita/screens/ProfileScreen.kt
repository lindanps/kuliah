package com.example.portalberita.screens

import androidx.appcompat.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {
    Box(modifier = Modifier
        .background(colorResource(id = R.color.material_grey_800))
        .fillMaxSize()
    ) {
        Column {
            GreetingSection()
            ChipSection(chips = listOf("Beranda", "Trending"))
            Profil()
        }
    }
}

@Composable
fun Profil(
    name: String = "admin"
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = androidx.appcompat.R.color.material_grey_800))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Halo $name",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}