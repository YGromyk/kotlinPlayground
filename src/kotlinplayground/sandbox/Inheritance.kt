package kotlinplayground.sandbox

import kotlin.math.roundToInt

fun main(args: Array<String>) {
//    kotlin.sandbox.ChildA().print()
        println(3.25.roundToInt())
}

abstract class Root

abstract class RootA : Root() {
    abstract var rootB: RootB
}

class ChildA : RootA() {
    override var rootB: RootB = ChildB()

    fun print() {
        rootB.modify {
            hello()
        }
    }
}

abstract class RootB {
    init {
        println("kotlin.sandbox.RootB")
    }
}

class ChildB : RootB(), SomeI {
    init {
        println("kotlin.sandbox.ChildB")
    }

    fun hello() {
        println("lolol")
    }
}

interface SomeI

fun RootB.modify(block: ChildB.() -> Unit): ChildB {
    block(this as ChildB)
    return this
}