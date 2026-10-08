// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: Must input 3 marks")
        exitProcess(1)
    }

    val mark1 = args[0].toFloat()
    val mark2 = args[1].toFloat()
    val mark3 = args[2].toFloat()

    val total = mark1 + mark2 + mark3
    val avg = (total/3).roundToInt()

    val grade = when (avg) {
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
        else -> "Errmmmmm"
    }

    println(grade)
}