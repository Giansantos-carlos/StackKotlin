fun main() {
    val car1 = Car()
    val car2 = Car()

    car1.name =  "tesla"
    car1.model = "model s"
    car1.color = "gren"
    car1.doors = 4

    car2.name =  "Mercedez"
    car2.model = "s63"
    car2.color = "black"
    car2.doors = 5


}

class Car {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move() {
        println("The car of $name is moving")
    }

    fun stop() {
        println("The car of $name is stSopped")
    }
}