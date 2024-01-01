fun main(){
    val names: Array<String> = arrayOf("Gian", "Olga", "Bruna")
    val mixedElelments  = arrayOf(4,5,6,7,8,9, "name 1 ", "a", true)
   println(names.size)

    names[0] = "Alez"
    println("First element: ${names[0]}")
    println("The size of the array is: ${names.size}")

    for (name  in names ){
        println(name)
    }
    for (element in mixedElelments){
        if (element is Int ){
            println(element)
        }
    }
    names.forEach { name -> println(name) }
}