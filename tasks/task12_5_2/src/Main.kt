// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate

fun main() {
    val date = LocalDate(2006,11,28)
    val pers = Person("FinLey", date)

    println(pers.name)
}