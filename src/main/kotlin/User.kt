class User(name: String, var lastname: String, var age: Int) {

    constructor(name: String): this (name,"lastName" , 0)
    var name: String

    init {
        if (name.lowercase().startsWith("a")){
            this.name = name
        }else{
            this.name = "User"
            println("The name doesn't start with the latter 'a' or 'A' " )
        }
    }
}