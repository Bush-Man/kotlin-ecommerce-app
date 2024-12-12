package com.example.shoppingstore.domain

data class Data(
    val promos: List<String> = listOf("promo 1", "promo 2"),
    val foodCupboard: List<String> = listOf("Food Cupboard 1", "Food Cupboard 2"),
    val freshFood: List<String> = listOf("Fresh Food 1", "Fresh Food 2", "Fresh Food 3"),
    val babyAndKids: List<String> = listOf("Baby & Kids 1", "Baby & Kids 2", "Baby & Kids 3"),
    val beverage: List<String> = listOf("Beverage 1", "Beverage 2", "Beverage 3"),
    val electronics: List<String> = listOf("Electronics 1", "Electronics 2", "Electronics 3"),
    val cleaning: List<String> = listOf("Cleaning 1", "Cleaning 2", "Cleaning 3"),
    val beautyAndCosmetics: List<String> = listOf("Beauty & Cosmetics 1", "Beauty & Cosmetics 2"),
    val liquor: List<String> = listOf("Liquor 1", "Liquor 2"),
    val stationery: List<String> = listOf("Stationery 1", "Stationery 2")

)