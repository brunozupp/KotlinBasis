package oop.companionObject

interface ILoginProvider {
    fun login()
}

// I can use this method to copy the behavior of static classes
class Entity private constructor(val id: String) {

    // If I didn't want to use .Companion I can change that by passing a new name like below, where I use Factory
    // companion object Factory {...}

    // And I can extends interfaces too
    companion object : ILoginProvider {

        val session : String = "Uma sessão bem legal"
        fun create() = Entity("id")

        override fun login() {
            println("Método de login")
        }
    }
}

fun main() {

    // Can not do this because the constructor is private, which means that I can't instantiate an object of type Entity directly
    // val entity = Entity("id")

    //val entity = Entity.Companion.create() // This is a long term that I can use to access .create
    val entity = Entity.create()
    println(entity.id)

    // I can not access the value of session if an instance
    // println(entity.session)

    println(Entity.session)

   Entity.login()
}