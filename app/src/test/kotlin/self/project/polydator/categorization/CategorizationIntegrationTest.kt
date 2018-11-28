package self.project.polydator.categorization

import org.junit.Assert.assertEquals
import org.junit.Test
import self.project.polydator.IntegrationTestCase

class CategorizationIntegrationTest : IntegrationTestCase() {

    override val url: String = "http://localhost:$port/v1/categorize"

    @Test
    fun `should categorize as scalene triangle given a list of valid triangle sides`() {
        val sides = listOf(2, 3, 4)
        val response = testRestTemplate.postForObject(url, sides, String::class.java)
        val expectedResponse = """{"shape":"Triangle","type":"Scalene"}"""
        assertEquals(expectedResponse, response)
    }

    @Test
    fun `should categorize as equilateral triangle given a list of valid triangle sides`() {
        val sides = listOf(8, 8, 8)
        val response = testRestTemplate.postForObject(url, sides, String::class.java)
        val expectedResponse = """{"shape":"Triangle","type":"Equilateral"}"""
        assertEquals(expectedResponse, response)
    }

    @Test
    fun `should categorize as isosceles given a list of valid triangle sides`() {
        val sides = listOf(2, 5, 5)
        val response = testRestTemplate.postForObject(url, sides, String::class.java)
        val expectedResponse = """{"shape":"Triangle","type":"Isosceles"}"""
        assertEquals(expectedResponse, response)
    }

    @Test
    fun `should fail when given invalid shape sides`() {
        val sides = listOf(2, 1, 1)
        val response = testRestTemplate.postForEntity(url, sides, Map::class.java)
        assertEquals(500, response.statusCodeValue)
        assertEquals("Invalid sides", response.body!!["message"])
    }


    @Test
    fun `should fail when given unsupported shape sides`() {
        val sides = listOf(2, 1, 1, 1, 7, 8, 3)
        val response = testRestTemplate.postForEntity(url, sides, Map::class.java)
        assertEquals(500, response.statusCodeValue)
        assertEquals("Unsupported shape", response.body!!["message"])
    }
}gs