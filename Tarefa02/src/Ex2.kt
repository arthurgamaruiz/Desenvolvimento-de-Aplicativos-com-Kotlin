fun main(){
    print("Digite um valor inteiro: ")
    var numero = readLine()?.toInt()

    if (numero == null){
        println("Entrada invalida.")
    }else{
        if(numero % 2 == 0){
            println("O número digitado é par")
        }
        else{
            println("O número digitado é ímpar")
        }
    }
}