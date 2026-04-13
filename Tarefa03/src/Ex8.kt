fun main() {
    print("Digite um valor intero: ")
    var num = readLine()!!.toInt()

    if(num<=0)  println("Valor inválido")
    else{
        for(i in 0..num) {
            print("$i ")
        }
    }
}