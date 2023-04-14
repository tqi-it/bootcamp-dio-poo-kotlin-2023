package inheritance

class SavingsAccount(
    numberAccount: Int, amount: Double, private val interestRate: Double
) : BankAccount(
    numberAccount, amount
) {

    fun calculateInterest() {
        amount += amount * (interestRate / 100)
    }

    override fun showStatement() {
        println("Savings Account")

        for (statement in statement) {
            println(statement)
        }
    }
}
