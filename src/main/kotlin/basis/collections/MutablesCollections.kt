package basis.collections

fun main() {

    // By default, the collections in Kotlin are immutable.
    // For example, there is no function to add new key/value inside the map, or in any type of collection

    // To allow that a collection could be mutable, I need to specify the type correctly
    val interestingThings = mutableListOf("Kotlin", "Flutter", "React Native", "Swift")
    interestingThings.add("Ionic")

    println("Print list after adding Ionic")
    printMutableList(interestingThings)

    interestingThings.set(0, "Começo da lista")
    println("\nPrint list after replacing item in index 0 using the method 'set'")
    printMutableList(interestingThings);

    interestingThings.add(0, "Kotlin")
    println("\nAdding Kotlin to the beginning of the list using method add with index")
    printMutableList(interestingThings);

    interestingThings.remove("React Native");
    println("\nRemoving React Native from the list")
    printMutableList(interestingThings);

    interestingThings.removeLast();
    println("\nRemoving last item from list (Ionic)")
    printMutableList(interestingThings);

    val map = mutableMapOf("nome" to "Bruno", "sobrenome" to "Noveli", "idade" to 24)
    map.put("solteiro", true)

    // Ambos os jeitos funcionam para adicionar
    //map["solteiro"] = true

    println("\nExemplo com mapa - Adicionando a chave Solteiro")
    printMutableMap(map);
}

fun printMutableList(items: List<String>) {
    items.forEach { println(it) }
}

fun printMutableMap(items: Map<String, Comparable<*>>) {
    items.forEach {(key,value) -> println("$key - $value")}
}