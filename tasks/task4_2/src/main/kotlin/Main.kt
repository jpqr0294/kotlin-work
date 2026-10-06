// Task 4.2: use of if and ranges

fun Main() {
    println("PIZZA MENU\na) Margherita\nb) Pepperoni\nc) Hawaiian\nd) Vegetarian")

    print("Choose your option (a-d): ")
    val option = readln().lowercase()

    if (option.length != 1) {
        println("Invalid input. Please enter a single character.")
    }
    
    if (option in 'a'..'d') {
        println("Order Accepted")
    }
    else {
        println("Invalid choice!")
    }
}
