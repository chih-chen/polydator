package self.project.polydator.resolver

import org.springframework.stereotype.Service
import self.project.polydator.Polygon
import self.project.polydator.categorization.gateway.PolygonResolver
import self.project.polydator.exception.UnsupportedPolygonException
import self.project.polydator.triangle.Triangle

@Service
class PolygonResolverImpl : PolygonResolver {

    override fun resolveShape(sides: List<Int>): Polygon =
            when (sides.size) {
                3 -> Triangle(a = sides[0], b = sides[1], c = sides[2])
                else -> throw UnsupportedPolygonException()
            }

}