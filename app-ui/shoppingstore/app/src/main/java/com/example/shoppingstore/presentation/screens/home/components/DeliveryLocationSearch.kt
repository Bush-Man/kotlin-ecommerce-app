package com.example.shoppingstore.presentation.screens.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DeliveryLocationSearch(modifier: Modifier){
Row(modifier=modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment=Alignment.Bottom) {
    Row {
        Icon(imageVector = Icons.Outlined.LocationOn, contentDescription = "location icon")
        Text(text = "Deliver to:")
    }
    Row {
        OutlinedTextField(value = "Nairobi,Kenya", onValueChange = { /*location changer*/ },modifier= modifier
            .width(150.dp)
            .height(50.dp))
      Spacer(modifier = modifier.width(10.dp))
       Button(onClick = { /*TODO*/ }) {
            Text(text = "Change")
       }
    }

}
}