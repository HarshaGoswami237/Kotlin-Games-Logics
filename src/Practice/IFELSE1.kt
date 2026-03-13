package Practice

// if else practice question
fun main(){
    val forbiddenCode = 1234
    val providedCode = 5555

    if (providedCode in 1000..9999 && providedCode != forbiddenCode){
        println("Provided Code : $providedCode \n Is a Valid Code.")
    }else{
        println("Provided Code : $providedCode\n Is a Forbidden Code.")
    }
    val math = 80
    val science  = 85
    val history = 90
    val  total_sub = 3

    val  average = (math.toDouble()+science+history)/3
    println("Total Sub : $total_sub")
    println("Average Sub : $average")


}