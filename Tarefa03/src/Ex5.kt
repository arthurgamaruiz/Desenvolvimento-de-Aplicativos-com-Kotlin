fun main() {
    print("Digite um valor inteiro: ")
    var valor = readLine()!!.toInt()

    if(valor<10){
        println("Valor inválido")
    } else{
        for(i in 1..valor){
            println("USCS")
        }
    }
}