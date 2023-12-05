package basis

fun main() {
    printName()
    printNameWithParameter("Rose")
    printNameWithNullableParameter(null)
    printNameWithParameterValueDefault();
    printNameWithParameterValueDefault("Sandro");

    val valueReturned = returnName()
    println(valueReturned)
    returnNothingTypeUnit()

    println(singleExpressionFunction())
    println(singleExpressionFunctionWithOmittedTypeReturn())
    singleExpressionFunctionWithOmittedTypeReturningNothing()

    namedFunction(name = "Bruno", greeting = "Olá")

    // Não posso fazer isso, pois uma vez que eu utilizo a nomenclatura eu preciso utilizar em toda passagem de parâmetro
    //namedFunction(name = "Bruno", "Olá");

    namedFunctionWithDefaultValue(name = "Rose")
}

fun printName() {
    println("BRUNO")
}

fun printNameWithParameter(name: String) {
    println(name)
}

fun printNameWithNullableParameter(name: String?) {
    println("printando nome Nullable $name")
}

fun printNameWithParameterValueDefault(name: String = "Algum nome Default") {
    println("printNameWithParameterValueDefault: $name")
}

fun returnName() : String {
    return "Katniss"
}

fun returnNothingTypeUnit() : Unit {
    println("Uma função do tipo void")
}

// Não posso fazer isso, pois se não especificar o tipo de retorno vai dar que é Unit (void)
//fun returningValueWithoutSpecifyingTheReturn() {
//    return "10";
//}

fun singleExpressionFunction() : String = "Retornando valor de forma simplificado. Tipo o Arrow Function que tem no Dart"

fun singleExpressionFunctionWithOmittedTypeReturn() = "Retornando valor simplificado sem a necessidade de definir o tipo de retorno"

fun singleExpressionFunctionWithOmittedTypeReturningNothing() = println("singleExpressionFunctionWithOmittedTypeReturningNothing")

fun namedFunction(greeting: String, name: String) {
    println("$greeting $name")
}

fun namedFunctionWithDefaultValue(greeting: String = "Olá", name: String) {
    println("$greeting $name")
}