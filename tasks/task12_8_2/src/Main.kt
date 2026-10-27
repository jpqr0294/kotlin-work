// Task 12.8.2: program to manipulate playing cards

fun main() {
    val deck = mutableListOf<Card>()

    for (suit in Suit.entries) {
        Rank.entries.forEach{
            deck.add(Card(it, suit))
        }
    }
    
    deck.shuffle()
    for (i in deck) {
        println()
    }
}