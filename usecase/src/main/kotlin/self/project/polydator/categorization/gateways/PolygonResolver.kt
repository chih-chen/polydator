package self.project.polydator.categorization.gateways

import self.project.polydator.Coordinate
import self.project.polydator.Polygon

interface PolygonResolver {
    fun resolve(coordinates: List<Coordinate>): Polygon
}