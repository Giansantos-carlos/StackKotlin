fun main(){
    val numberOne: Int = 5
    val numberTwo: Int = 3

    var result = numberOne + numberTwo
    // here we are doing operations

    println(" numberOne + numberTwo =  ${numberOne + numberTwo}")
    println(" numberOne - numberTwo =  ${numberOne - numberTwo}")
    println(" numberOne / numberTwo =  ${numberOne / numberTwo}")
    println(" numberOne * numberTwo =  ${numberOne * numberTwo}")
    println(" numberOne % numberTwo =  ${numberOne % numberTwo}")

    result += 2
    println(result)

    result -= 2
    println(result)

    result /= 2
    println(result)

    result *= 2
    println(result)

    result %= 2
    println(result)

    var x = 0
    println("x = ${x++}")
    println("x = ${++x}")

    println("x = ${x--}")
    println("x = ${--x}")

    val isActive = false
    if (isActive){
        println("The user is active")
    }else{
        println("The user is not active")
    }

    val myNumber =  100

    if (myNumber < 75){
        println("$myNumber is greathe of  than 75")
    }else if (myNumber < 200){
        println("$myNumber is is smaller than 200")
    }

    val isProducer = true
    if (!isProducer){
        println("The user is producer")
    }else{
        println("The user is not producer")
    }

    val isPlaying = true
    val score = 80
    if (isPlaying && score > 70){
        println("Next level opened")
    }

    val num1 = 5
    val num2 = 7
    if (num1 == 4  || num2 == 9){
        println("The condition is true")
    }else{
        println("The condition is false")
    }
}
