package polymorphism

import inheritance.BankAccount
import inheritance.CurrentAccount
import inheritance.SavingsAccount

class BankStatement {

    fun showStatement(bank: BankAccount) {
        bank.showStatement()
    }
}
