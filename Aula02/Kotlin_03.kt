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

    //Arrays
    val names = arrayOf("jim", "John", "Jenny")     //cria um array
    println(names.contentToString())                //exibe o array

    //cria dois arrays numéricos
    val numbers1 = arrayOf(1,2,3,4,5)
    val numbers2 = arrayOf(10,20,30,40,50,60,70);

    //somador 
    var r=0;
    //percorre os arrays
    var i=0;
    
    while(i < numbers1.size && i< numbers2.size){
        if(i%2==0){
            r+= numbers1[i] + numbers2[i]
        }
        i++;
    }
    println(r)
}   