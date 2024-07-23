package eu.tutorial.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = ""
)

object DammyWish{
    val wishList = listOf(
        Wish(title = "Meta 2",
            description = "it is a vr"),
        Wish(title = "Meta 3",
            description = "it is a vr"),
        Wish(title = "mac book",
            description = "it is a pc")
    )
}
