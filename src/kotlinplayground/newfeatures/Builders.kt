package kotlinplayground.newfeatures

@DslMarker
annotation class ContextWarning

@ContextWarning
data class Person(
        var name: String? = null,
        var age: UInt? = null,
        var contacts: Contacts? = null
) {
    companion object
}

@ContextWarning
data class Contacts(var phoneNumber: String? = null, var email: String? = null)

fun Person.Companion.create(block: Person.() -> Unit) = Person().apply(block)
fun Person.contacts(build: Contacts.() -> Unit) {
    contacts = Contacts().apply(build)
}

/**
 * todo: functions that above are called
 * 'is a function type with receiver'.
 * This means that we need to pass an instance of type kotlin.newfeatures.Person(a receiver)
 * to the function, and we can call members of that instance inside the function.
 * The receiver can be accessed through the this keyword:'
 *
 **/

fun main(args: Array<String>) {
    print(Person.create {
        name = "some name"
        age = 18u
        contacts {
            /*
                        name = "name"
             todo: this thing is forbidden, 'cause we do use DSL marker
             that give us the context of closest receiver
            */
            email = "someemail@gmail.com"
            phoneNumber = "+3869852145"
        }
    })
}

data class A(var a: Int = 0)

fun applyA(block: A.() -> Unit) = A().apply(block)