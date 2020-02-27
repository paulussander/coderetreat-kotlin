package be.sander.kata.marsrover

enum class Direction {
    NORTH {
        override fun getLeft() = WEST
        override fun getRight() = EAST
    },
    EAST {
        override fun getLeft() = NORTH
        override fun getRight() = SOUTH
    },
    SOUTH {
        override fun getLeft() = EAST
        override fun getRight() = WEST
    },
    WEST {
        override fun getLeft() = SOUTH
        override fun getRight() = NORTH
    };

    abstract fun getLeft(): Direction
    abstract fun getRight(): Direction
}