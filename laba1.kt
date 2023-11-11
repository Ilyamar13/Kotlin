fun main () {
var a = 10
var b = 15
println(a+b)
println(a-b)
println(a*b)
println(a/b)

if(a > b){
    print("$a, Больше")
}else print("$b, Больше")

var number = 41 
if(number % 2 == 0){ 
    print("Число четное") 
} else{ 
    println("Число нечетное") 
} 

for(i in 1..5){
    for(a in 1..5){
        print("${i * a} \t")
    }
    println()
}

var i = 10
while(i > 0){
    println(i*i)
    i--;
}

}
data class Card(val rank: String, val suit: String) 
 
class Deck { 
    val cards = mutableListOf<Card>() 
 
    init { 
        val ranks = listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "В", "Д", "К", "Т") 
        val suits = listOf("Червы", "Бубны", "Трефы", "Пики") 
 
        for (suit in suits) { 
            for (rank in ranks) { 
                cards.add(Card(rank, suit)) 
            } 
        } 
    } 
 
    fun printDeck() { 
        cards.forEach { println("${it.rank} ${it.suit}") } 
    } 
 
    fun sortDeck() { 
        cards.sortWith(compareBy({ it.suit }, { rankToInt(it.rank) })) 
    } 
 
    private fun rankToInt(rank: String): Int { 
        return when (rank) { 
            "2" -> 2 
            "3" -> 3 
            "4" -> 4 
            "5" -> 5 
            "6" -> 6 
            "7" -> 7 
            "8" -> 8 
            "9" -> 9 
            "10" -> 10 
            "В" -> 11 
            "Д" -> 12 
            "К" -> 13 
            "Т" -> 14 
            else -> 0 
        } 
    } 
} 
 
fun main() { 
    val deck = Deck() 
    println("Исходная колода:") 
    deck.printDeck() 
 
    deck.sortDeck() 
    println("\nОтсортированная колода:") 
    deck.printDeck() 
}
