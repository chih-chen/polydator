package self.project.polydator

import self.project.misc.minus

data class Triangle(
        val a: Coordinate,
        val b: Coordinate,
        val c: Coordinate
) {

    fun validate(): Boolean {

        val sideOne = a - b
        val sideTwo = a - c
        val sideThree = b - c

        return sideOne + sideTwo > sideThree
                && sideOne + sideThree > sideTwo
                && sideTwo + sideThree > sideOne
    }
}