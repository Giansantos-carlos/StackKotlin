fun main (){
    val numbersString = listOf("one", "two", "three", "four", "five", "six")

    println(numbersString.slice(1..3))
    println(numbersString.slice(0..4 step 2))
    println(numbersString.slice(setOf(3,0,5)))

    println("\n")

    println(numbersString.take(3))
    println(numbersString.takeLast(3))
    println(numbersString.drop(1))
    println(numbersString.dropLast(5))

    println("\n")

    println(numbersString.takeWhile { !it.startsWith("f") })
    println(numbersString.takeWhile { !it.startsWith("three") })
    println(numbersString.takeWhile { it.length == 3})
    println(numbersString.takeWhile { it.contains("i") })


    val numbers = (0..13).toList()

    println(numbers.chunked(3))
    println(numbers.chunked(3){it.sum()})

}