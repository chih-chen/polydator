package self.project.polydator.triangle

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class TriangleTest {

    @Test
    fun `should return true when sides are valid 1`() {
        val triangle = Triangle(2, 2, 3)
        val result = triangle.validate()
        assertTrue(result)
    }

    @Test
    fun `should return true when sides are valid 2`() {
        val triangle = Triangle(4, 2, 3)
        val result = triangle.validate()
        assertTrue(result)
    }

    @Test
    fun `should return true when sides are valid 3`() {
        val triangle = Triangle(3, 3, 3)
        val result = triangle.validate()
        assertTrue(result)
    }

    @Test
    fun `should return false when sides are not valid`() {
        val triangle = Triangle(1, 2, 3)
        val result = triangle.validate()
        assertFalse(result)
    }

    @Test
    fun `should categorize as equilateral`() {
        val triangle = Triangle(3, 3, 3)
        val result = triangle.categorize()
        assertEquals(Equilateral, result)
    }

    @Test
    fun `should categorize as isosceles`() {
        val triangle = Triangle(3, 3, 2)
        val result = triangle.categorize()
        assertEquals(Isosceles, result)
    }

    @Test
    fun `should categorize as scalene`() {
        val triangle = Triangle(4, 2, 3)
        val result = triangle.categorize()
        assertEquals(Scalene, result)
    }
}