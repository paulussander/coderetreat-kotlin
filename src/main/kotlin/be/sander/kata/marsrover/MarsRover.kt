package be.sander.kata.marsrover

import be.sander.kata.marsrover.Direction.NORTH

data class MarsRover(private val position: Position = Position(), private val direction: Direction = NORTH) {

    fun turnLeft(): MarsRover {
        return this.copy(direction = direction.getLeft())
    }

    fun turnRight() : MarsRover {
        return this.copy(direction = direction.getRight())
    }

    fun moveForward(): MarsRover {
        return this.copy(position = position.moveForward(direction))
    }

    fun moveBackward(): MarsRover {
        return this.copy(position = position.moveBackwards(direction))
    }
}