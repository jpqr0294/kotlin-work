// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: must input limit")
        exitProcess(1)
    }

    val lim = args[0].toInt()
    var sum = 0
    for (n in 1..lim step 2) {
        sum += n
    }
    println(sum)
}
