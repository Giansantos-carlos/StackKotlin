fun main () {
    val numbers = mutableListOf<Int>(2,5,6,7,8,9,10,222,555,100)
    numbers.sorted().forEach { println(it) }


    val lapTops = mutableListOf(
        Laptop("Dell", 2021,8,600),
        Laptop("Acer", 2020,9,800),
        Laptop("Apple", 2022,4,1000)
    )

    println("\n")
    lapTops.sorted().forEach { println(it) }
    println("\n")

    println("\n")
    lapTops.sortedWith(ComparatorRam()).forEach { println(it) }
    println("\n")

    lapTops.sortedWith(ComparatorYaer()).forEach { println(it) }

}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int) : Comparable<Laptop> {
    override fun compareTo(other: Laptop): Int {
        return if (this.price >  other.price) {
            println("In if statment: Swapping ${this.brand} with ${other.brand}")
            1
        } else if (this.price < other.price) {
            println("In if statment: Swapping ${this.brand} with ${other.brand}")
            -1
        }else {
            0
        }
    }
}

class ComparatorRam : Comparator<Laptop>{
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if (laptop1.ram > laptop2.ram){
            return 1
        }else if (laptop1.ram < laptop2.ram){
            return -1
        } else {
            return 0
        }
    }
}

class ComparatorYaer : Comparator<Laptop> {
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if (laptop1.year > laptop2.year){
            return 1
        }else if (laptop1.year < laptop2.year){
            return -1
        } else {
            return 0
        }
    }
}