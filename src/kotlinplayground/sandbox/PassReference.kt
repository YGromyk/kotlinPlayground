package kotlinplayground.sandbox

fun main(args: Array<String>) {
    val mutableList = mutableListOf<() -> Unit>()
    var i = 0
    for (j in 1..3) {
        i++
        mutableList.add { println("i=$i, j=$j") }
    }

    mutableList.forEach { it() }
}