package self.project.polydator.categorization

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.only
import com.nhaarman.mockito_kotlin.verify
import com.nhaarman.mockito_kotlin.whenever
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import self.project.polydator.categorization.exceptions.IllegalPolygonException
import self.project.polydator.categorization.gateways.PolygonResolver
import self.project.polydator.triangle.Triangle

class CategorizationInteractorTest {

    lateinit var categorizationInteractor: CategorizationInteractor
    lateinit var polygonResolver: PolygonResolver

    @Before
    fun setup() {
        polygonResolver = mock()
        categorizationInteractor = CategorizationInteractor(polygonResolver)
    }

    @Test
    fun `should categorize a valid triangle`() {
        val sides = listOf(2, 2, 3)
        val triangle = Triangle(
                a = sides[0],
                b = sides[1],
                c = sides[2]
        )
        whenever(polygonResolver.resolveShape(sides)).thenReturn(triangle)

        val expectedResult = Pair("Triangle", "Isosceles")
        val result = categorizationInteractor.categorizePolygons(sides)

        verify(polygonResolver, only()).resolveShape(sides)
        assertEquals(expectedResult, result)
    }

    @Test(expected = IllegalPolygonException::class)
    fun `should throw when a triangle is not valid`() {
        val sides = listOf(1, 2, 3)
        val triangle = Triangle(
                a = sides[0],
                b = sides[1],
                c = sides[2]
        )
        whenever(polygonResolver.resolveShape(sides)).thenReturn(triangle)

        categorizationInteractor.categorizePolygons(sides)

        verify(polygonResolver, only()).resolveShape(sides)
    }
}