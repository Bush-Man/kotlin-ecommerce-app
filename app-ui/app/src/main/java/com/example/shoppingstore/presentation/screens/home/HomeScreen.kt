package com.example.shoppingstore.presentation.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.shoppingstore.presentation.screens.categories.CategoriesScreen
import com.example.shoppingstore.presentation.screens.home.components.BottomNavigationBar
import com.example.shoppingstore.presentation.screens.home.components.DeliveryLocationSearch
import com.example.shoppingstore.presentation.screens.home.components.MostPopularProductsHorizontalScroller
//import com.example.shoppingstore.presentation.screens.home.components.HomeScreenScroll
import com.example.shoppingstore.presentation.screens.home.components.QuickLinks
import com.example.shoppingstore.presentation.screens.home.components.SearchComponent
import com.example.shoppingstore.presentation.screens.home.components.SingleProductScreen
import com.example.shoppingstore.presentation.screens.home.components.TwoColumnGridWithLazyColumn


@Composable
fun HomeScreen(modifier: Modifier){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { SearchComponent(modifier =modifier ) },
        bottomBar = { BottomNavigationBar(modifier = modifier)}

        ) {
        Column(modifier.padding(it)) {
            Spacer(modifier.height(10.dp))
            DeliveryLocationSearch(modifier = modifier)
            Spacer(modifier.height(10.dp))

            QuickLinks(modifier = modifier)
            Spacer(modifier.height(10.dp))
            CategoriesScreen(modifier = Modifier)
//            SingleProductScreen(modifier = Modifier)
//            TwoColumnGridWithLazyColumn()
        }



    }
}
