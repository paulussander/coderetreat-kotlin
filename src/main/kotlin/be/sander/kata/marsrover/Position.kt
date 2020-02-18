package be.sander.kata.marsrover

import be.sander.kata.marsrover.Direction.*

data class Position(private val x: Int = 0, private val y: Int = 0) {
    fun moveForward(direction: Direction): Position = when (direction) {
        NORTH -> this.copy(y = this.y + 1)
        EAST -> this.copy(x = this.x + 1)
        SOUTH -> this.copy(y = this.y - 1)
        WEST -> this.copy(x = this.x - 1)
    }

    fun moveBackwards(direction: Direction): Position = when (direction) {
        NORTH -> this.copy(y = this.y - 1)
        EAST -> this.copy(x = this.x - 1)
        SOUTH -> this.copy(y = this.y + 1)
        WEST -> this.copy(x = this.x + 1)
    }
}