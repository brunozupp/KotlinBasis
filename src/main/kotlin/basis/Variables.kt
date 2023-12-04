package basis

fun main() {

    // Variáveis do tipo val não podem ter seu valor alterado
    val nameOne = "Bruno"

    // nameOne = "Algum outro nome"
    println(nameOne)

    var nameTwo = "Bruno"
    nameTwo = "Algum outro nome"
    println(nameTwo)

    // Variáveis do tipo var podem alterar seu valor desde que esse valor seja do mesmo tipo
    // nameTwo = 9

    // TIPAGEM

    val nameThree : String = "Katniss"
    println(nameThree)

    // TIPAGEM NULLABLES

    // Vai dar ruim porque estou passando que precisa ser um tipo de valor String. Funciona igual no Dart
    // val nameFour : String = null;

    // Indicando que é um Nullable de String
    val nameFive : String? = null;
}