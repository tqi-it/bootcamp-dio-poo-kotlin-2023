package inheritance

class SavingsAccount(
    numberAccount: Int, amount: Double, private val interestRate: Double
) : BankAccount(
    numberAccount, amount
) {

    fun calculateInterestMonth() {
        amount += amount * (interestRate / 100)
    }

    override fun showStatement() {
        show()
    }

    private fun show() {
        println("Exibir Entradas e saídas do saldo comum")
    }
}
