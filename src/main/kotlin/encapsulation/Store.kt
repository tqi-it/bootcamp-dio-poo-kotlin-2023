package encapsulation

class Store {

    // Acesso aos atríbutos
    // Exemplo de devolução de produto
    fun makeReturn(product: Product) {
        product.isReturn = true
        product.price = 1.99
    }
}
