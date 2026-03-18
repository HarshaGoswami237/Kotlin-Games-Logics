//Instead of simple math, let's use these operators to create a Requirement Checker. We need to see if a player is eligible for a "Master Class" tournament.
//
//  --   The Requirements: --
//Level Requirement: Must be Level 50 or higher.
//Gold Requirement: Must NOT have 0 gold.
//PVP Rank: Their rank must be exactly 1.
//The Task: Create TournamentLogic.kt.
//  Declare val playerLevel = 49
//  Declare val playerGold = 500
//  Declare val pvpRank = 1//
//     -- Write the logic to create these Booleans: ---
//  val isLevelHighEnough (Use >=)
//  val hasGold (Use !=)
//  val isTopRank (Use ==)
//  The Final Boss Logic:
//  Create a variable val canEnter that checks if all three are true. (Note: Since we haven't officially "mastered" Logical Operators && yet, just print the three booleans separately for now).

package Gaming_concept_Programming
fun main(){

        // Test values
    var test_Gold = 10
    var Test_Level = 60
    val PVP_Rank = 1
    // minimum requirments
    val Level_Requirment = 50
    val Gold_Requirement = 1


    var Is_Enough_Level =  Test_Level >= Level_Requirment
    var Is_Enough_Gold = test_Gold >= Gold_Requirement
    var Is_TopRank =   PVP_Rank == 1

                // Match Making
    println("\t\t --- Match Making Requiremetns Cheking ---\n")
    if(Is_Enough_Level ){
        if(Is_Enough_Gold){
            if(Is_TopRank){
                println("Entering Tournaament..")
                println("Match Making.. Your Rand: $PVP_Rank")
            }else{
                println("Entering Tournaament..")
                println("Match Making.. ")
            }
        }else {
            println("You Dont Have Enough Gold.. Requirement did not match.")
            println(" You have : $test_Gold \n Required Level : $Gold_Requirement")
        }

    }
    else { println("Level Requirement did not match.")
        println(" Your Level : $Test_Level \n Required Level : $Level_Requirment")
        }

}
