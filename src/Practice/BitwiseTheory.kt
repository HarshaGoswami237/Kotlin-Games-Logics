//// Bitwise Operations Practice
//Let's do a "Normal" practice first. No big logic yet—just understanding how the bits move.
//
//The Scenario:
//A player has a "Status Byte." Each bit is a different effect.
//Bit 1 (Value 1): Poisoned
//Bit 2 (Value 2): Burning
//Bit 3 (Value 4): Frozen

//The Task: Create BitwiseTheory.kt.
//Declare val currentStatus = 3 (This is binary 0011 -> Poisoned + Burning).
//Declare val iceSpell = 4 (This is binary 0100 -> Frozen).
//The "Add Effect" Logic: Use val newStatus = currentStatus or iceSpell.

//What happens? It combines the bits. 0011 OR 0100 = 0111 (Value 7).
//The "Check Effect" Logic: Use val isFrozen = (newStatus and iceSpell) > 0.
//What happens? If the "Frozen" bit is in there, the result will be 4 (greater than 0).
//Try writing this small file. Does it make sense how or "adds" a status and and "checks" for one?

package Practice
fun main(){
    // Trackinng values
    val Current_Status = 3
    val ice_Spell = 4
    var New_Status = ice_Spell or Current_Status
    var isfrozen = (New_Status and ice_Spell) > 0

    // Displayinng status
    println("\n\t\t -- Showing Status -- \n ")
    println("Current_Status : $Current_Status")
    println("ice_Spell : $ice_Spell")
    println("New Status : $New_Status")
    println("Is Frozen : $isfrozen")
}

