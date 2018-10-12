package kotlinplayground.sandbox

fun<T> Any.castToGeneric()= this as? T

fun main(args: Array<String>) {
    42.castToGeneric<Nothing>()!!!!
    val a = if(true) 87
    print(a)

}