fun main(){
    val valueA = 65
    val valueB = 52
    val valueC = 78

    val result = calculate(valueA, valueB, null)
    println("""
        Result value is $result
    """.trimIndent())
}

fun calculate(valueA: Int, valueB: Int, valueC: Int?): String {

    val result =  valueA + (valueB - (valueC?:100))
    return generateResult(result.toString())
}


fun generateResult(result: String) = "$result"