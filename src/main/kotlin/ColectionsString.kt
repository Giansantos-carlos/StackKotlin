fun main (){

    val numbersString = listOf("One", "Two", "Three", "Four")

    println(numbersString)

    println(numbersString.joinToString())

    val listString = StringBuffer("The list of numbers : ")
    println(numbersString.joinTo(listString))

    println(numbersString.joinToString(" | ", "Start: ", ": end"))

    var init = 1
    var end = 1000

    val numbers2 = init..end
    val numbers = 1..100

    println(numbers.toList())

    numbers.forEach { println(it) }

    numbers2.forEach { println(it) }
}