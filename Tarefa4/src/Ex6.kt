 fun main(){
     println("Digite os elementos de um aray")
     val array: IntArray = IntArray(10)

     for(i in 0 until 10){
         print("Digite o elemento ${i+1}: ")
         array[i] = readLine()?.toIntOrNull()?:0
     }
     println("Array na ordem inversa: ${array.reversedArray().contentToString()}")

 }