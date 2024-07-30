package eu.tutorial.musicappui

import androidx.annotation.DrawableRes

sealed class Screen(val title: String, val route: String) {

    sealed class DrawerScreen(val dTitle: String, val dRoute: String, @DrawableRes val ico: Int)
        : Screen(dTitle, dRoute){
            object Account: DrawerScreen(
                "Account",
                "account",
                R.drawable.ic_account
            )
        
        }
}