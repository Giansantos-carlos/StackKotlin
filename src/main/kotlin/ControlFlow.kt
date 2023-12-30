fun main(){
    val alarm = 8

    val text = when (alarm) {
        in  1 .. 10 ->{
                "this number is in the range 1 .. 10"
        }
        12,7,14 -> {
            "the time is $alarm"
        }
         else -> {
            "The time is alarm $alarm "
        }
    }
    println(text)
}

