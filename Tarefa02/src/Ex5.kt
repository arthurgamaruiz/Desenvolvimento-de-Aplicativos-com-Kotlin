fun main() {
    print("Digite o preço do produto: ")
    val preco = readLine()!!.toDouble()
    print("Digite a quantidade desse produto: ")
    val quantidade = readLine()!!.toInt()
    var total = preco * quantidade;

    if (quantidade >= 10){
        total *=0.9
    }

    println("Preço: R$ $preco\nQuantidade: $quantidade\nTotal da compra: R$     $total")
}