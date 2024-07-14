package eu.tutorial.kotlinbasics

fun main(){
    //Immutable list
//    val shoppingList = listOf("Processor", "RAM", "Graphics Card", "SSD")
    //Mutable list
    val shoppingList = mutableListOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")

    //adding items to lists
    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX 3060")
    shoppingList.add(2,"Graphics Card RTX 4090")
    println(shoppingList)
    shoppingList[2] = "Graphics Card RTX 4090XT"
    println(shoppingList)
    shoppingList.set(4, "Water Cooling System")
    println(shoppingList)



}












/*

data class CoffeeDetails(
    val sugarCount:Int,
    val name: String,
    val size: String,
    val creamAmount:Int
)

fun askCoffeeDetails(){
    println("Who is this coffee for")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()

    // Call Function
    //makeCoffee(sugarCountInt,name)
}

// Define Function
fun makeCoffee(coffeeDetails: CoffeeDetails){
    when (coffeeDetails.sugarCount) {
        0 -> {
            println("Coffee with no sugar for ${coffeeDetails.name}and cream:" +
                    "${coffeeDetails.creamAmount}")
        }
        1 -> {
            println("Coffee with ${coffeeDetails.sugarCount} " +
                    "spoon of sugar for ${coffeeDetails.name} and cream:" +
                    "${coffeeDetails.creamAmount}")
        }
        else -> {
            println("Coffee with ${coffeeDetails.sugarCount} " +
                    "spoons of sugar for ${coffeeDetails.name}and cream:" +
                    "${coffeeDetails.creamAmount}")
        }
    }
}

*/