package self.project.polydator.categorization

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/categorize")
class CategorizationController(
        private val categorizationInteractor: CategorizationInteractor
) {

    @PostMapping
    fun categorize(@RequestBody sides: List<Int>): Map<String, String> {
        val (shape, type) = categorizationInteractor.categorizePolygons(sides)
        return mapOf("shape" to shape, "type" to type)
    }
}