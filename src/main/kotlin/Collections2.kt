fun main(){
    val users = mutableMapOf<Int, String>(1 to "Maria", 2 to "Jhon")
    users[5] = "vlad"
    users.remove(2)
    users.forEach { t, u ->
        println("$t and $u")
    }
}