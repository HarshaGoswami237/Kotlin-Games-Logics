package Practice

import kotlin.math.roundToInt

//Billing Program
fun  main(){
    val ProductPrice = 19.99f
    var total = ProductPrice*5
    var  discountedTotal =  total.roundToInt()

    //var  Total = ProductPrice.toFloat()*5;
    println("Total Amount : $total")
    println("Total Amount : $discountedTotal")

}