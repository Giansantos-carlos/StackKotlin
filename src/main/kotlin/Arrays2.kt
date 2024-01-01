fun main() {
    var numbers = arrayOf(1, 2, 3, 6, 5, 8, 9, 7)
    println(maxNumber(numbers))
    println(minNumber(numbers))
    println(findMaxAndMin(numbers, true))
}

fun maxNumber(numbers: Array<Int>): Int {
    var max = numbers[0]

    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }
    return max
}

fun minNumber(numbers: Array<Int>): Int {
    var min = numbers[0]

    for (number in numbers) {
        if (number < min) {
            min = number
        }
    }
    return min
}

fun findMaxAndMin(numbers: Array<Int>, searchMax: Boolean): Int {

    var max = numbers[0]

    for (number in numbers) {
        if (searchMax) {
            if (number < max) {
                max = number
            }
        } else {
            if (number > max) {
                max = number
            }
        }
    }
    return max
}