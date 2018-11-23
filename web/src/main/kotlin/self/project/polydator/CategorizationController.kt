package self.project.polydator

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod.POST
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/categorize")
class CategorizationController {

    @RequestMapping("/triangle", method = [POST])
    fun categorizeTriangle(coordinates: Triple<Int, Int, Int>): String {
        return "ok"
    }
}