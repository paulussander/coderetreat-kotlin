package be.sander.kata.marsrover

import be.sander.kata.marsrover.Direction.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MarsRoverTest {

    @Test
    internal fun `create | default | mars rover starts at x=0 and y=0`() {
        val actual = MarsRover();

        assertThat(actual.getPosition()).isEqualTo(Position());
    }

    @Test
    internal fun `create | default | mars rover is facing NORTH`() {
        val actual = MarsRover();

        assertThat(actual.getDirection()).isEqualTo(NORTH);
    }

    @Test
    internal fun `turn left | when facing north | then mars rover is facing west `() {
        val actual = MarsRover(direction = NORTH);

        assertThat(actual.turnLeft().getDirection()).isEqualTo(WEST);
    }

    @Test
    internal fun `turn left | only affects direction, not position`() {
        val actual = MarsRover();

        assertThat(actual.turnLeft().getPosition()).isEqualTo(actual.getPosition());
    }

    @Test
    internal fun `turn right | when facing north | then mars rover is facing east `() {
        val actual = MarsRover(direction = NORTH);

        assertThat(actual.turnRight().getDirection()).isEqualTo(EAST);
    }

    @Test
    internal fun `turn right | only affects direction, not position`() {
        val actual = MarsRover();

        assertThat(actual.turnRight().getPosition()).isEqualTo(actual.getPosition());
    }

    @Test
    internal fun `move forward | given 0,0 and direction NORTH | move to 0,1`() {
        val marsRover = MarsRover(Position(0, 0), NORTH)

        assertThat(marsRover.moveForward()).isEqualTo(MarsRover(Position(0, 1), NORTH))
    }

    @Test
    internal fun `move backwards | given 0,0 and direction NORTH | move to 0,-1`() {
        val marsRover = MarsRover(Position(0, 0), NORTH)

        assertThat(marsRover.moveBackward()).isEqualTo(MarsRover(Position(0, -1), NORTH))
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
                .turnRight();

        assertThat(actual).isEqualTo(MarsRover(Position(2,2), EAST))
    }
}