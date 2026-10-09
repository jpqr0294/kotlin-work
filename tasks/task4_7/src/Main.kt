// Task 4.7: finding the longest line in a file
import kotlin.io.path.*
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: must input file path")
        exitProcess(1)
    }

    val path = Path(args[0])
    var largest = 0
    var maxLength = 0
    var count = 1

    path.useLines {
        for (line in it) {
            if (line.length > maxLength) {
                largest = count
                maxLength = line.length
            }
        count += 1
        }
    }
    println("Line $largest is the longest (length = $maxLength)")
}