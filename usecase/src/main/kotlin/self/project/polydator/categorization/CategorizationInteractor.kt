package self.project.polydator.categorization

import org.springframework.stereotype.Component
import self.project.polydator.categorization.exceptions.IllegalPolygonException
import self.project.polydator.categorization.gateways.PolygonResolver

@Component
class CategorizationInteractor(
        private val polygonResolver: PolygonResolver
) {

    fun categorizePolygons(sides: List<Float>): Pair<String, String> {

        val polygon = polygonResolver.resolveShape(sides)

        val isNotValidPolygon = !polygon.validate()

        if (isNotValidPolygon)
            throw IllegalPolygonException()

        return Pair(polygon::class.java.simpleName, polygon.categorize().typeName)
    }
}