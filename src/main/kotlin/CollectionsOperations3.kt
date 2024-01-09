fun main() {

    val numbers = listOf(6, 10, 14, 100)
    println("the sum is ${numbers.sum()}")
    println("The cout is ${numbers.count()}")
    println("The avarege is ${numbers.average()}")
    println("the max value is: ${numbers.maxOrNull()}")
    println("the min value is ${numbers.minOrNull()}")
    println("the sum is ${numbers.sumOf { it * 2 }}")
}