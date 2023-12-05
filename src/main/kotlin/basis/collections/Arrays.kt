package basis.collections

fun main() {

    val interestingThings = arrayOf("Kotlin", "Flutter", "React Native", "Swift")

    printSizeArrays(interestingThings)

    printFirstElementFunctionArrays(interestingThings)
    printFirstElementBracketsArrays(interestingThings)
    printLastElementFunctionArrays(interestingThings)
    printLastElementBracketsArrays(interestingThings)
    printFirstElementUsingGetFunctionArrays(interestingThings)

    printEachElementForInArrays(interestingThings)
    printEachElementForEachArrays(interestingThings)
    printEachElementForEachUsingAnotherNameToDefineEachElementArrays(interestingThings)
    printEachElementForEachUsingAnotherFunctionToPrintArrays(interestingThings)

    functionWithItemAndIndexArrays(interestingThings)
}

fun printSizeArrays(items: Array<String>) : Unit {
    println(items.size)
}

fun printFirstElementFunctionArrays(items: Array<String>) = println(items.first())

fun printFirstElementBracketsArrays(items: Array<String>) = println(items[0])

fun printLastElementFunctionArrays(items: Array<String>) = println(items.last())

fun printLastElementBracketsArrays(items: Array<String>) = println(items[items.size - 1])

fun printFirstElementUsingGetFunctionArrays(items: Array<String>) = println(items.get(0))

fun printEachElementForInArrays(items: Array<String>) : Unit {
    println("\nPrintando com For In")
    for(item in items) {
       println(item)
    }
}

fun printEachElementForEachArrays(items: Array<String>) : Unit {
    println("\nPrintando com For Each")
    items.forEach {
        // it é a palavra default para acessar o dado de cada elemento
        println(it)
    }
}

fun printEachElementForEachUsingAnotherNameToDefineEachElementArrays(items: Array<String>) {
    println("\nPrintando com For Each e mudando o nome do parâmetro padrão (it)")
    items.forEach {item: String -> println(item)}
}

fun printEachElementForEachUsingAnotherFunctionToPrintArrays(items: Array<String>) {
    println("\nPrintando com For Each (printEachElementForEachUsingAnotherFunctionToPrint)")
    items.forEach { functionToPrintArrays(it) }
}

fun functionToPrintArrays(item: String) {
    println(item);
}

fun functionWithItemAndIndexArrays(items: Array<String>) {
    println("\nPrintando com For Each com Index")
    items.forEachIndexed {index, item -> println("$index - $item")}
}