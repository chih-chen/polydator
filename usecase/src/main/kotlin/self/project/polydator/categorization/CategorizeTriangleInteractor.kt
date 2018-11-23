package self.project.polydator.categorization

import org.springframework.stereotype.Component
import self.project.polydator.Triangle
import self.project.polydator.categorization.exceptions.IllegalShapeException

@Component
class CategorizeTriangleInteractor(

) {

    fun categorize() : String {

        val isNotValidTriangle = !Triangle.validate()

        if (isNotValidTriangle)
            throw IllegalShapeException()


    }
}