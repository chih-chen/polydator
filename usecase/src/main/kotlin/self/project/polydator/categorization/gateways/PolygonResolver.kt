package self.project.polydator.categorization.gateways

import self.project.polydator.Polygon

interface PolygonResolver {
    fun resolveShape(sides: List<Float>): Polygon
}