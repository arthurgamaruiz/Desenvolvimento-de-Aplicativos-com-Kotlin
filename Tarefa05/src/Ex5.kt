//concatena duas strings
fun concatenaStrings(str1: String, str2: String) = str1.plus( str2)

fun main() {
    val str1: String
    val str2: String

    println("Digite a primeira string: ")
    str1 = readLine()!!

    println("Digite a segunda string: ")
    str2 = readLine()!!

    println(concatenaStrings(str1, str2))
}