//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("----- Início do programa -----")
   val array = IntArray(10)
   println("Entre com 10 valores numéricos inteiros: ")

   for(i in 0 until 10){
     print("Digite o valor do número ${i+1}: ")
     array[i] = readLine()?.toIntOrNull() ?: 0    //trata valroes ulos como ExceptionInInitializerError
   }
   println("--------- Elementos armazenados ---------")
   for(i in 0 until 10){
     println(array[i])
   }

   println("-----------------------")
   print("Entre com valor a ser consultado no array: ")
   val valor = readLine()?.toIntOrNull() ?: return

   for(i in 0 until 10){
     if(array[i] == valor){
       println("Valor $valor existente no array.")
       println("------ Fim do programa ------")
       return
     }
   }
   println("Valor $valor não existente no array.")
   println("------ Fim do programa ------")
}