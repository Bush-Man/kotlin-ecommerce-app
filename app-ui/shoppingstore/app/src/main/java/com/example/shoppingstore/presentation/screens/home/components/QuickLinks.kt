package com.example.shoppingstore.presentation.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun QuickLinks(modifier: Modifier){
    val items = listOf("Home","Promotions","Food Market","Home Upgrade","Help")
   LazyRow() {
       items(items) { item ->
           ListItem(item = item)
       }


   }
       
   }


@Composable
fun ListItem(item: String) {
    Text(
        text = item,
        modifier = Modifier
            .padding(16.dp)
            .background(Color.LightGray)
            .padding(16.dp),

    )
}
