//This file is for practicing is else logic

//⚔️ The Combat Logic Challenge
//Let's simulate a boss fight. We want to check if our hero is strong enough to defeat a "Shadow Dragon" (which requires Level 5).
//Try writing a new Kotlin file with a main function that does the following:
//
//Create a variable heroLevel and set it to 1.
//
//Use an if statement to check if heroLevel is greater than or equal to 5.
//
//If it is, println "The Shadow Dragon is defeated! 🐉".
//
//Use an else block to println "You are too weak... retreat! 🏃‍♂️".

package Gaming_concept_Programming

fun main(){
    val Hero_Level  : Int = 1
    var Dragon_Level : Int = 5

    if(Hero_Level > Dragon_Level) println("Dragon Worrier is Defeated")
    else println("HAHA! you are Weak")
}

