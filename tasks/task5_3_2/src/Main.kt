// Task 5.3.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if(args.size != 1) {
        println("Error, needs to be in form ndx where n is num dice and x is num sides")
        exitProcess(1)
    }
    var numD = args[0].substringBefore('d').toInt()
    var numSides = args[0].substringAfter('d').toInt()

    rollDice(sides=numSides, numDice=numD)
}