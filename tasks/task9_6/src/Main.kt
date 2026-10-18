// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    require(args.size == 1) {"Exactly one argument (filename) is required"}

    val filename = args[0]

    try {
        val dtst = readData(filename)

        if (dtst.isEmpty()) {
            throw IllegalArgumentException("Dataset is empty")
        }

        val varValue = variance(dtst)

        println("Dataset size: ${dtst.size}")
        println("Variance: %.5f".format(varValue))

    } catch (e: NumberFormatException) {
        println("NumberFormatException: ${e.message}")
        exitProcess(1)
    
    } catch (e: IllegalArgumentException) {
        println("IllegalArgumentException: ${e.message}")
        exitProcess(1)

    } catch (e: Exception) {
        println("Exception: ${e.message}")
        exitProcess(1)
    }

}
