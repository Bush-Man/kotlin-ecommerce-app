package com.example.shoppingstore.presentation.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchComponent(modifier: Modifier){
    TopAppBar(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Green),
        title = {
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Check, contentDescription = "home button")

                }
                Spacer(modifier = modifier.width(10.dp))
                OutlinedTextField(
                    value ="search" ,

                    onValueChange = {},
                    trailingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "search icon",modifier=modifier.width(50.dp).height(50.dp))}

                })
                Spacer(modifier = modifier.width(10.dp))

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Outlined.Notifications, contentDescription = "notifications button",modifier=modifier.width(50.dp).height(50.dp))

                }


            }
        }

    )


}

