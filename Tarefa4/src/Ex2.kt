fun main(){
     val notas_alunos: DoubleArray = DoubleArray(10)
     var acimaMedia = 0;
     var media= 0.0;

     for(i in 0 until 10){
         print("Digite a nota do aluno ${i+1}: ")
         notas_alunos[i] = readLine()?.toDoubleOrNull() ?:0.0
     }
     media = notas_alunos.sum()/notas_alunos.size
     for(nota in notas_alunos){
         if(nota > media){
             acimaMedia++
         }
     }
     println("Alunos acima da média: $acimaMedia")
     print("Média da turma: $media")
}