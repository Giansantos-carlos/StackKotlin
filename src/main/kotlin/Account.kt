class Account(var acountName: String) {
    var balance = 0
    var transactions = mutableListOf<Int>()

    fun deposit(amount: Int){
        if (amount > 0){
            transactions.add(amount)
            balance += amount

            println("$amount deposited. balance is now ${this.balance } ")
        }else{
            println("Cannot deposit negative sums")
        }

    }

    fun withdraw(withdrawal: Int){
        if (-withdrawal < 0){
            transactions.add(-withdrawal)
            balance += -withdrawal
            println("$withdrawal withdrawn. Balance is now ${this.balance} ")
        }else{
            println("Cannot withdrawn negative sum ")
        }
    }

    fun calculateBalance(): Int{
        //this.balance = 0
        for (transaction in transactions){
            this.balance += balance
        }
        return this.balance
    }
}