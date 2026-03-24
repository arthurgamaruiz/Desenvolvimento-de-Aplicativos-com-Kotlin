fun main(){
    //ocorre inferência --> compilador infere o tipo da variável
    //não pode mudar o tipo do dado, pois é estaticamente tipada --> verifica tipos em tempo de compilação, ou seja, os tipos devem ser definidos previamente ou inferidos, garantindo que não mudem.

    //delcaração utilizando 'var'
    var a=5     //tipo do dado não foi declarado explicitamente
    println(a);
    var b: Int          //tipo definido explicitamente 
    b = 99
    println(b)

    //declaração utilizando 'val': Neste caso podem ser inicializadas apenas uma vez dentro do bloco de execução onde foram definidas. Isso as torna efetivamente em constantes e equivalem à palavra-chave 'final' em Java
    val c: String
    c = "Hello"
    println(c)

    val d: Char     
    d = 'a'             //caracter entre aspas simples 
    println(d)

    //expressões aritméticas, de comparação e lógicas:
    val soma = 5+3
    val produto = 7*2
    val isEqual = (5==5)
    println(isEqual)
    val isGreater = (5>3)
    println(isGreater)
    val andResult = (true && false)
    println(andResult)
    val orResult = (true || false)
    println(orResult)

    val e: Boolean
    e = (0==0)
    println(e)
}