package self.project.polydator.categorization.gateway

import self.project.polydator.Polygon

interface PolygonResolver {
    fun resolveShape(sides: List<Int>): Polygon
}