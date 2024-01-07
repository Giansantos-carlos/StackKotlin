import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main(){

    val users = Users()

    with(users){
        firstName = "Gian"
        lastName = "Santos"
    }

    with(users){
        println(firstName)
        println(lastName)
    }
}

class Users {
    var firstName by FormatDelegate()
    var lastName by FormatDelegate()
}



//class App: A by FirstDelagate(), B by SecondDelegate() {
//    override fun print() {
//        TODO("Not yet implemented")
//    }
//
//    override fun print2() {
//        TODO("Not yet implemented")
//    }
//
//}
//
//
//interface A {
//    fun print()
//}
//
//interface B {
//    fun print2()
//}
//
//open class FirstDelagate : A {
//    override fun print() {
//        TODO("Not yet implemented")
//    }
//
//}
//
//open class SecondDelegate : B {
//    override fun print2() {
//        TODO("Not yet implemented")
//    }
//
//}


class FormatDelegate : ReadWriteProperty<Any?, String> {
    private var formattedString: String = ""

    override fun getValue(
        thisRef: Any?,
        property: KProperty<*>,
    ): String {
        return formattedString
    }

    override fun setValue(
        thisRef: Any?,
        property: KProperty<*>,
        value: String
    ) {
         formattedString = value.lowercase()
    }
}



















