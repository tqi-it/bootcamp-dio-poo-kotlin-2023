package encapsulation

class Backoffice {

    // Outro acesso ao atríbutos em outra classe
    fun makeReturn(product: Product) {
        product.isReturn = true
        product.price = 0.0
    }
}
