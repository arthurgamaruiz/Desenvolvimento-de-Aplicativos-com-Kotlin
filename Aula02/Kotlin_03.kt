fun main(args: Array<String>) {
    //atribuições em kotlin não retornam valor
    var a = 10;
    var b = 2;
    var x: Int

    while(a % b != 0){
        x = a%b
        a = b;
        b = x
    }
    println(b)

    /*Tipos primitivos (básicos):
        Inteiro (Int)
        Long (Long)
        Byte (Byte)
        Curto (Short)
        Ponto Flutuante (Float)
        Duplo (Double) 
    */
    //conversão de um tipo numérico para outro
    val intVal = 10
    val doubleval = intVal.toDouble()       //converte int para double
    
}