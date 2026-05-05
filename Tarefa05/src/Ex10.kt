//calcula o fatorial de um número
fun fatorial(n:Int):Int {
    if(n==0) return 1
    return n*fatorial(n-1)
}

fun main() {
    val n: Int

    print("Digite um número: ")
    n = readLine()!!.toInt()
    println(fatorial(n))
}