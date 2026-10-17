// Task 7.3.1: list element access
fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers[0])
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())

    numbers[0] = 17
    numbers.add(1)

    println(numbers)

    numbers.addAll(listOf(12, 5, 5, 11, 7))
    println(numbers)

    numbers.remove(6)
    println(numbers)

    numbers.removeAll {it == 5}
    println(numbers)

    numbers.removeAt(1)
    println(numbers)

    numbers.clear()
    println(numbers)


}