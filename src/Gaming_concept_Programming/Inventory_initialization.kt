//The Inventory Initialization
//The Task:
//Create a new file VariablePractice.kt. You must declare variables for a Weapon using the GFG principles of Type Inference and Immutability.
//
//Declare a val called weaponID with an explicit type String (e.g., "WPN-99").
//
//Declare a val called weaponName using Type Inference (don't write : String).
//
//Declare a var called weaponDurability (e.g., 100) that can decrease.
//
//The Challenge: Try to reassign a new name to weaponName (e.g., weaponName = "Excalibur") and see what error IntelliJ gives you.
package Gaming_concept_Programming
fun main(){

    val weaponId : String = "WPN-99"
    val weaponName = "String"
    var weaponDurability = 100

//    weaponName = "Excalibur"
    //cannot assign actualy so commented line

    println("\t ==== Shwoing information ====");
    println("1: Weapon Name : $weaponName")
    println("2: Weapon Id : $weaponId")
    println("3: Weapon Durability : $weaponDurability")

}
