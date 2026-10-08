// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess
import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("ERROR: Must have start end and jump")
        exitProcess(1)
    }
    var tempC = args[0].toFloat()
    val end = args[1].toFloat()
    val jump = args[2].toFloat()

    println("  Celsius|  Farenheit")
    println("---------------------")

    while (tempC <= end) {
        val tempF = (tempC*1.8) + 32
        println("%7.1f | %7.1f".format(tempC, tempF))

        tempC += jump
    }
}
