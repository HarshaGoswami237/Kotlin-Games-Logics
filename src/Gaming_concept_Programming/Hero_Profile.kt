//Creating hero profile for Practice Data types

//🏆 The Ultimate Hero Data Challenge
//Try to write the code to store these 5 specific pieces of data for your character. You'll need to choose the correct type (String, Int, Double, or Boolean) for each:
//
//Hero ID: A unique "Code Name" or ID that never changes once assigned. 🆔
//
//Current Level: A whole number that starts at 1 but will go up as you play. 🆙
//
//Critical Hit Multiplier: A decimal number (like 2.5) used to multiply damage. 💥
//
//Premium Status: A true/false check to see if the player has the "Battle Pass." 💎
//
//Main Weapon: The name of the weapon currently equipped. 🗡️

package Gaming_concept_Programming
fun main(){
        // --- Hero  Properties ---
    val Hero_ID : String =  "HP727"
    var Hero_Level : Int = 1
    var Critical_Multiplier : Double = 2.5
    var Battle_Pass : Boolean = false
    var Main_Weapon : String = "Sword"

    // === Printing Details ===
    println(" --- Showing Details --- ")
    println("1. Hero ID : $Hero_ID")
    println("2. hero Level : $Hero_Level")
    println("2. Critical Multiplier : $Critical_Multiplier")
    println("3. Battle Pass Status : $Battle_Pass")
    println("4. Main Weapon : $Main_Weapon")
}
