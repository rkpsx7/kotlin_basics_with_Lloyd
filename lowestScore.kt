fun main(){
    val scores = arrayOf(10,20,5,40)

    var low = scores[0]

    for (i in scores){
        if (i<low){
            low = i
        }
    }

    print(low)
}