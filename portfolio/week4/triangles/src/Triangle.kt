// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    val perimeter get() = sideA + sideB + sideC
    val semiPerimeter get() = perimeter / 2
    val area get() = sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC))

    init {
        if ((sideA >= sideB+sideC) || (sideB >= sideA+sideC) || (sideC >= sideA+sideB)) {
            throw IllegalArgumentException("Invalid Triangle")
        }
    }
    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}