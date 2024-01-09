fun main(){
    println(searchElement(7, mutableListOf(0,1,5,9,4,6,22,33,666,55,7,5)))
}

private fun searchElement(eleemnt:Int, numbers: MutableList<Int>): Int {
    for (number in numbers){
        if (number == eleemnt){
            return number
        }
    }
    return -1
}