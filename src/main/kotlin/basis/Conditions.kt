package basis

val name = "Bruno"
var greeting : String? = null

fun main() {

    if(greeting != null) {
        println("$greeting, $name")
    } else {
        println("$name")
    }

    // É como se fosse um switch
    when(greeting) {
        null -> println("Greeting is null")
        "Ola" -> println("O valor da variável greeting é Ola")
        else -> println("Caso todos os casos derem errado: $greeting") // "Se nenhum valor bater, entra no else"
    }

    // Assinatura de valor com when
    val valueFromGreeting = when(greeting) {
        null -> "Greeting is null"
        "Ola" -> "O valor da variável greeting é Ola"
        else -> "Caso todos os casos derem errado: $greeting"
    }

    println("O valor da variável valueFromGreeting é $valueFromGreeting")

    // Assinatura de valor com if/else
    val valueFromIfElseStatement = if(greeting != null) "If/Else: $greeting" else "Hi"
    println(valueFromIfElseStatement)
}