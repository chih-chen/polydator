package self.project.polydator.controllers

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/categorize")
class CategorizationController {

    @PostMapping("/triangle")
    fun categorizeTriangle(coordinates: Triple<Int, Int, Int>): String {
        return "ok"
    }
}