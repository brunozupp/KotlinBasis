package oop.classes

class PersonFour(
    val firstName: String,
    val lastName: String,
    val age: Int,
    val salary: Double,
    val isSingle: Boolean
) {

    constructor(firstName: String, lastName: String) : this(
        firstName = firstName,
        lastName = lastName,
        age = 10,
        salary = 0.0,
        isSingle = false
    )

    constructor(firstName: String = "Assunção") : this(
        firstName = firstName,
        lastName = "Esperança",
        age = 10,
        salary = 0.0,
        isSingle = false
    )
}