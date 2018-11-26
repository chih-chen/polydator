package self.project.polydator.resolver

import org.springframework.stereotype.Service
import self.project.polydator.Coordinate
import self.project.polydator.triangle.Triangle
import self.project.polydator.categorization.gateways.PolygonResolver

@Service
class TriangleResolver : PolygonResolver {

    override fun resolve(coordinates: List<Coordinate>): Triangle {
        return Triangle(
                a = coordinates[0],
                b = coordinates[1],
                c = coordinates[2]
        )
    }
}