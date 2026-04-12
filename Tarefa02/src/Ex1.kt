//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("----- Início do Programa ------")
    print("Entre com um valor numérico inteiro: ")

    //operador ?: executa o próximo método apenas se o valor não for null
    val valor = readLine()?.toInt()
    if (valor != null) {
        print("Valor entrado: $valor\n")

        if(valor > 10){
            println("Valor encontrado maior que 10!")
        }
        else{
            println("Valor encontrado não é maior que 10")
        }
    }
    else{
        println("Entrada inválida. Por favor, digite um número inteiro.")
    }

    println("------Fim do programa ------")
    println("Pressione enter para sair...")
    readLine()
}