package kotlinplayground.sandbox

fun printBoolean(boolean: Boolean) {
    when (boolean) {
        (boolean == true) -> println("$boolean TRUE")
        // when we have in the first case 'false', than
        // will be something like that
        // false == true -> false, after that boolean with value
        // 'false' will be switched in true
        (boolean == false) -> println("$boolean FALSE")
    }
}

fun main(args: Array<String>) {
    printBoolean(true)
    printBoolean(false)
}