fun soma2Numeros(a: Int, b: Int): Int{
    return a+b
}

fun main() {
    val a: Int;
    val b: Int;

    print("Digite o primeiro número: ")
    a = readLine()!!.toInt()

    print("Digite o segundo número: ")
    b = readLine()!!.toInt()

    println("Soma:"  + soma2Numeros(a, b))
}