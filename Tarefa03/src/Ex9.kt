fun main() {
    var soma = 0;
    for (i in 1..10) {
        print("Digite o $i numero: ")
        var n1 = readLine()!!.toInt()
        soma +=n1
    }
    println("A soma de todos os elementos é: $soma")
}