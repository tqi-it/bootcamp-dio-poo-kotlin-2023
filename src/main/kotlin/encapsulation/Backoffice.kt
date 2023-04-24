package encapsulation

class Backoffice {

    // Outro acesso ao atríbutos em outra classe
    fun run(product: Product) {
        product.makeReturn()
    }
}
