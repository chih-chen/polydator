package self.project.polydator

abstract class PolygonType {
    abstract val typeName: String
}

object Unknown : PolygonType() {
    override val typeName = "Unknown"
}