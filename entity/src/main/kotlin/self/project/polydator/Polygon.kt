package self.project.polydator

abstract class Polygon {
    abstract fun validate(): Boolean
    abstract fun categorize(): PolygonType
}