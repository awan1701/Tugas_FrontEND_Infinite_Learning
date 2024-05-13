package com.infinitelearning.infiniteapp.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Koleksi: Screen("koleksi")
    data object About: Screen("about")
    data object Detail: Screen("detail_produk")
}