fun main() {
    val numbers = mutableListOf<Int>(2,5,6,7,8,9,10,222,555,100)
    numbers.sorted().forEach { println(it) }


    val lapTops = mutableListOf(
        Laptop2("Dell", 2021,8,600),
        Laptop2("Acer", 2020,9,800),
        Laptop2("Apple", 2022,4,1000)
    )

    lapTops.sortedWith(compareBy { it.price }).forEach { println(it) }
    println("-----------------------------------------------------------------------------------------------------------------")

    lapTops.sortedWith(compareBy { it.ram }).forEach { println(it) }

    println("-----------------------------------------------------------------------------------------------------------------")

    lapTops.sortedWith(compareBy { it.year }).forEach { println(it) }
}


 data class Laptop2(val brand: String, val year: Int, val ram: Int, val price: Int)