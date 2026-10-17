// Task 7.2: array comparison
fun main() {
    val numbers = intArrayOf(9, 3, 6, 2, 8, 5)

    val cls = numbers::class
    
    println(cls.qualifiedName)
    println(cls.java)

    println(numbers.slice(2..4))
}