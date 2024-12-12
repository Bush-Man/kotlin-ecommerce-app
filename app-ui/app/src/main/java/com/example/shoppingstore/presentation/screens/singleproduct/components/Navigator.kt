package com.example.shoppingstore.presentation.screens.singleproduct.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun NavigationTabs(modifier: Modifier) {
    val tabs = listOf("Description", "Delivery", "Reviews")
    var selectedTab by remember { mutableStateOf(0) }
    Column {

        TabRow(selectedTabIndex = selectedTab, modifier = modifier.fillMaxWidth()) {
            tabs.forEachIndexed { index, tab ->
                Tab(
                    selected = tab == tabs[index],
                    onClick = { selectedTab = index },
                    text = { Text(tab) })

            }
        }
        Spacer(modifier = modifier.height(20.dp))
        when (selectedTab) {
            0 -> DisplayProductDescription()
            1 -> DisplayPolicy()
            3 -> DisplayReviews()

        }


    }
}
    @Composable
    fun DisplayProductDescription() {
        Text(text = "LDA spec shows that 0xA9 has one parameter c0.The instruction size is 2 bytes: one byte is for the operation code itself  and the other is for a parameter.")
    }

    @Composable
    fun DisplayPolicy() {
        Text(text = "LDA spec shows that 0xA9 has one parameter c0.The instruction size is 2 bytes: one byte is for the operation code itself  and the other is for a parameter.")
    }

    @Composable
    fun DisplayReviews() {
        Text(text = "LDA spec shows that 0xA9 has one parameter c0.The instruction size is 2 bytes: one byte is for the operation code itself  and the other is for a parameter.")
    }
