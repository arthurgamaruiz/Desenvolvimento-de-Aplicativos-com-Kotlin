fun main() {
    print("Digite o sua idade: ")
    val idade = readLine()!!.toInt()

    if (idade > 18 && idade < 67)
        println("Você pode doar sangue!")
    else    println("Você não pode doar sangue.")
}