package self.project.polydator

import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import java.net.URI

@RunWith(SpringRunner::class)
@SpringBootTest
@AutoConfigureMockMvc
abstract class IntegrationTestCase {

    abstract val url: URI

    @Autowired
    lateinit var controllerTemplate: MockMvc

}