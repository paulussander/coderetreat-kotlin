package be.sander.kata.marsrover

import be.sander.kata.marsrover.Direction.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PositionTest{
    @Test
    internal fun `move Forward | given direction NORTH | add 1 to y`() {
        val position : Position = Position(0,0)

        val actual : Position = position.moveForward(NORTH)
        assertThat(actual).isEqualTo(Position(0,1))
    }

    @Test
    internal fun `move Forward | given direction SOUTH | subtracts 1 from y`() {
        val position : Position = Position(0,0)

        val actual : Position = position.moveForward(SOUTH)
        assertThat(actual).isEqualTo(Position(0,-1))
    }

    @Test
    internal fun `move Backwards | given direction NORTH | subtracts 1 from y`() {
        val position : Position = Position(0,0)

        val actual : Position = position.moveBackwards(NORTH)
        assertThat(actual).isEqualTo(Position(0,-1))
    }

    @Test
    internal fun `move Backwards | given direction SOUTH | adds 1 to y`() {
        val position : Position = Position(0,0)

        val actual : Position = position.moveBackwards(SOUTH)
        assertThat(actual).isEqualTo(Position(0,1))
    }

    @Test
    internal fun `move Forward | given direction EAST | add 1 to x`() {
        val position : Position = Position(0,0)

        val actual : Position = position.moveForward(EAST)
        assertThat(actual).isEqualTo(Position(1,0))
    }

    @Test
    internal fun `move Forward | given direction WEST | subtracts 1 from x`() {
        val position : Position = Position(0,0)

        val actual : Position = position.moveForward(WEST)
        assertThat(actual).isEqualTo(Position(-1,0))
    }

    @Test
    internal fun `move Backwards | given direction EAST | subtracts 1 from x`() {
        val position : Position = Position(0,0)

        val actual : Position = position.moveBackwards(EAST)
        assertThat(actual).isEqualTo(Position(-1,0))
    }

    @Test
    internal fun `move Backwards | given direction WEST | adds 1 to x`() {
        val position : Position = Position(0,0)

        val actual : Position = position.moveBackwards(WEST)
        assertThat(actual).isEqualTo(Position(1,0))
    }
}
