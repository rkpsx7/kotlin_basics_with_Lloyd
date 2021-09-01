import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    var day = sc.next();

    when(day){
        "Monday" -> print("Mon")
        "Tuesday" -> print("Tues")
        "Wednesday" -> print("Wed")
        "Thursday" -> print("Thurs")
        "Friday" -> print("Fri")
        "Saturday" -> print("Sat")
    }
}