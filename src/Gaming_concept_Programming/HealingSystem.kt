//🧪 Quest 1: The Healing Potion System
//In this practice, we aren't just checking "Dead or Alive." We are checking the state of the hero.
//
//The Logic Requirements:
//
//If HP is 100, print: "Health is Full. Potion wasted!"
//
//Else if HP is greater than 20, print: "Using Potion... Health restored!"
//
//Else (meaning HP is 20 or less), print: "EMERGENCY! Health too low for normal potion, use Mega-Heal!"

package Gaming_concept_Programming

fun main(){
    var HP : Int = 50;

    if(HP  == 100 || (HP >100) ){     println("Health is Full. Potion wasted!")       }
    else if(HP <=20){    println("EMERGENCY! Health too low for normal potion, use Mega-Heal!")       }
    else                println("Using Potion... Health restored!")

}