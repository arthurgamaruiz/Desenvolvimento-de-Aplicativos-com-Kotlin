fun verificaMaioridade(idade: Int): Boolean{
    if(idade>=18) return true
    return false
}

fun main() {
    val idade: Int;
    println("Digite sua idade: ")
    idade = readLine()!!.toInt()
    print("É maior de idade ? "+verificaMaioridade(idade))
}