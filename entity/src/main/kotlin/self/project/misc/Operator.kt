package self.project.misc

import self.project.polydator.Coordinate
import kotlin.math.hypot
import kotlin.math.sqrt

operator fun Coordinate.minus(other: Coordinate): Double {
    val sumOfSquares = hypot(other.x.minus(this.x), other.y.minus(this.y))
    return sqrt(sumOfSquares)
}