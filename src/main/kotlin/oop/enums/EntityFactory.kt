package oop.enums

import java.util.UUID

enum class EntityType {
    EASY,
    MEDIUM,
    HARD;

    fun getFormattedName() = name.lowercase().replaceFirstChar{ it.uppercase() }
}

object EntityFactory {
    fun create(type: EntityType) : Entity {

        val id = UUID.randomUUID().toString()

        val name = when(type) {
            EntityType.EASY -> type.getFormattedName()
            EntityType.MEDIUM -> type.getFormattedName()
            EntityType.HARD -> type.getFormattedName()
        }

        return Entity(id, name)
    }
}

class Entity(val id: String, val name: String) {
    override fun toString(): String {
        return "id: $id, name: $name"
    }
}

fun main() {

    val entityEasy = EntityFactory.create(EntityType.EASY)
    println(entityEasy)

    val entityMedium = EntityFactory.create(EntityType.MEDIUM)
    println(entityMedium)

    val entityHard = EntityFactory.create(EntityType.HARD)
    println(entityHard)
}