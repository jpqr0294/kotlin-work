// Task 4.2: use of if and ranges

fun main() {
    println("PIZZA MENU\na) Margherita\nb) Pepperoni\nc) Hawaiian\nd) Vegetarian")

    print("Choose your option (a-d): ")
    val option = readln().lowercase()

    if (option.length != 1) {
        println("Invalid input. Please enter a single character.")
        return
    }
    
    if (option[0] in 'a'..'d') {
        println("Order Accepted")
    }
    else {
        println("Invalid choice!")
    }
}
