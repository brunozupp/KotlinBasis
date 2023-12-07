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

    // Data class in Kotlin is a concise and mutable data type that provides methods such as equals, hashCode and toString automatically
    // So, it compares objects taking the value and not the address in the memory
    // Another characteristic of data class is that it gives me a method to copy the instance (its values) and returning another instance (method - copy)
    // I can override the methods that were generated automatically
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

    // Example of comparison in a data class

    val easy1 = Entity.Easy("id", "name")
    val easy2 = Entity.Easy("id", "name")

    println(if (easy1 == easy2) "instâncias são iguais em valor" else "instâncias são diferentes em valor")

    // In a data class, if I need to compare the location in memory between the instances, I need to use ===
    println(if (easy1 === easy2) "instâncias são iguais em memória" else "instâncias são diferentes em memória")

    val easyCopy = easy1.copy();
    println("easyCopy = id = ${easyCopy.id} | name = ${easyCopy.name}")

    val easyCopyChangeIdValue = easy1.copy(
        id = "ID MUDADO"
    )
    println("easyCopyChangeIdValue = id = ${easyCopyChangeIdValue.id} | name = ${easyCopyChangeIdValue.name}")
}