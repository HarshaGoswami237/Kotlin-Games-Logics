//🧪 Quest 2: The Elemental Strike
//Create a new file called ElementalBattle.kt. We are going to use your Main_Weapon from the Hero Profile, but add an "Element" to it.
//
//Your Task:
//
//Declare var playerElement: String = "Fire"
//
//Declare var enemyElement: String = "Grass"
//
//Write the logic:
//
//If playerElement is "Fire" AND (&&) enemyElement is "Grass", print: "CRITICAL! Fire burns Grass! Damage x2"
//
//Else if playerElement is "Water" AND enemyElement is "Fire", print: "CRITICAL! Water douses Fire! Damage x2"
//
//Else, print: "Standard Hit. No elemental bonus."

package Gaming_concept_Programming
fun main(){
     val Weapon  : String =  "Sword"
     val Hero_Element : String =  "Grass"
     val Enemy_Element : String =  "Water"

    if(Weapon == "Sword"){
        //comparing Elements
        if (Hero_Element == "Fire" &&  Enemy_Element == "Grass"){ println("CRITICAL! Fire burns Grass! Damage x2")}
        else if(Hero_Element == "Water" && Enemy_Element == "Fire" ){ println("CRITICAL! Water douses Fire! Damage x2") }
        else if (Hero_Element == "Grass" && Enemy_Element == "Water"){ println("CRITICAL! Water Stopped Fire! Damage x2") }
        else println("Standard Hit. No elemental bonus.")
    }
    else println("No Weapon Selected")

}
