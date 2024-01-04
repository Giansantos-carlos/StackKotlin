fun main(){

    var user = User3("Gian", "Santos", 29)
    val user2 by lazy {
        User3("USer", "lastUser", 29)
    }

    println(user)
    println(user2.firstName)
}