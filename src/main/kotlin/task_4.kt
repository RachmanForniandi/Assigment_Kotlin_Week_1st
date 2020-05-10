fun main(){

    val value = 75

    val statusValue = when(value){
        in 90..100 -> "Terpuji"
        in 80..90 -> "sangat memuaskan "
        in 60..80 -> "memuaskan"
        else -> " tidak lulus"
    }
    println(statusValue)

}