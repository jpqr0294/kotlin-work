// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(tri: Triangle): Boolean {
    val (a, b, c) = tri
    if ((a < b+c) && (b < a+c) && (c < a+b)) {
        return true
    }
    else {
        return false
    }
}

fun triangleArea(tri: Triangle): Double {
    val (a, b, c) = tri
    
    val s = 0.5*(a + b + c)
    val area = sqrt(s*(s-a)*(s-b)*(s-c))

    return area
}