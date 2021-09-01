import java.util.*

fun main(){
    var sc = Scanner(System.`in`)
    var limit = sc.nextInt()

    var sum = 0

    for (i in 0..limit){
        if (i%3==0){
            sum+=i;
        }
    }

    print(sum)
}