package self.project.polydator.categorization

import org.springframework.stereotype.Component
import self.project.polydator.categorization.exceptions.IllegalPolygonException
import self.project.polydator.categorization.gateway.PolygonResolver

@Component
class CategorizationInteractor(
        private val polygonResolver: PolygonResolver
) {

    fun categorizePolygons(sides: List<Int>): Pair<String, String> {

        val polygon = polygonResolver.resolveShape(sides)

        val isNotValidPolygon = !polygon.validate()

        return if (isNotValidPolygon)
            throw IllegalPolygonException()
        else
            Pair(polygon::class.java.simpleName, polygon.categorize().typeName)
    }
}