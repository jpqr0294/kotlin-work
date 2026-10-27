// Task 12.8.1: demo program for Day enum class

fun main() {
    print("Enter a day: ")
    var myDay = readln()

    try {
        val day = Day.valueOf(myDay)
        println(day)
    } catch (error: IllegalArgumentException) {
        println("Invalid day!")
        println("Please enter one of: ")
        Day.entries.forEach {println(it)}
    }
}