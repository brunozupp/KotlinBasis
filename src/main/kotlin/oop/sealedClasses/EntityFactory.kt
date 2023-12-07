package oop.sealedClasses

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

// I just can inherit this class once for class
// I CAN NOT instantiate a sealed class
sealed class Entity() {

    object Help : Entity() {
        val name = "Help"
    }

    data class Easy(val id: String, val name: String) : Entity()
    data class Medium(val id: String, val name: String) : Entity()
    data class Hard(val id: String, val name: String, val multiplier: Float) : Entity()
}

fun main() {

    val entityEasy = EntityFactory.create(EntityType.EASY)
    println(entityEasy)

    val entityMedium = EntityFactory.create(EntityType.MEDIUM)
    println(entityMedium)

    val entityHard = EntityFactory.create(EntityType.HARD)
    println(entityHard)

    println(Entity.Help.name)

    val msg = when(entityEasy) {
        Entity.Help -> "Help class" // Por conta que é um object decoration e é um singleton, não a necessidade de ver a tipagem da instancia com o 'is'
        is Entity.Easy -> "Easy class"
        is Entity.Hard -> "Hard class"
        is Entity.Medium -> "Medium class"
    }

    println(msg)
}