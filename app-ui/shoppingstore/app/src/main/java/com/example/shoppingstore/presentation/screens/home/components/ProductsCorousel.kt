package com.example.shoppingstore.presentation.screens.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun ProductsCorousel(modifier: Modifier){
    val categories= listOf("cat1","cat2","cat3","cat4","cat5")
    Column {

        LazyRow{
            items(categories){category->
                ProductCard(modifier = modifier)
                Spacer(modifier = Modifier.width(20.dp))


            }


        }

    }

}