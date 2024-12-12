package com.example.shoppingstore.presentation.screens.categories

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoppingstore.domain.categories

@Composable
fun CategoriesScreen(modifier: Modifier){
    var selectedTab by remember{ mutableStateOf(0) }

   val categories = listOf("Promos","Food Cupboard","Fresh Food","Baby & Kids","Electronics","Cleaning","Beauty & Cosmetics","Liquor","Stationery")
    val data :HashMap<String,List<String>> = HashMap();

    when(categories[selectedTab]){
        categories[0] ->{
            data[categories[selectedTab]] = listOf("promo 1", "promo 2")
        }
        categories[1] ->{
            data[categories[selectedTab]] = listOf("Food Cupboard 1", "Food Cupboard 2")
        }
        categories[2] ->{
            data[categories[selectedTab]] = listOf("Fresh Food 1", "Fresh Food 2", "Fresh Food 3")

        }
        categories[3] ->{
            data[categories[selectedTab]] = listOf("Baby & Kids 1", "Baby & Kids 2", "Baby & Kids 3")

        }
        categories[4] ->{
            data[categories[selectedTab]] = listOf("Electronics 1", "Electronics 2", "Electronics 3")

        }
        categories[5] ->{
            data[categories[selectedTab]] = listOf("Cleaning 1", "Cleaning 2", "Cleaning 3")

        }
        categories[6] ->{
            data[categories[selectedTab]] = listOf("Beauty & Cosmetics 1", "Beauty & Cosmetics 2")

        }
        categories[7] ->{
            data[categories[selectedTab]] = listOf("Liquor 1", "Liquor 2")

        }
        categories[8] ->{
            data[categories[selectedTab]] = listOf("Stationery 1", "Stationery 2")

        }
    }
    Text(text = "selected tab,$selectedTab")

    Row(modifier = modifier.fillMaxSize()){
        LazyColumn(modifier= modifier
            .width(100.dp)
            .fillMaxHeight()
        ) {
            items(categories.size){index ->
                TabItem(
                    modifier = modifier,
                    text = categories.elementAt(index),
                    onClick = {selectedTab = index},
                    isSelected = selectedTab == index
                )

            }

        }
        LazyColumn(modifier= modifier
            .weight(1f)
            .fillMaxHeight()
        ) {

            data[categories[selectedTab]]?.let { itemsList ->
                items(itemsList.size) { index ->
                    Text(itemsList[index])

                }


            }
        }

    }

}

@Composable
private fun TabItem(modifier: Modifier,text:String,onClick:()->Unit,isSelected:Boolean){
    Box(
        modifier
            .height(80.dp)
            .background(Color.LightGray)
            .fillMaxWidth()
            .padding(start = 9.dp)
            .clickable { onClick() },

        contentAlignment = Alignment.CenterStart) {
        Text(
            text = text,
            fontSize = 18.sp,
            color = if (isSelected)  Color.Blue else Color.Black
        )
    }
    Spacer(modifier = modifier.height(2.dp))

}

