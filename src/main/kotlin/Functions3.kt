fun main(){
  sedMessage(name = "gian")
}

fun sedMessage(name: String, message: String = sendText()) {
    println("name = $name and messafe = $message")
}

fun sendText(): String = "Some Text"