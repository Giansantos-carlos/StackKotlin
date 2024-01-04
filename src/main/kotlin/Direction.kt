enum class Directionvar( var directon: String, var distance : Int) {

    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 5);


    fun printData(){
       println("Direction =  $directon distance = $distance name = $name ")
    }
}