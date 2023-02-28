package com.example.portalberita.screens

import androidx.appcompat.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ArticleScreen() {
    Box(modifier = Modifier
        .background(colorResource(id = R.color.material_grey_800))
        .fillMaxSize()
    ) {
        Column {
            GreetingSection()
            ChipSection(chips = listOf("Beranda", "Trending"))
            Artikel()
        }
    }
}

@Composable
fun Artikel() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = androidx.appcompat.R.color.material_grey_800))
            .wrapContentSize(Alignment.Center)
    ) {

        Column() {
            Text(
                "Game terbaru dari Mojiken Studio ini mendapat respons yang positif",
                Modifier.padding(10.dp),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.h1
            )
            Text(
                text = "Setelah menunggu cukup lama, akhirnya game indie A Space for the Unbound resmi dirilis. Dan kerennya, game buatan developer lokal Mojiken Studio ini mendapat perhatian yang besar dari gamer di seluruh dunia.\n" +
                        "\n" +
                        "Tidak hanya ramai dibicarakan, game ini juga banyak dimainkan oleh para gamer. Bahkan hanya dalam satu hari setelah dirilis, A Space for the Unbound langsung berhasil menempati peringkat 1 \"New & Trending\" di platform Steam.\n" +
                        "\n" +
                        "Hal ini tentu menjadi pencapaian besar baik bagi Mojiken Studio dan publisher Toge Production. Bahkan bisa dibilang hal tersebut menjadi salah satu pencapaian baru dari game lokal secara keseluruhan.",

                color = Color.White,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                fontSize = 18.sp
            )
        }
    }
}