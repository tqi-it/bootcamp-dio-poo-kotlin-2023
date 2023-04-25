package inheritance

class CurrentAccount(
    numberAccount: Int, amount: Double, private var overDraft: Double
) : BankAccount(
    numberAccount, amount
) {

    override fun makeWithdrawal(value: Double): Double {
        println(value)

        if (amount >= value) {
            amount = amount - value
            return value
        }

        overDraft = overDraft - value
        return value
    }

    override fun showStatement() {
        show()
    }

    private fun show() {
        println("Exibir Entradas e saídas do saldo comum")
        println("Exibir Entradas e saídas do saldo cheque especial")
    }
}
