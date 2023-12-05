package basis

fun main() {
    println(sum("Somar", 10, 52, 69, 78))
    println(sum("Somar")) // Nesse caso, preciso tratar a questão de array vazio na função para não estourar erro por conta da função reduce

    val values = intArrayOf(1,2,3,4)

    // Spread Operator = *
    println(sum("Somar", *values))
}

fun sum(label: String, vararg numbers : Int) : String {

    if(numbers.isEmpty()) {
        return "$label - nenhum valor passado"
    }

    return "$label - ${numbers.reduce { old, current -> old + current } }"
}