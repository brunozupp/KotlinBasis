package oop

class PersonFive(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val salary: Double,
    var isSingle: Boolean
) {

    var nickname : String? = null

    var favoriteFood : String? = null
        set(value) {
            field = "$value - 14"
        }
        get() {
            return "A comida favorita é = $field"
        }
}