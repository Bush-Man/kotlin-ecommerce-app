package com.example.shoppingstore.presentation.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoppingstore.R
import com.example.shoppingstore.presentation.components.OnOfferCard
import com.example.shoppingstore.presentation.screens.singleproduct.components.NavigationTabs

@Composable
fun SingleProductScreen(modifier: Modifier) {
//    val reviews = (0..5).toList()
    val reviews = List(5) { 1 } // Simulating 5-star reviews
    LazyColumn (modifier.padding(start = 15.dp, end = 15.dp),){
        item {
                Column(
                    modifier
                        .fillMaxSize(),

                    verticalArrangement = Arrangement.spacedBy(10.dp)) {

                   Box(contentAlignment = Alignment.Center, modifier = modifier.fillMaxWidth()) {
                       Image(
                           painter = painterResource(id = R.drawable.speaker),
                           contentDescription = "",
                           contentScale = ContentScale.Fit
                       )
                   }
                    Spacer(modifier.height(10.dp))
                    Text(
                        text = "speaker very clear audio output + wifi + bluetooth and a heavy base",
                        maxLines = 5,
                        overflow = TextOverflow.Ellipsis,
                        fontSize = 20.sp,
                        letterSpacing = 1.sp,
                        fontWeight = FontWeight.Normal
                    )
                    Spacer(modifier.height(10.dp))

                    Row {
                        reviews.forEach { _ ->
                            run {
                                Icon(
                                    imageVector = Icons.Outlined.Star,
                                    contentDescription = "Review star",
                                    tint = Color.LightGray,
                                    modifier = Modifier.size(20.dp)
                                )
                            }

                        }
                        Text(text = "(0 Reviews)")
                    }
                }
            Spacer(modifier.height(10.dp))
            
            Text(
                text = "The difference is in lexer we create a new vec to add the generated tokens while in the parser, the Ast holds all the generated statements so we dont have to manually do that.\n" +
                        "\n" +
                        "To visualize the statements in the Ast, we need to visit each one by one and display its contents.\n",
                maxLines = 10,
                overflow = TextOverflow.Ellipsis,
                fontSize = 15.sp,
                letterSpacing = 1.sp,
                fontWeight = FontWeight.Normal
            )


        }
        item {
            Spacer(modifier = modifier.height(20.dp))
        }
        item { 
            OnOfferCard(modifier = modifier)
        }
        item {
            Spacer(modifier = modifier.height(20.dp))
        }
        item {
            NavigationTabs(modifier = Modifier)
        }
        item {
            Spacer(modifier = modifier.height(20.dp))
        }
        item {
           ProductsCorousel(modifier = modifier)
        }

    }
}