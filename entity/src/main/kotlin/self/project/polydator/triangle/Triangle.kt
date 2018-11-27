package self.project.polydator.triangle

import self.project.polydator.Polygon
import self.project.polydator.PolygonType

data class Triangle(
        val a: Int,
        val b: Int,
        val c: Int
) : Polygon() {

    override fun validate(): Boolean {
        return a + b > c && a + c > b && b + c > a
    }

    override fun categorize(): PolygonType {

        val isEquilateral = a == b && b == c

        val isScalene = a != b && a != c && b != c

        return when {
            isEquilateral -> Equilateral
            isScalene -> Scalene
            else -> Isosceles
        }
    }
}