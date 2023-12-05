package basis.collections



fun main() {

    val interestingThings = arrayOf("Kotlin", "Flutter", "React Native", "Swift")

    printSize(interestingThings)

    printFirstElementFunction(interestingThings)
    printFirstElementBrackets(interestingThings)
    printLastElementFunction(interestingThings)
    printLastElementBrackets(interestingThings)
    printFirstElementUsingGetFunction(interestingThings)

    printEachElementForIn(interestingThings)
    printEachElementForEach(interestingThings)
    printEachElementForEachUsingAnotherNameToDefineEachElement(interestingThings)
    printEachElementForEachUsingAnotherFunctionToPrint(interestingThings)

    functionWithItemAndIndex(interestingThings)
}

fun printSize(items: Array<String>) : Unit {
    println(items.size)
}

fun printFirstElementFunction(items: Array<String>) = println(items.first())

fun printFirstElementBrackets(items: Array<String>) = println(items[0])

fun printLastElementFunction(items: Array<String>) = println(items.last())

fun printLastElementBrackets(items: Array<String>) = println(items[items.size - 1])

fun printFirstElementUsingGetFunction(items: Array<String>) = println(items.get(0))

fun printEachElementForIn(items: Array<String>) : Unit {
    println("\nPrintando com For In")
    for(item in items) {
       println(item)
    }
}

fun printEachElementForEach(items: Array<String>) : Unit {
    println("\nPrintando com For Each")
    items.forEach {
        // it é a palavra default para acessar o dado de cada elemento
        println(it)
    }
}

fun printEachElementForEachUsingAnotherNameToDefineEachElement(items: Array<String>) {
    println("\nPrintando com For Each e mudando o nome do parâmetro padrão (it)")
    items.forEach {item: String -> println(item)}
}

fun printEachElementForEachUsingAnotherFunctionToPrint(items: Array<String>) {
    println("\nPrintando com For Each (printEachElementForEachUsingAnotherFunctionToPrint)")
    items.forEach { functionToPrint(it) }
}

fun functionToPrint(item: String) {
    println(item);
}

fun functionWithItemAndIndex(items: Array<String>) {
    println("\nPrintando com For Each com Index")
    items.forEachIndexed {index, item -> println("$index - $item")}
}