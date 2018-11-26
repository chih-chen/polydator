package self.project.polydator.categorization

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import self.project.polydator.Coordinate

@RestController
@RequestMapping("/v1/categorizePolygons")
class CategorizationController(
        private val categorizationInteractor: CategorizationInteractor
) {

    @PostMapping("/")
    fun categorize(@RequestBody coordinates: List<Coordinate>): String {
        return categorizationInteractor.categorizePolygons(coordinates)
    }
}