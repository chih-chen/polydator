package self.project.polydator

import self.project.polydator.triangle.TriangleType

abstract class Polygon {
    abstract fun validate(): Boolean
    abstract fun categorize(): PolygonType
}