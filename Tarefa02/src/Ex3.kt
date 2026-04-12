fun main(){
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toDouble()

    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toDouble()

    print("Digite a terceira nota: ")
    val nota3 = readLine()!!.toDouble()

    var media = (nota1+nota2+nota3)/3

    if (media >= 6.0){
        println("Aprovado")
    }
    else{
        println("Reprovado")
    }
}
