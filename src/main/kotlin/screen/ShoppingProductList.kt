package screen

import data.Product

class ShoppingProductList {
    private val products = arrayOf(
        Product("패션", "겨울 패딩"),
        Product("패션", "겨울 바지"),
        Product("전자기기", "핸드폰"),
        Product("전자기기", "이어폰"),
        Product("전자기기", "노트북"),
        Product("반려동물", "건식사료"),
        Product("반려동물", "습식사료"),
        Product("반려동물", "치약"),
        Product("반려동물", "간식")
        )

    private val categories: Map<String, List<Product>> = products.groupBy { product ->
        product.categoryLabel
    }

    fun showProducts(selectedCategory: String){ // 카테고리를 입력받아 해당 카테고리의 상품을 보여주는 함수
        val categoryProducts = categories[selectedCategory]
        if (!categoryProducts.isNullOrEmpty()) {
            println("""
                ***=================================***
                선택하신 [$selectedCategory] 카테고리 상품입니다.
                """.trimIndent())
            val productSize = categoryProducts.size
            for (index in 0 until productSize) {
                println("${index+1}. ${categoryProducts[index].name}")
            }
        } else {
            showEmptyProductMessage(selectedCategory)
        }
    }

    private fun showEmptyProductMessage(selectedCategory: String) {
        println("[$selectedCategory] 카테고리 상품이 등록되기 전 입니다.")
    }
}