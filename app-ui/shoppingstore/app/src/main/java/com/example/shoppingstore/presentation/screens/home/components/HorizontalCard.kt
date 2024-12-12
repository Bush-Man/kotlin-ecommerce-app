package com.example.shoppingstore.presentation.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp



@Composable
fun MostPopularProductsHorizontalScroller(modifier: Modifier) {
    val categories = listOf("cat1", "cat2", "cat3", "cat4", "cat5")
    Column {
        Text(text = "Most Popular:")
        Spacer(modifier = modifier.height(10.dp))
        LazyRow(horizontalArrangement = Arrangement.spacedBy(20.dp)) {
            items(categories) { category ->
                ParentCard(title = category, modifier = Modifier)
            }
        }
    }
}

@Composable
fun ParentCard(title: String, modifier: Modifier) {
    val itemsList = (0..3).toList()
    Card(
        modifier = modifier
            .padding(8.dp)
            .size(width = 320.dp, height = 300.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = title, style = MaterialTheme.typography.bodyMedium)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(8.dp)
                ) {
                    items(itemsList) {
                        Column(
                            modifier = Modifier
                                .padding(4.dp)
                                .height(120.dp)
                                .width(120.dp)
                                .background(Color.LightGray),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Filled.Build,
                                contentDescription = "image"
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(text = "Item $it")
                        }
                    }
                }
            }
        }
    }
}




/*
@Composable
fun MostPopularProductsHorizontalScroller(){
    val categories= listOf("cat1","cat2","cat3","cat4","cat5")
    Column {

        LazyRow{
            items(categories){category->
                ParentCard(title = category, modifier = Modifier)
                Spacer(modifier =Modifier.width(20.dp))


            }


        }

    }

}

@Composable
fun ParentCard(title:String,modifier: Modifier){
    val itemsList = (0..3).toList()
    val itemModifier = modifier
        .padding(4.dp)
        .height(150.dp)
        .width(50.dp)
        .background(Color.White)
    Card {


    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = title)
        Box(modifier=modifier.width(300.dp)){
            LazyVerticalGrid(columns = GridCells.Fixed(2)){
                items(itemsList) {
                    Column(itemModifier, verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(imageVector = Icons.Filled.Build, contentDescription ="image" )
                        Spacer(modifier = modifier.height(14.dp))
                        Text("Item is $it")
                        
                    }
                }


            }

        }
    }}


}
*/