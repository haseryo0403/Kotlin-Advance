package eu.tutorial.bankaccountprogram

fun main(){
    val denisesBankAccount = BankAccount("Denis Panjuta", 1308.20)
    denisesBankAccount.deposit(200.0)
    denisesBankAccount.withdraw(1200.0)
    denisesBankAccount.deposit(3000.00)
    denisesBankAccount.deposit(2000.00)
    denisesBankAccount.withdraw(3333.15)
    denisesBankAccount.displayTransactionHistory()

    denisesBankAccount.acctBalance()

    val sarahBankAccount = BankAccount("Sarah", 0.0)

    sarahBankAccount.deposit(100.0)
    sarahBankAccount.withdraw(10.0)
    sarahBankAccount.deposit(300.0)

    sarahBankAccount.acctBalance()

}