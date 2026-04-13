//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("---- Início do programa ---")
    print("Entre com um valor numérico inteiro: ")
    val N = readLine()?.toIntOrNull()

    if (N == null) {
        println("Por favor, entre com um numero inteiro válido")
    }else{
        println("Valor N entrado: $N")
        if(N<10){
            println("Valor inválido")
        } else{
            for (i in 1..N){
                println("$i. USCS")
            }
        }
    }
    println("---- Fim do programa ---")
}