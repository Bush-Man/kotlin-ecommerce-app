package com.example.shoppingstore.presentation.screens.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun HomeScreenWithPagination(modifier: Modifier) {
    // Simulated state for items and loading
    val items = remember { mutableStateListOf<Product>() }
    var isLoading by remember { mutableStateOf(false) }

    // Simulate loading data
    LaunchedEffect(Unit) {
        loadMoreItems(items)
    }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(items) { product ->
            ProductItem(product)
        }

        // Loading indicator
        item {
            if (isLoading) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            }
        }
    }

    // Detect end of list
    val listState = rememberLazyListState()
    LaunchedEffect(listState) {
        snapshotFlow { listState.layoutInfo.visibleItemsInfo }
            .collect { visibleItems ->
                val lastVisibleItemIndex = visibleItems.lastOrNull()?.index
                if (!isLoading && lastVisibleItemIndex == items.lastIndex) {
                    isLoading = true
                    loadMoreItems(items) // Simulate loading more items
                    isLoading = false
                }
            }
    }
}

@Composable
fun ProductItem(product: Product) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),

    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(product.name, style = MaterialTheme.typography.bodyMedium)
            Text(product.price, style = MaterialTheme.typography.bodyMedium)
        }
    }
}

data class Product(val name: String, val price: String)

suspend fun loadMoreItems(items: SnapshotStateList<Product>) {
    delay(2000) // Simulate network delay
    val startIndex = items.size
    val newItems = List(10) { index ->
        Product(name = "Product ${startIndex + index}", price = "$${(startIndex + index) * 10}")
    }
    items.addAll(newItems)
}
