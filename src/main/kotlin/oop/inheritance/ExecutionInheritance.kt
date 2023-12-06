package oop.inheritance

fun main() {

    val person = Person("Bruno", "Noveli")

    val provider: BasicInfoProvider = FancyInfoProvider()

    provider.printInfo(person)
    println(provider.getSessionId())
    println(provider.label)

    // Because BasicInfoProvider has 'protected' in the property sessionBasicProvider I can't access it in an instance
    // println(provider.sessionBasicProvider)
}

