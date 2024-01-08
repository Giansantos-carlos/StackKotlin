fun main () {
    val numbres =  listOf("one", "two ", "three", "four")
    println(numbres.associateWith { it.length })
    println(numbres.associateWith { it.first().uppercase() })
    println(numbres.associateBy ({ it.first().uppercase() }, valueTransform = {it.length}))

    // Flatten

    val numbersSet = listOf(listOf(1,2,3), listOf(4,5,6), listOf(7,8,9))
    println(numbersSet[2][2])

    for (numbers in numbersSet){
        for (number in numbers){
            println(number)
        }
        println("\n")
    }

    val numbersFlatten = numbersSet.flatten()
    //println(numbersFlatten[8])

    for (number in numbersFlatten){
        println(number)
    }

}