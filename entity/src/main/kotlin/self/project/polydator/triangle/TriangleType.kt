package self.project.polydator.triangle

import self.project.polydator.PolygonType

sealed class TriangleType : PolygonType()

object Equilateral : TriangleType() {
    override val typeName = "Equilateral"
}

object Isosceles : TriangleType() {
    override val typeName = "Isosceles"
}

object Scalene : TriangleType() {
    override val typeName = "Scalene"
}