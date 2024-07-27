package eu.tutorial.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo("wish-title")
    val title: String = "",
    @ColumnInfo("wish-desc")
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
