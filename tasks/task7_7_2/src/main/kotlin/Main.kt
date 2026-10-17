// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)
    val db = createDatabase()
    db.load(CSV_FILENAME)

    while(true) {
        print("Enter a name: ")
        val name = readln()
        if (name.isBlank()) {
            println("Empty string enterred. Goodbye!")
            break
        }

        else if(name in db.keys) {
            println("Number for $name: ${db[name]}")
        }

        else {
            print("Enter the number for $name: ")
            val number = readln()

            db[name] = number

            db.save(CSV_FILENAME)
            println("Saved $name -> $number")
        }
    }
}
