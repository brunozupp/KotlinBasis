package oop.inheritance

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
// By default, classes in Kotlin are 'public final', which means I can't use this to be inherited by other classes
// To allow the inheritance I need to use the keyword 'open'
open class BasicInfoProvider : IPersonInfoProvider, ISessionInfoProvider {
    override val label: String
        get() = "BASIC"

    // To allow the change in value from this property in classes that inherited from BasicInfoProvider I need to
    // put the keyword 'open'. So I will access this property in FancyInfoProvider
    // And I use the keyword 'protected' to not allow the Instance of the class that will inherit BasicInfoProvider to
    // use this value directly. I can only use this inside de Class. The most I can do is to create a 'get' method to
    // expose this value
    protected open val sessionBasicProvider = "sessionBasicProvider"

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