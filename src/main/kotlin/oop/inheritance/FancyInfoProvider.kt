package oop.inheritance

class FancyInfoProvider : BasicInfoProvider() {

    override val sessionBasicProvider: String
        get() = "Overriding property sessionBasicProvider"

    override val label: String
        get() = "FANCY"

    override fun printInfo(person: Person) {
        println("${person.firstname} ${person.lastname} - Fancy - $sessionBasicProvider")
    }
}