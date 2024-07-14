package eu.tutorial.kotlinbasics

class Book(val title: String = "Unknown", val author: String = "Anonymous", val yearPublished: Int = 2024) {

}

fun main(){
    val myBook = Book()
    println(myBook.title)
}