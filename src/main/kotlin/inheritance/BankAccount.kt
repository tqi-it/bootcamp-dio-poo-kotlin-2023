package inheritance

abstract class BankAccount(
    private val accountNubmer: Int, protected var amount: Double
) {

    open fun makeWithdrawal(value: Double): Double {
        if (amount >= value) {
            amount -= value
            return value
        }

        return 0.0
    }

    abstract fun showStatement()
}
