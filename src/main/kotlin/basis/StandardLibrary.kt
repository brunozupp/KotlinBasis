package basis

fun main() {

    val list = listOf("Kotlin", "Java", "C#", "Dart", null, null, "PHP")

    list
        .filterNotNull()
        .filter {
            it.startsWith("K")
        }
        .forEach {
            println(it)
        }

    list
        .filterNotNull()
        .map {
            it.length
        }
        .forEach {
            print("$it ")
        }

    list
        .filterNotNull()
        .associate { // Used to convert to a MAP
            it to it.length
        }
        .forEach {
            (key,value) -> println("$key - $value")
        }
}