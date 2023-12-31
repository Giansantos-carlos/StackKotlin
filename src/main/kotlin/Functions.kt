fun main(){
    sayHello("Gian", 30)

    var hasInternetConnection =  false
    if (hasInternetConnection){
        getData("some data")
    } else{
        showMessage()
    }
}
fun sayHello(name: String, age: Int){
    println("my name is $name and my age is $age")
}

fun getData(data: String){
    println(data)
}

fun showMessage(){
    println("there's no internet connection S")
}