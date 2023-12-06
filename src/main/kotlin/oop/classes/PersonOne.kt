package oop.classes

// Maneira um de inicializar uma classe
class PersonOne(_firstName: String, _lastName: String, _age: Int, _salary: Double, _isSingle: Boolean) {

    val firstName: String
    val lastName: String
    val age: Int
    val salary: Double
    val isSingle: Boolean

    // Método um para inicializar os valores
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
        salary = _salary
        isSingle = _isSingle
    }
}