package screen

import extensions.getNotEmptyString

class ShoppingCategory : Screen() {
     fun showCategories() {
        ScreenStack.push(this)
        val categories = arrayOf("패션", "전자기기", "반려동물")
        for (catergory in categories) {
            println(catergory)
        }

        println(" => 장바구니로 이동하시려면 #을 입력해주세요")

        val selectedCategory = readLine().getNotEmptyString()
        if (selectedCategory == "#") {
            val shoppingCart = ShoppingCart()
            shoppingCart.showCartItems()
        } else {
            if (categories.contains(selectedCategory)){
                val shoppingProductList = ShoppingProductList(selectedCategory)
                shoppingProductList.showProducts()
            } else {
                showErrorMessage(selectedCategory)
            }
        }
    }

    private fun showErrorMessage(selectedCategory: String?) {
        println("[$selectedCategory]는 존재하지 않는 카테고리입니다. 다시 입력해주세요.")
        showCategories()
    }
}