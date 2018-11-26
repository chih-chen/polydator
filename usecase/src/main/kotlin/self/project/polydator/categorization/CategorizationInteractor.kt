package self.project.polydator.categorization

import org.springframework.stereotype.Component
import self.project.polydator.Coordinate
import self.project.polydator.categorization.exceptions.IllegalShapeException
import self.project.polydator.categorization.gateways.PolygonResolver

@Component
class CategorizationInteractor(
        private val polygonResolver: PolygonResolver
) {

    fun categorizePolygons(coordinates: List<Coordinate>): String {

        val polygon = polygonResolver.resolve(coordinates)

        val isNotValidPolygon = !polygon.validate()

        if (isNotValidPolygon)
            throw IllegalShapeException()

        return polygon.categorize().typeName
    }
}