// Task 7.7.1: program to compute stats for a numeric dataset
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: filename required as sole argument")
        exitProcess(1)
    }

    val myList = readData(args[0])

    val listMin = myList.min()
    val listMax = myList.max()
    val listMean = myList.average()

    val listMed = median(myList)

    println("Minimum of the list is $listMin")
    println("Maximum of the list is $listMax")
    println("Mean of the list is $listMean")
    println("Median of the list is $listMed")
}