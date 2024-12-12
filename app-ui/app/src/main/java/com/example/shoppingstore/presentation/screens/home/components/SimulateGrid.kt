package com.example.shoppingstore.presentation.screens.home.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Composable
fun TwoColumnGridWithLazyColumn(
    //onLoadMore: () -> Unit,
    modifier: Modifier = Modifier
) {
    val gridItems = remember { mutableStateListOf("A", "B", "C", "D","E") }
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

       item {

           MostPopularProductsHorizontalScroller(modifier)
       }
        item{
            ProductsCorousel(modifier = modifier)
        }

        // LazyColumn Section for Grid Items
        items(gridItems.chunked(2)) { rowItems ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                rowItems.forEach { item ->
                    ProductCard(modifier = modifier)
                }
                /*
                if (rowItems.size < 2) {
                    Spacer(modifier = Modifier.weight(1f))
                }
                */
                 
            }
        }

        /*
        // Trigger loading more items when reaching the end
         item {
             LaunchedEffect(Unit) {
                 onLoadMore()
             }
         }
         */
    }
}

//@Preview
//@Composable
//fun PreviewTwoColumnGridWithLazyColumn() {
//    MaterialTheme {
//        TwoColumnGridWithLazyColumn(
//            gridItems = List(6) { "Grid Item $it" },
//            listItems = List(20) { "List Item $it" },
//            modifier = Modifier.fillMaxSize()
//        )
//    }
//}
