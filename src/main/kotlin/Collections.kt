fun main(){

    val user1 = Users4("Nmae 1")
    val user2 = Users4("Nmae 2")
    val user3 = Users4("Nmae 3")
    val user4 = Users4("Nmae 4")
    val user5 = Users4("Nmae 5")
    val user6 = Users4("Nmae 6")
    val user7 = Users4("Nmae 7")
    val user8 = Users4("Nmae 8")
    val user9 = Users4("Gian")
    val user10 = Users4("Gian")
    //val names = mutableListOf("name 1", "name 2 ", "name 3", "name 1")
   // val names = setOf<String>("name 1", "name 2 ", "name 3", "name 1")
    //val names = mutableSetOf<String>("name 1", "name 2 ", "name 3", "name 1")

    val users = mutableSetOf<Users4>(user1,user2,user3, user4, user5, user6, user7, user8, user9, user10)

    //names.add("name 4 ")
    //names.removeAt(0)
    //names.remove("name 3")

//    names.add("name 4")
//
//    names.forEach { println(it) }

    users.forEach { println(it.name) }
}

data class Users4(val name: String)