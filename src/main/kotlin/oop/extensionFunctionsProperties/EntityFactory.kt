package oop.extensionFunctionsProperties

import java.util.UUID

enum class EntityType {
    EASY,
    MEDIUM,
    HARD,
    HELP;

    fun getFormattedName() = name.lowercase().replaceFirstChar{ it.uppercase() }
}

object EntityFactory {
    fun create(type: EntityType) : Entity {

        val id = UUID.randomUUID().toString()

        val name = when(type) {
            EntityType.EASY -> type.name
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> "Hard"
            EntityType.HELP -> "Help"
        }

        return when(type) {
            EntityType.EASY -> Entity.Easy(id, name)
            EntityType.MEDIUM -> Entity.Medium(id, name)
            EntityType.HARD -> Entity.Hard(id, name, 2.5f)
            EntityType.HELP -> Entity.Help
        }
    }
}

sealed class Entity() {

    object Help : Entity() {
        val name = "Help"
    }

    data class Easy(val id: String, val name: String) : Entity()
    data class Medium(val id: String, val name: String) : Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float) : Entity()
}

// EXTENSION METHOD
fun Entity.Medium.printInfo() {
    println("Usando extension function = id: $id | name = $name")
}

// EXTENSION PROPERTY
val Entity.Medium.infoProp: String
    get() = "Some information"

fun main() {


    val entityMedium = Entity.Medium("id medium", "name medium")

    entityMedium.printInfo()
    println("Accessing the extension property infoProp = ${entityMedium.infoProp}")

    val entity = EntityFactory.create(EntityType.MEDIUM)

    // I can not access the method printInfo directly. The same to the property infoProp.
    // I need to verify if is the Medium Type before doing it
    if(entity is Entity.Medium) {
        println("Printing inside if after checking the type ----------------------------")
        entity.printInfo()
        println("Accessing the extension property infoProp = ${entityMedium.infoProp}")
    }
}