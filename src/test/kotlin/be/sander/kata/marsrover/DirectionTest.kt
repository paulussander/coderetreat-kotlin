package be.sander.kata.marsrover

import be.sander.kata.marsrover.Direction.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DirectionTest {
    @Test
    internal fun `direction | values | NORTH`() {
        assertThat(NORTH.getLeft()).isEqualTo(WEST)
        assertThat(NORTH.getRight()).isEqualTo(EAST)
    }

    @Test
    internal fun `direction | values | EAST`() {
        assertThat(EAST.getLeft()).isEqualTo(NORTH)
        assertThat(EAST.getRight()).isEqualTo(SOUTH)
    }

    @Test
    internal fun `direction | values | SOUTH`() {
        assertThat(SOUTH.getLeft()).isEqualTo(EAST)
        assertThat(SOUTH.getRight()).isEqualTo(WEST)
    }

    @Test
    internal fun `direction | values | WEST`() {
        assertThat(WEST.getLeft()).isEqualTo(SOUTH)
        assertThat(WEST.getRight()).isEqualTo(NORTH)
    }

}
