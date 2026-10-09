// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDice(sides: Int = 6, numDice: Int = 1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        var total = 0
        println("Rolling $numDice d$sides")
        for(n in 1..numDice) {
            val result = Random.nextInt(1, sides+1)
            total += result
        }
        println("You got $total from $numDice d$sides")
    } 
    else {
        println("Error: cannot have a $sides-sided die")
    }
}