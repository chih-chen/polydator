package self.project.polydator.triangle

import self.project.polydator.Coordinate
import self.project.polydator.Polygon
import self.project.polydator.PolygonType
import self.project.polydator.Unknown
import self.project.polydator.misc.minus

data class Triangle(
        val a: Coordinate,
        val b: Coordinate,
        val c: Coordinate
) : Polygon() {

    private val sideOne = a - b
    private val sideTwo = a - c
    private val sideThree = b - c
    private val sides = listOf(sideOne, sideTwo, sideThree)

    override fun validate(): Boolean {
        return sideOne + sideTwo > sideThree
                && sideOne + sideThree > sideTwo
                && sideTwo + sideThree > sideOne
    }

    override fun categorize(): PolygonType {

        val isEquilateral = sideOne == sideTwo && sideTwo == sideThree

        val isIsosceles = sides.map { side ->
            sides.filterNot { it == side }.any { it == side }
        }.contains(true)

        val isScalene = !sides.map { side ->
            sides.filterNot { it == side }.any { it == side }
        }.contains(true)

        return when {
            isEquilateral -> Equilateral
            isIsosceles -> Isosceles
            isScalene -> Scalene
            else -> Unknown
        }
    }
}