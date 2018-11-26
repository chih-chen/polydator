package self.project.polydator.triangle

import self.project.polydator.PolygonType

sealed class TriangleType : PolygonType()

object Equilateral : TriangleType() {
    override val typeName = "equilateral"
}

object Isosceles : TriangleType() {
    override val typeName = "isosceles"
}

object Scalene : TriangleType() {
    override val typeName = "scalene"
}