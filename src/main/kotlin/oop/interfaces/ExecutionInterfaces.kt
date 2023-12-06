package oop.interfaces

fun main() {

    val person = Person("Bruno", "Noveli")

    var provider: IPersonInfoProvider = BasicInfoProvider()
    provider.printInfo(person)
    provider.methodImplementedInInterface()
    println(provider.label)

    println("-------------------------------------------")

    provider = IntermediateInfoProvider("INTERMEDIATE")
    provider.printInfo(person)
    provider.methodImplementedInInterface()
    println(provider.label)

    println("-------------------------------------------")

    provider = AdvancedInfoProvider()
    provider.printInfo(person)
    provider.methodImplementedInInterface()
    println(provider.label)

    println("-------------------------------------------")
    println("-------------------------------------------")
    println("-------------------------------------------")

    val providerTwo = BasicInfoProvider()
    println("Número da sessão: ${providerTwo.getSessionId()}")
    print("Informações da pessoa: ")
    providerTwo.printInfo(person)

    println("-------------------------------------------")

    checkTypes(provider)
    checkTypes(providerTwo)
}

fun checkTypes(infoProvider: IPersonInfoProvider) {
    if(infoProvider is ISessionInfoProvider) {
        println("É um ISessionInfoProvider")

        val idOne = (infoProvider as ISessionInfoProvider).getSessionId()
        println("Fazendo o casting para ISessionInfoProvider e pegando o id = $idOne")

        println("Usando o smartcasting = ${infoProvider.getSessionId()}")
    } else {
        println("NÃO É um ISessionInfoProvider")
    }
}