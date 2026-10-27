// Task 12.4.1: main program

fun main() {

    val myCircle = Circle(Point(10.0 , 7.5), 5.0)

    println("area: ${myCircle.area()}")
    println("perimeter: ${myCircle.perimeter()}")

    val p = Point(8.0, 8.0)

    if (myCircle.contains(p)) {
        println("circle contains p(8.0, 8.0)")
    }
    else{
        println("Circle does not contain p")
    }
}