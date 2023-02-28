package com.example.portalberita.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Box(modifier = Modifier
        .background(colorResource(id = androidx.appcompat.R.color.material_grey_800))
        .fillMaxSize()
    ) {
        Column {
            GreetingSection()
            ChipSection(chips = listOf("Beranda", "Trending"))
            isiberita()
        }
    }
}

@Composable
fun GreetingSection(
    name: String = "admin"
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .background(colorResource(id = androidx.appcompat.R.color.material_grey_900))
            .padding(15.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "PORTAL BERITA",
                style = MaterialTheme.typography.h2,
                color = Color.White,
                fontSize = 30.sp,
                textAlign = TextAlign.Center
            )

//            Text(
//                text = "BERANDA",
//                style = MaterialTheme.typography.h1
//            )
//            Text(
//                text = "TRENDING",
//                style = MaterialTheme.typography.h1
//            )
        }



//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(colorResource(id = R.color.material_grey_800))
//            .wrapContentSize(Alignment.Center)
//    ) {
//        Text(
//            text = "Article Screen",
//            fontWeight = FontWeight.Bold,
//            color = Color.White,
//            modifier = Modifier.align(Alignment.CenterHorizontally),
//            textAlign = TextAlign.Center,
//            fontSize = 20.sp
//        )
//        Image(
//            painter = painterResource(id = R.drawable.flower),
//            contentDescription = "",
//            contentScale = ContentScale.Crop,
//            modifier = Modifier.fillMaxSize()
//        )
    }
}

@Composable
fun isiberita() {
    Column(
        modifier = Modifier
            .padding(30.dp)
            .fillMaxWidth()
            .wrapContentSize(Alignment.Center)
            .clickable(onClick = { })
            .clip(shape = RoundedCornerShape(16.dp)),
    ) {
        Box(
            modifier = Modifier
                .size(350.dp)
                .background(colorResource(id = androidx.appcompat.R.color.material_grey_900))
                .border(
                    width = 4.dp,
                    color = colorResource(id = androidx.appcompat.R.color.material_grey_600),
                    shape = RoundedCornerShape(16.dp)
                )
            
        ) {
            Column() {
            Text(
                "A Space for the Unbound akhirnya rilis! Terima kasih atas dukungannya untuk semua yang sudah memberikan tim kami support selama ini.",
                Modifier.padding(16.dp),
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 25.sp,
                style = MaterialTheme.typography.h1
            )
            Text(
                "Baca Lebih Lanjut!",
                Modifier.padding(16.dp),
                textAlign = TextAlign.Center,
                color = Color.Cyan,
                fontSize = 20.sp,
                style = MaterialTheme.typography.body1
            )  }
        }
    }
}

@Composable
fun ChipSection(
    chips: List<String>
) {
    var selectedChipIndex by remember {
        mutableStateOf(0)
    }
    LazyRow {
        items(chips.size) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable {
                        selectedChipIndex = it
                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(colorResource(id = androidx.appcompat.R.color.material_grey_900))
                    .padding(15.dp)
            ) {
                Text(text = chips[it],
                color = colorResource(id = androidx.appcompat.R.color.material_grey_50))
            }
        }
    }
}

//@Composable
//fun ImageCard(
//    painter: Painter,
//    contentDescription: String,
//    title: String,
//    modifier: Modifier = Modifier
//) {
//    Card(
//        modifier = modifier.fillMaxWidth(),
//        shape = RoundedCornerShape(15.dp),
//        elevation = 5.dp
//    ) {
//        Box(modifier = Modifier.height(200.dp)) {
//            Image(
//                painter = painter,
//                contentDescription = contentDescription,
//                contentScale = ContentScale.Crop
//            )
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(12.dp),
//                contentAlignment = Alignment.BottomStart,
//                content = {
//                    val painter = painterResource(id = R.drawable.)
//                }
//            )
//        }
//    }
//}
//


//@Composable
//fun HomeScreen(name: String) {
//    Text(text = "Hello $name!")
//}
//
//@Composable
//fun Greeting(str: String) = print(str)
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    PortalBeritaTheme {
//        Greeting("Android")
//    }
//}