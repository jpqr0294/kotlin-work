// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main() {
    val date = LocalDate(2006,11,28)
    val pers = Person("hello", date)

    println(pers.age)
}