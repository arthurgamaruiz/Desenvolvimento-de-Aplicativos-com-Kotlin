fun main(){
     print("Digite os elementos do array: ")
     val q: IntArray = IntArray(10)
     var maior = 0;
     var index = 0;
     for(i in 0 until 10){
         print("Digite o elemento ${i+1}: ")
         q[i] = readLine()?.toIntOrNull()?:0
         if(q[i] < 0){
             print("Erro! Digite apenas números positivos.")
             break
         }
         if(q[i] > maior){
             maior = q[i]
             index = i
         }
     }
     println("Maior elemento: ${maior}")
     print("Índice do maior elemento: ${index}")
 }