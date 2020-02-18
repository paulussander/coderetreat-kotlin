package be.sander.kata.marsrover

import java.lang.IllegalArgumentException

enum class Direction(val qualifier: Int, val left: Int, val right: Int) {
    NORTH(1, 4, 2),
    EAST(2, 1, 3),
    SOUTH(3, 2, 4),
    WEST(4, 3, 1);

    fun getLeft(): Direction {
        return of(this.left);
    }

    fun getRight(): Direction {
        return of(this.right);
    }

    private fun of(qualifier: Int): Direction {
        val direction = values().find { direction -> direction.qualifier == qualifier }
        if(direction != null){
            return direction
        }

        throw IllegalArgumentException("Could not determine Direction for $qualifier")
    }
}