// Task 5.2.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if(args.size != 1) {
        println("Error, must input radius on command line")
        exitProcess(1)
    }

    val rad = args[0].toDouble()

    val area = circleArea(rad)
    val perim = circlePerimeter(rad)

    println("The area of the circle is %.4f. \nThe perimeter of the circle is %.4f.".format(area, perim))
}