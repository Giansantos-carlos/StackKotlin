fun main(){
    println(sum(5,6,7,8,9,4,2,3,1,6,5,9))
    sum2(1,2,3,4,5,6,9,3,5,6)
}

fun sum(vararg numbers : Int): Int {
    var result = 0
    for (number in numbers){
        result += number
    }
    return result
}

fun sum2(vararg numbers : Int ) {
    numbers.forEach { println(it) }
}