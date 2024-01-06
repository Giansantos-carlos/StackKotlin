fun main (){
    val GianAccount = Account("Gian")
    GianAccount.deposit(1000)
    GianAccount.withdraw(500)
    GianAccount.deposit(200)
    GianAccount.withdraw(100)

    val balence = GianAccount.calculateBalance()
    println("Balance is $balence")

}