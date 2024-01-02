class Cars(name: String, model: String, color: String, doors : Int) {
    var name = name
    var model = model
    var color = color
    var doors = doors

    fun move() {
        println("The car of $name is moving")
    }

    fun stop() {
        println("The car of $name is stSopped")
    }
}