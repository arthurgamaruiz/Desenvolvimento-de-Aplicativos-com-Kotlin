//calcula o imc de uma pessoa
fun IMC(peso: Double, altura: Double): Double{
    return peso/(altura*altura)
}


fun main() {
    val peso: Double
    val altura: Double

    print("Digite seu peso em kg: ")
    peso = readLine()!!.toDouble()

    print("Digite sua altura em metros: ")
    altura = readLine()!!.toDouble()

    println("Seu IMC é: "+IMC(peso, altura)+" kg/m²")
}