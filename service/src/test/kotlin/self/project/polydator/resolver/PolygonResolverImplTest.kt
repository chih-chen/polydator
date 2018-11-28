package self.project.polydator.resolver

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import self.project.polydator.exception.UnsupportedPolygonException
import self.project.polydator.triangle.Triangle

class PolygonResolverImplTest {

    lateinit var polygonResolverImpl: PolygonResolverImpl

    @Before
    fun setup() {
        polygonResolverImpl = PolygonResolverImpl()
    }

    @Test
    fun `should resolve to a triangle given three sides`() {
        val sides = listOf(2, 2, 3)
        val expectedResult = Triangle(a = 2, b = 2, c = 3)
        val result = polygonResolverImpl.resolveShape(sides)
        assertEquals(expectedResult, result)
    }

    @Test(expected = UnsupportedPolygonException::class)
    fun `should throw when the number of sides is not supported`() {
        val sides = listOf(2, 2, 3, 5, 7, 7)
        polygonResolverImpl.resolveShape(sides)
    }
}