//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun saudacao(nome: String?, idade: Int?): String{
    return ("Olá, "+nome+" ! "+"Você tem "+idade+" anos!")
}
fun main() {
    val nome: String?
    val idade: Int?

    println("Entre com seu nome: ")
    nome = readLine()

    println("Entre com sua idade: ")
    idade = readLine()?.toIntOrNull()

    val retorno = saudacao(nome, idade)
    println(retorno)
}