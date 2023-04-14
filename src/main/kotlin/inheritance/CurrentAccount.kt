package inheritance

class CurrentAccount(
    numberAccount: Int, amount: Double, private val overDraft: Double
) : BankAccount(
    numberAccount, amount
) {

    // Exemplo Sobrescrita
    override fun makeWithdrawal(value: Double): Double {
        if (value <= (amount + overDraft)) {
            amount -= value
            return value
        }

        return 0.0
    }

    override fun showStatement() {
        println("Current Account")

        for (statement in statement) {
            println(statement)
        }
    }

    // Exemplo Sobrecarga
    fun showStatement(limit: Int) {

    }

    // Exemplo Sobrecarga
    fun showStatement(limit: Int, withPrefix: Boolean) {

    }
}
