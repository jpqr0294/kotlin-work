// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate

fun main() {
    val date = LocalDate(2006,11,28)
    val pers = Person("hello", date)

    pers.name = ""
    println(pers.name)
}