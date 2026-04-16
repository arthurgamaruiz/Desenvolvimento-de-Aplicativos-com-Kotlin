 fun main(){
     print("Digite os elementos do array: ")
     val a: IntArray = IntArray(10)
     val x: Int
     val m: IntArray = IntArray(10)
     for(i in 0 until 10){
         print("Digite o elemento ${i+1}: ")
         a[i] = readLine()?.toIntOrNull()?:0
     }
     //leitura do elemento a mais
     print("Digite mais um elemento: ")
     x = readLine()?.toIntOrNull()?:0;

     for(i in 0 until 10){
         m[i] = a[i]*x
     }
     print("Array M: ${m.contentToString()}")
 }