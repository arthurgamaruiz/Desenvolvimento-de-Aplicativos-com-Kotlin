fun main(){
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toDouble()

    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toDouble()

    print("Digite a terceira nota: ")
    val nota3 = readLine()!!.toDouble()

    var media = (nota1*2+nota2*3+nota3*4)/9

    println("Notas digitadas: $nota1, $nota2, $nota3.\nA média ponderada delas é $media")
    if(media >= 5.0)    println("Aprovado")
    else                println("Reprovado")
}