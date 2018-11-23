package self.project.polydator.controllers

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import self.project.polydator.Triangle

@RestController
@RequestMapping("/v1/categorize")
class CategorizationController {

    @PostMapping("/triangle")
    fun categorizeTriangle(@RequestBody triangle: Triangle): String {
        return "ok"
    }
}