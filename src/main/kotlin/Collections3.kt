fun main(){
    val numbers = listOf("one", "two", "three", "four")
    val langerThan3 = numbers.filter { it.length > 3 }
    println(langerThan3)

    val numbersMap = mapOf("key 1" to 1, "key 2 " to 2, "key 3 " to 3, "key 101" to 101)
    val filteredMap = numbersMap.filter { it.key.endsWith("1") && it.value > 100 }
    println(filteredMap)

    val filteredIdx = numbers.filterIndexed { index, value ->(index != 0) &&  (value.length < 5) }
    val filteredNot = numbers.filterNot { it.length <= 3 }

    println(filteredIdx)
    println(filteredNot)

    val mixedList =  listOf(1,2,3,4,5,6,7,8,9, 'A', 'b','C',"Hellow Word", "Gian", false, true)
    mixedList.filterIsInstance<Char>().forEach { println(it) }

    // Portition

    println("\n")

    val (match, rest ) = numbers.partition { it.length > 3 }
    println(match)
    println(rest)

    println(numbers.any { it.endsWith("e") })
    println(numbers.none { it.endsWith("w") })
    println(numbers.all { it.length > 1 })

}