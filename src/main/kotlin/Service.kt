import inheritance.CurrentAccount
import inheritance.SavingsAccount

class Service {

    fun runObject() {


    }

    fun runEncapsulation() {

    }

    fun runInheritance() {
        val depositAccount = SavingsAccount(121234, 2000.0, 0.5)
        depositAccount.makeWithdrawal(500.0)

        val currentAccount = CurrentAccount(12123, 100.0, 200.0)
        currentAccount.showStatement(10, true)
    }

    private fun printColor(value: Any) {
        println("\u001B[38;5;39m${value}")
        println("")
    }
}
