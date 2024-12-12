package com.example.shoppingstore.presentation.screens.home.components


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun BottomNavigationBar(modifier: Modifier) {
//    var selectedItem by remember { mutableIntStateOf(0) }


    var selectedItem by remember { mutableIntStateOf(0) }
    NavigationBar( containerColor =Color.LightGray ) {
        NavItemsList().forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedItem == index,
                onClick = { selectedItem = index },
                label = { Text(text = item.name) },
                icon = { Icon(imageVector = item.icon, contentDescription = item.name) },
                colors = NavigationBarItemColors(
                    selectedIconColor = Color.Red,
                    unselectedIconColor = Color.Black,
                    selectedTextColor = Color.Red,
                    unselectedTextColor = Color.Black,
                    disabledIconColor = Color.Gray,
                    disabledTextColor = Color.Gray,
                    selectedIndicatorColor = Color.Blue
                )
            )
        }
    }

}
data class navItem(
    val icon: ImageVector,
    val name:String,
    val onClick: () -> Unit
)
@Composable
private fun NavItemsList(): List<navItem> {
    return listOf(
        navItem(
            icon = Icons.Outlined.Home,
            name = "Home",
            onClick = {}
        ),
        navItem(
            icon = Icons.Outlined.Star,
            name = "Catalog",
            onClick = {}
        ),
        navItem(
            icon = Icons.Outlined.Info,
            name = "Promotions",
            onClick = {}
        ),
        navItem(
            icon = Icons.Outlined.ShoppingCart,
            name = "Cart",
            onClick = {}
        ),
        navItem(
            icon = Icons.Outlined.Person,
            name = "Account",
            onClick = {}
        )


    )

}
