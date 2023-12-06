package oop.inheritance

fun main() {

    val person = Person("Bruno", "Noveli")

    val provider: BasicInfoProvider = FancyInfoProvider()

    provider.printInfo(person)
    println(provider.getSessionId())
    println(provider.label)

    // Because BasicInfoProvider has 'protected' in the property sessionBasicProvider I can't access it in an instance
    // println(provider.sessionBasicProvider)

    println("\n----------------------------------------\n")

    // OBJECT EXPRESSION
    val providerObjectExpression = object : IPersonInfoProvider {
        override val label: String
            get() = "Provider defined as Object Expression"

        override fun printInfo(person: Person) {
            println("Apenas o nome = ${person.firstname}")
        }

        val newProperty : String = "With Object Expression I can define new properties"

        fun newMethod() = println("With Object Expression I can define new methods")
    }

    println(providerObjectExpression.label)
    providerObjectExpression.printInfo(person)
    providerObjectExpression.newMethod()
    println(providerObjectExpression.newProperty)
}

