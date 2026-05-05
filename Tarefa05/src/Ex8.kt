fun listaQuadrados(n: Int){
    for (i in 1..n) {
        println(i*i)
    }
}

fun main() {
    val n: Int
    print("Digite um número: ")
    n = readLine()!!.toInt()
    listaQuadrados(n)
}