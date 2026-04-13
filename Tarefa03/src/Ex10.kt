fun main() {
    var soma = 0;
    for (i in 1..10) {
        print("Digite o $i numero: ")
        var n1 = readLine()!!.toInt()
        if(n1%2==0){
            soma += n1
        }
    }
    println("A soma dos elementos pares é: $soma")
}