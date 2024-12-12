package com.example.shoppingstore.presentation.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoppingstore.R

@Composable
fun ProductCard(modifier: Modifier){
    Box(modifier = modifier
        .width(200.dp)
        .height(300.dp)

    ) {
        Column {
            Box(
                modifier = modifier
                    .width(200.dp)
                    .height(200.dp)

                ,
                contentAlignment = Alignment.Center

            ) {
                Image(
                    painter = painterResource(id = R.drawable.speaker),
                    contentDescription = "image",
                    contentScale = ContentScale.Fit
                )
            }
            Spacer(modifier = modifier.height(10.dp))
            Column(modifier.padding(start = 6.dp, end = 4.dp)){
            Text(text = "speaker very clear audio output + wifi + bluetooth and a heavy base", maxLines = 2, overflow = TextOverflow.Ellipsis)
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "KES 200")
                Spacer(modifier = modifier.width(30.dp))
                Text(
                    text = "KES 250",
                    style = TextStyle(textDecoration = TextDecoration.LineThrough, fontSize = 11.sp)
                )
            }
            }
        }
    }
}