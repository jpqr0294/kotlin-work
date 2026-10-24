// Task 12.3.2: demo of Person class with secondary constructor

fun main() {
    val date = "2006-11-28"
    val person = Person("  ", date).apply {
        isMarried = true
    }

    println("${person.name}, ${person.birth}, ${person.isMarried}")
}