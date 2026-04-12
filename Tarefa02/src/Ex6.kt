fun main() {
    print("Digite o primeiro número: ")
    val n1 = readLine()?.toInt()

    print("Digite o segundo número: ")
    val n2 = readLine()?.toInt()

    if(n1==n2) println("Valores entrados iguais")
    else       println("Valores entrados são diferentes")
}