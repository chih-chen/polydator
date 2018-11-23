package self.project.polydator

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod.POST
import org.springframework.web.bind.annotation.RestController

@RestController
class CategorizationController {

    @RequestMapping(value = ["/v1/categorize/triangle"], method = [POST])
    fun categorizeTriangle(): String {
        return "ok"
    }
}