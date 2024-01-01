fun main() {
    var number = 1
    val lastNumber = 20
    var evenNumberCounter = 0

    while (number <= lastNumber) {
        number++

        if (!isEvenNumber(number)) {
            continue
        }

        evenNumberCounter++
        println(number)
    }
    println("Total number of even numbers found = $evenNumberCounter")
}

fun isEvenNumber(number: Int): Boolean {
    return (number % 2) == 0
}