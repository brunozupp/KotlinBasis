package oop.interfaces

interface IPersonInfoProvider {

    // I can have properties to be override inside the implementatios. I CAN'T have a default value
    val label: String

    fun printInfo(person: Person)

    fun methodImplementedInInterface() {
        println("This method was implemented inside Interface")
    }
}

interface ISessionInfoProvider {

    fun getSessionId() : Int
}

// Multiplas Interfaces
class BasicInfoProvider : IPersonInfoProvider, ISessionInfoProvider {
    override val label: String
        get() = "BASIC"

    override fun printInfo(person: Person) {
        println("${person.firstname} ${person.lastname} - Basic")
    }

    override fun getSessionId(): Int {
        return 58
    }
}

class IntermediateInfoProvider(override val label: String) : IPersonInfoProvider {

    override fun printInfo(person: Person) {
        println("${person.firstname} ${person.lastname} - Intermediate")
    }
}

class AdvancedInfoProvider(override  val label: String = "ADVANCED") : IPersonInfoProvider {

    override fun printInfo(person: Person) {
        println("${person.firstname} ${person.lastname} - Advanced")
    }

    override fun methodImplementedInInterface() {
        println("Override methodImplementedInInterface by own purpose, because I don't need to override as it was implemented inside Interface")
        print("And calling the original method using the keyword 'super': ")
        super.methodImplementedInInterface()
    }
}