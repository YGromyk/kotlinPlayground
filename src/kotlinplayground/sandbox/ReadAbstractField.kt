package kotlinplayground.sandbox

abstract class NullSaveLang {
    abstract var property: String
    val anotherProperty get() = property[0].toUpperCase()
}

class ReadAbstractField: NullSaveLang() {
    override var property: String = "kotlin"
}

fun main(args: Array<String>) {
    print(ReadAbstractField().property)
}