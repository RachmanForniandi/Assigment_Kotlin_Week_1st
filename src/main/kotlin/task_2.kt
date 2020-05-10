fun main(){

    val arrayNumber = arrayOf(1,2,3,4,5,6,7,8,9,10)

    for (i in arrayNumber){
        val number = i%2
        when(number){
            0 -> println(i)
        }
    }
}