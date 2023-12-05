package basis.collections

fun main() {

    val interestingThings = listOf("Kotlin", "Flutter", "React Native", "Swift")

    printSizeList(interestingThings)

    printFirstElementFunctionList(interestingThings)
    printFirstElementBracketsList(interestingThings)
    printLastElementFunctionList(interestingThings)
    printLastElementBracketsList(interestingThings)
    printFirstElementUsingGetFunctionList(interestingThings)

    printEachElementForInList(interestingThings)
    printEachElementForEachList(interestingThings)
    printEachElementForEachUsingAnotherNameToDefineEachElementList(interestingThings)
    printEachElementForEachUsingAnotherFunctionToPrintList(interestingThings)

    functionWithItemAndIndexList(interestingThings)
}

fun printSizeList(items: List<String>) : Unit {
    println(items.size)
}

fun printFirstElementFunctionList(items: List<String>) = println(items.first())

fun printFirstElementBracketsList(items: List<String>) = println(items[0])

fun printLastElementFunctionList(items: List<String>) = println(items.last())

fun printLastElementBracketsList(items: List<String>) = println(items[items.size - 1])

fun printFirstElementUsingGetFunctionList(items: List<String>) = println(items.get(0))

fun printEachElementForInList(items: List<String>) : Unit {
    println("\nPrintando com For In")
    for(item in items) {
        println(item)
    }
}

fun printEachElementForEachList(items: List<String>) : Unit {
    println("\nPrintando com For Each")
    items.forEach {
        // it é a palavra default para acessar o dado de cada elemento
        println(it)
    }
}

fun printEachElementForEachUsingAnotherNameToDefineEachElementList(items: List<String>) {
    println("\nPrintando com For Each e mudando o nome do parâmetro padrão (it)")
    items.forEach {item: String -> println(item)}
}

fun printEachElementForEachUsingAnotherFunctionToPrintList(items: List<String>) {
    println("\nPrintando com For Each (printEachElementForEachUsingAnotherFunctionToPrint)")
    items.forEach { functionToPrintList(it) }
}

fun functionToPrintList(item: String) {
    println(item);
}

fun functionWithItemAndIndexList(items: List<String>) {
    println("\nPrintando com For Each com Index")
    items.forEachIndexed {index, item -> println("$index - $item")}
}
