package eu.tutorial.bankaccountprogram

class BankAccount(var accountHolder: String,
                  var balance: Double) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            // We can withdraw Money
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        } else {
            // We cannot withdraw Money
            println("You don't have the funds to withdraw $$amount")
        }
    }

    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder")
        for(transaction in  transactionHistory){
            println(transaction)
        }
    }

    fun acctBalance(){
        println("$accountHolder's balance is $$balance")
    }
}