fun main() {
    print("Digite um valor inteiro: ")
    var valor = readLine()!!.toInt()

    if(valor<=0){
        println("Valor inválido")
    } else{
        var contador = 0;
        while (contador <= valor){
            println("$contador")
            contador++
        }
    }
}