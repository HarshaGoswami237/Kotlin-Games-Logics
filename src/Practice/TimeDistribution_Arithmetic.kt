//this file is for converting seconds into diffrent Time Distribution
//Declare val totalSeconds: Int = 9876543.
//
//Calculate val days = ...
//
//Calculate val hours = ... (The hours left over after removing full days).
//
//Calculate val minutes = ... (The minutes left over after removing full hours).
//
//Calculate val seconds = ... (The seconds left over after removing full minutes).

package Practice

fun main() {

    var seconds = 9876543 // seconds

    var days = seconds / (60* 60 *24)
    var remday = seconds % (60* 60* 24)

    var hour = remday / (60 * 60)
    var remhour = remday % (60*60)

    var minute = remhour /(60)
    var sec = remhour % (60)


    println("Days: $days")
    println("Hours: $hour")
    println("Minutes: $minute")
    println("Second: $sec")
}

