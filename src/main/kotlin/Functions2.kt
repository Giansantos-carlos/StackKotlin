fun main() {
    val max = getMax(5,9)
    println(max)
}

fun getMax(a: Int, b:Int): Int = if (a > b) a else b
