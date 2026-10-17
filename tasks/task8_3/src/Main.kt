// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if(args.size != 1) {
        println("Must enter filename on command line")
        exitProcess(1)
    }
    val fName = args[0]
    val tempData = fetchData(fName)

    val lowestTemp = tempData.minBy {it.second}
    val highestTemp = tempData.maxBy {it.second}
    val avgTemp = tempData.map {it.second}.average()

    println("Lowest temperature is ${lowestTemp.second} at ${lowestTemp.first}")
    println("Warmest temperature is ${highestTemp.second} at ${highestTemp.first}")
    println("Average temperature of all stations is $avgTemp")

    // tempData.sortedBy {it.second}.forEach {println(it)}

    val neg = tempData.filter {it.second < 0 }.forEach {println(it)}

}
