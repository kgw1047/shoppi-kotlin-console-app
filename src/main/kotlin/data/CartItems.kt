package data

object CartItems { // object 로 만든 이유는 장바구니는 프로젝트 전역에 있어 항상 같은 값을 유지해야하므로 싱글턴 객체로 만드는 것이 적합
    private val mutableProducts = mutableMapOf<Product, Int>()
    val products: Map<Product, Int> = mutableProducts

    fun addProducts(product: Product) {
        mutableProducts[product]?.let {
            mutableProducts[product] = it + 1
        } ?: kotlin.run {
            mutableProducts[product] = 1
        }
    }

}