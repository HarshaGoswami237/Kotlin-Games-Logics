// Arithmetic Practice Loot Spliter
//The Problem: "The Loot Splitter"
//A group of 7 warriors finds a chest with 12,345 Gold Coins.
//
//The Captain takes a fixed tax of 15% of the total first (Round down to the nearest whole number).
//
//The remaining gold is split equally among the 7 warriors.
//
//Any "leftover" coins that cannot be split equally go to the Local Orphanage.
package Practice

fun main() {
    val taxRate = 15
    val gold = 12345

    // Improvement 1: Calculation order (Multiply first!)
    val taxAmount = (gold * taxRate) / 100

    // Improvement 2: Clear steps (Easier to debug)
    val goldAfterTax = gold - taxAmount

    val warriorsShare = goldAfterTax / 7
    val orphanageShare = goldAfterTax % 7

    println("Total Gold: $gold")
    println("Captain's Tax: $taxAmount") // Showing the actual tax taken
    println("Gold After Tax: $goldAfterTax")
    println("Warriors Share: $warriorsShare")
    println("Orphanage Share: $orphanageShare")
}