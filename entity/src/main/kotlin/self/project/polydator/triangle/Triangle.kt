package self.project.polydator.triangle

import self.project.polydator.Polygon
import self.project.polydator.PolygonType
import self.project.polydator.Unknown

data class Triangle(
        val a: Float,
        val b: Float,
        val c: Float
) : Polygon() {

    private val sides = listOf(a, b, c)

    override fun validate(): Boolean {
        return a + b > c && a + c > b && b + c > a
    }

    override fun categorize(): PolygonType {

        val isEquilateral = a == b && b == c

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