package polymorphism

import inheritance.BankAccount

class BankStatement {

    fun show(account: BankAccount) {
        account.showStatement()
    }
}
