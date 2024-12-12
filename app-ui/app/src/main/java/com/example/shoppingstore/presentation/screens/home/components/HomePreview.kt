package com.example.shoppingstore.presentation.screens.home.components

import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomePreview(modifier: Modifier) {
    val pageState = rememberPagerState(initialPage = 0, pageCount = { 4 })
    HorizontalPager(state =pageState ) {

    }
}