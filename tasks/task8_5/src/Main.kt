// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val myString = "Hello. How Are You"

    val vowelCount = myString.howMany {it.lowercase() in "aeiou"}
    println("Vowel count: $vowelCount")

    val lowerCount = myString.howMany {it.isLowerCase()}
    println("There are $lowerCount lower case letters")

    //val lowerCount = myString.count {it.isLowerCase()}
    //println("There are $lowerCount lower case letters")
}
