fun main() {
    val car1 = Cars("Tesla", "Model s", "Green", 4)
    val car2 = Cars("Audi", "A5", "red", 5)
    //----------------car1-------------------
    println(car1.name)
    println(car1.model)
    println(car1.color)
    println(car1.doors)
    println(car1.move())
    //----------------- car2--------------
    println(car2.name)
    println(car2.model)
    println(car2.color)
    println(car2.doors)
    println(car2.stop())
}