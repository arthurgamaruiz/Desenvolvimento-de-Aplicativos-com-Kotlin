 fun main(){
     println("Digite os elementos do array: ")
     val q: IntArray = IntArray(10)
     var menor = 1;
     var index = 0;
     for(i in 0 until 10){
         print("Digite o elemento ${i+1}: ")
         q[i] = readLine()?.toIntOrNull()?:0
         if(q[i] < 0){
             print("Erro! Digite apenas números positivos.")
             break
         }
         if(q[i] < menor){
             menor = q[i]
             index = i
         }
     }
     println("Menor elemento: ${menor}")
     print("Índice do menor elemento: ${index}")
 }