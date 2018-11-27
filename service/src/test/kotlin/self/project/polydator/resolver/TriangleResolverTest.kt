package self.project.polydator.resolver

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import self.project.polydator.exception.UnsupportedPolygonException
import self.project.polydator.triangle.Triangle

class TriangleResolverTest {

    lateinit var triangleResolver: TriangleResolver

    @Before
    fun setup() {
        triangleResolver = TriangleResolver()
    }

    @Test
    fun `should resolve to a triangle given three sides`() {
        val sides = listOf(2, 2, 3)
        val expectedResult = Triangle(a = 2, b = 2, c = 3)
        val result = triangleResolver.resolveShape(sides)
        assertEquals(expectedResult, result)
    }

    @Test(expected = UnsupportedPolygonException::class)
    fun `should throw when the number of sides is not supported`() {
        val sides = listOf(2, 2, 3, 5, 7, 7)
        triangleResolver.resolveShape(sides)
    }
}