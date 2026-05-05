fun verificaParidade(numero: Int): Boolean{
    if(numero%2==0) return true
    return false
}

fun main() {
    val numero: Int;
    println("Digite um número: ")
    numero = readLine()!!.toInt()

    print("É par ? "+verificaParidade(numero))
}