package inheritance

abstract class BankAccount(
    private val accountNubmer: Int, protected var amount: Double
) {

    protected val statement: ArrayList<Double> = ArrayList()

    open fun makeWithdrawal(value: Double): Double {
        if (amount >= value) {
            amount -= value
            statement.add(-value)
            return value
        }

        return 0.0
    }

    abstract fun showStatement()
}
