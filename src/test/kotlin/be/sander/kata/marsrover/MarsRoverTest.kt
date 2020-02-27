package be.sander.kata.marsrover

import be.sander.kata.marsrover.Direction.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarsRoverTest {

    @Test
    internal fun `create | default | mars rover starts at x=0, y=0, facing NORTH`() {
        val actual = MarsRover()
        val expected = MarsRover(Position(), NORTH)

        assertThat(actual).isEqualTo(expected)
    }

    @Test
    internal fun `turn left | when facing north | then mars rover is facing west and position is unaffected`() {
        val actual = MarsRover(direction = NORTH)
        val expected = MarsRover(direction = WEST)

        assertThat(actual.turnLeft()).isEqualTo(expected)
    }

    @Test
    internal fun `turn right | when facing north | then mars rover is facing east and position is unaffected`() {
        val actual = MarsRover(direction = NORTH)
        val expected = MarsRover(direction = EAST)

        assertThat(actual.turnRight()).isEqualTo(expected)
    }

    @Test
    internal fun `move forward | given 0,0 and direction NORTH | move to 0,1 and direction is unaffected`() {
        val actual = MarsRover(Position(0, 0), NORTH)
        val expected = MarsRover(Position(0, 1), NORTH)

        assertThat(actual.moveForward()).isEqualTo(expected)
    }

    @Test
    internal fun `move backwards | given 0,0 and direction NORTH | move to 0,-1 | direction NORTH`() {
        val marsRover = MarsRover(Position(0, 0), NORTH)
        val expected = MarsRover(Position(0, -1), NORTH)

        assertThat(marsRover.moveBackward()).isEqualTo(expected)
    }

    @Test
    internal fun `multiple commands | are executed in order`() {
        val actual = MarsRover()
                .moveForward()
                .moveForward()
                .turnLeft()
                .moveBackward()
                .moveBackward()
                .turnRight()
                .turnRight()
        val expected = MarsRover(Position(2, 2), EAST)

        assertThat(actual).isEqualTo(expected)
    }
}