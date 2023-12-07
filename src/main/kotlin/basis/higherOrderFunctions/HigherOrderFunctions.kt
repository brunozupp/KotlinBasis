package basis.higherOrderFunctions

import javax.swing.text.StyledEditorKit.BoldAction

fun printFilteredStrings(list: List<String>, predicate: (String) -> Boolean) {

    list.forEach {
        if(predicate(it)) {
            println(it)
        }
    }
}

fun printFilteredStringsTwo(list: List<String>, predicate: ((String) -> Boolean)?) {

    list.forEach {
        if(predicate?.invoke(it) == true) { // I can use the .invoke with .? to verify the result of a function when this is nullable
            println(it)
        }
    }
}

// I can create variables that are expressions
val predicate: (String) -> Boolean = {
    it.startsWith("K")
}

// I can create methods that return functions
fun getPrintPredicate() : (String) -> Boolean {
    return {it.startsWith("K")}
}

fun main() {

    val list = listOf("Java", "C#", "Dart", "Kotlin")

//    printFilteredStrings(list, {it.startsWith(prefix = "K")})

    // If the last argument from a function IS a function I can define it out of the function's parameter list
    printFilteredStrings(list) { it.startsWith(prefix = "K") }

    printFilteredStringsTwo(list, null)

    printFilteredStrings(list, predicate)

    printFilteredStrings(list, getPrintPredicate())
}