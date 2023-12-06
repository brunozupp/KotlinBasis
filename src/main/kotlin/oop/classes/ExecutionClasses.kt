package oop.classes

fun main() {

    val personOne = PersonOne(
        _firstName = "Bruno One",
        _lastName = "Noveli",
        _age = 24,
        _isSingle = true,
        _salary = 1500.00,
    )
    println(personOne.firstName)

    val personTwo = PersonTwo(
        "Bruno Two",
        "Noveli",
        24,
        1500.00,
        true
    )
    println(personTwo.firstName)

    val personThree = PersonThree(
        "Bruno Three",
        "Noveli",
        24,
        1500.00,
        true
    )
    println(personThree.firstName)

    val personThreeNamed = PersonThree(
        firstName = "Bruno Three Named",
        lastName = "Noveli",
        age = 24,
        salary = 1500.00,
        isSingle = true
    )
    println(personThreeNamed.firstName)

    val personFourSecondConstructor = PersonFour(
        "Bruno Four",
        "Noveli",
    )
    println("personFourSecondConstructor = ${personFourSecondConstructor.firstName} - age ${personFourSecondConstructor.age}")

    val personFourThirdConstructor = PersonFour()
    println("personFourSecondConstructor = ${personFourThirdConstructor.firstName} - lastName ${personFourThirdConstructor.lastName}")

    val personFive = PersonFive(
        firstName = "Bruno Five",
        lastName = "Noveli",
        age = 24,
        salary = 1500.00,
        isSingle = true
    )
    personFive.printNickname()
    println("personFive.isSingle = ${personFive.isSingle} (Antes de mudar o valor)")
    // Usando a tipagem 'var' é possível mudar o valor de uma propriedade após ser inicializada
    personFive.isSingle = !personFive.isSingle
    println("personFive.isSingle = ${personFive.isSingle} (Depois de mudar o valor)")

    println("personFive.nickname = ${personFive.nickname} (Antes de mudar o valor)")
    personFive.nickname = "Bruninho"
    println("personFive.nickname = ${personFive.nickname} (Depois de mudar o valor)")

    println(personFive.favoriteFood) // Get customizado
    println("personFive.favoriteFood = ${personFive.favoriteFood} (Antes de mudar o valor)")
    personFive.favoriteFood = "Banana" // Set customizado
    personFive.favoriteFood // Get customizado
    println("personFive.favoriteFood = ${personFive.favoriteFood} (Depois de mudar o valor)")

    personFive.printPersonInfo()
    personFive.printNickname()

    val personSix = PersonSix(
        firstname = "Bruno",
        lastname = "Noveli"
    )

    personSix.showTimesNicknameWasSet()
    personSix.nickname = "Oi"
    personSix.nickname = "X"
    personSix.nickname = "Apelido"
    personSix.showTimesNicknameWasSet()
}