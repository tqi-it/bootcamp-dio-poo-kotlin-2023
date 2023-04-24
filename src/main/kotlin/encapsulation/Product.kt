package encapsulation

class Product(
    private var name: String, private var price: Double, private var isReturn: Boolean = false
) {

    fun makeReturn(): Boolean {
        price = 0.0
        isReturn = true
        return true
    }
}
