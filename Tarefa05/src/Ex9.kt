//calcula o Fibonacci de n
fun fibonacci(n:Int): Int{
    if(n==0) return 0
    if(n==1) return 1
    return fibonacci(n-1)+fibonacci(n-2)
}

fun main() {
    val n: Int

    print("Digite um número: ")
    n = readLine()!!.toInt()
    println(fibonacci(n))
}
