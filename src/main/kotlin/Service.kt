import classandobject.User
import encapsulation.Product
import encapsulation.Store
import inheritance.CurrentAccount
import inheritance.SavingsAccount
import polymorphism.BankStatement

class Service {

    fun runObject() {
        val user: User = User("William", 18, "10010010010")
        val user2: User = User("Thiago", 22, "111111010010010")

        printColor(user.name)
        printColor(user2.name)
    }

    fun runEncapsulation() {
        val product = Product("Camisa polo branca", 100.0, false)
        val store: Store = Store()
        store.makeReturn(product)
    }

    fun runInheritance() {
        val depositAccount = SavingsAccount(121234, 2000.0, 0.5)
        depositAccount.makeWithdrawal(500.0)

        val currentAccount = CurrentAccount(12123, 100.0, 200.0)
        currentAccount.makeWithdrawal(10.0)

        val statement : BankStatement = BankStatement()
        statement.showStatement(currentAccount)
        statement.showStatement(depositAccount)
    }

    private fun printColor(value: Any) {
        println("\u001B[38;5;39m${value}")
        println("")
    }
}
