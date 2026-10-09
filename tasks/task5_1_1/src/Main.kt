// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if(args.size != 2) {
        println("Error: must input 2 strings on Command Line")
        exitProcess(1)
    }

    val word1 = args[0]
    val word2 = args[1]

    val result = anagrams(word1, word2)

    if(result) {
        println("The words are anagrams: $result")
    }
    else{
        println("The words are not anagrams: $result")
    }
}