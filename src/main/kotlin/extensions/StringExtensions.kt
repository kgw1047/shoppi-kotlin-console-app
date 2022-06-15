package extensions
/*
* 사용자의 입력을 받을 때 공백 혹은 null 값이라면 재입력을 받는 함수
* */
fun String?.getNotEmptyString(): String {
    var input = this
    while(input.isNullOrBlank()) {
        println("값을 입력해주세요")
        input = readLine()
    }
    return input.trim()
}

fun String?.getNotEmptyInt(): Int {
    var input = this?.trim()
    while (input.isNullOrEmpty() || input.toIntOrNull() == null) {
        println("값을 입력해주세요")
        input = readLine()
    }
    return input.toInt()
}