import java.util.*

fun main(){
    val sc = Scanner(System.`in`)

    var num = sc.nextInt()

    print(divisible(num))

}

fun divisible(num : Int): Boolean{
    return num%5==0
}