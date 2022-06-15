package screen

import LINE_DIVIDER
import extensions.getNotEmptyString
/*
* Step 1. 화면 이동을 구현 하는 Stack
* Step 2. 장바구니 이전 화면 구현
* */
class ShoppingHome : Screen() {

    fun start() {
        showWelcomeMessage()
        showCategories()
    }

    private fun showWelcomeMessage() {
        ScreenStack.push(this)
        println("안녕하세요, shoppi에 오신 것을 환영합니다!")
        println("쇼핑을 계속하시려면 이름을 입력해주세요 :)")

        val name = readLine().getNotEmptyString()
        println(
            """
            감사합니다. 반갑습니다. $name 님
            원하시는 카테고리를 입력해주세요
            $LINE_DIVIDER
        """.trimIndent()
        )
    }

    private fun showCategories() {
        val shoppingCategory = ShoppingCategory()
        shoppingCategory.showCategories()
    }
}