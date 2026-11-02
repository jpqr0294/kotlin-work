// Task 12.9: demo program for class implementing Static Factory Method

import kotlinx.datetime.LocalDate

fun main() {
    val birthDate = LocalDate(1997, 8, 23)

    val p1 = Person.create("Dave", birthDate)
    val p2 = Person.create("Dave", birthDate)
}