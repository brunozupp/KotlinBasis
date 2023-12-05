package basis.collections

fun main() {

    val interestingThings = mapOf(1 to "Hi", 2 to "Bruno", 3 to "Flutter")

    printMap(interestingThings)
}

fun printMap(map: Map<Int, String>) {
    println("Printando key e value do Map")
    map.forEach { (key, value) -> println("$key - $value")}
}