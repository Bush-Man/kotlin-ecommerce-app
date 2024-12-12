package com.example.shoppingstore.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OnOfferCard(modifier: Modifier){
    Column(
        modifier
            .fillMaxWidth()
            .height(140.dp)
            .border(BorderStroke(width = 1.dp, color = Color.Red))
            .padding(5.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)

    ){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
                .background(Color.Red)
                .fillMaxWidth()
                .padding(5.dp)
        ) {
            Row{
                Icon(imageVector = Icons.Outlined.CheckCircle, contentDescription = " offer icon",tint =Color.White)
                Spacer(modifier = modifier.width(5.dp))
                Text(text = "On Offer", color = Color.White)
            }
            Row{
                Text(text = "Time Left:",color = Color.White)
                Spacer(modifier.width(3.dp))
                Text(text = "5d 14h 16m 5s",color = Color.White)
                
            }
            
            
        }
        Column(){
            Row(horizontalArrangement = Arrangement.spacedBy(5.dp), verticalAlignment = Alignment.CenterVertically){
                Text("KES 200", fontSize = 30.sp, fontWeight = FontWeight.SemiBold, color = Color.Green)
                Spacer(modifier = modifier.width(4.dp))
                Text("KES 300", fontSize = 20.sp, fontWeight = FontWeight.Normal, color = Color.Red, textDecoration = TextDecoration.LineThrough)
                Spacer(modifier = modifier.width(4.dp))
                Text(text = "Save KES 100",fontSize = 15.sp, fontWeight = FontWeight.Normal, color = Color.Gray)
            }
            Text(text = "13 items left")
            
        }
    }
    
    
}