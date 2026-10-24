// Task 12.1: program that uses a Point object

fun main() {
    val p = Point(15.0, 7.5)
    println(p.x)
    println(p.y)

    println(p.distance())

    val p2 = Point(4.5, 7.5)

    println(p.distanceTo(p2))
}