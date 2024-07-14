package eu.tutorial.kotlinbasics

class Dog(val name: String, val breed: String) {
    init{
        bark()
    }

    private fun bark() {
        println("$name says woof woof")
    }
}