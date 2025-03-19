import javax.print.attribute.standard.Media

// conjunto de armazenamento onde pode se guardar variaveis dentro de uma so variavel
data class Alunos(
    var alu: String,
    var notas: Double,
    var notas1: Double,
    var media: Double
){
    val situacao: String
        // get usado para aplicar uma situaçao

        get() = if (media >= 5.0) "Aprovado" else "Reprovado"
    }

val escola = mutableListOf<Alunos>()
var opcoes = 0
fun main() { // loop infinito
    while (true) {
        println(
            "Seu menu de opçoes\n" +
                    "1-Cadastrar alunos\n" +
                    "2-Pesquisar alunos\n" +
                    "3-Classificar alunos\n" +
                    "4-Apresentar todos os alunos\n" +
                    "5-Sair"
        )
        println("escolha uma opção:")
        var escolha = readln().toIntOrNull()

        when (escolha) {

            1 -> { cadasalunos()
            }
            2 -> { pesquisaralunos()
            }
            3 -> { clasalunos()
            }
            4 -> { apresentaralunos()
            }
        }
    }
}
fun cadasalunos() {
    println("Qual aluno você deseja cadastrar? ")
    var alu = readln().toString()
    println("Qual nota você deseja designar ao aluno $alu?")
    var notas = readln().toDouble()
    while (notas > 10.0 || notas < 0.0) {
        println("Notas inválidas Digite novamente: ")
        notas = readln().toDouble()
        }
    println("Digite outra nota: ")
    var notas1 = readln().toDouble()
    while (notas1 > 10.0 || notas1 < 0.0) {
        println("Nota inválida Digite novamente: ")
        notas1 = readln().toDouble()
    }
    val media = (notas+notas1)/2
    escola.add(Alunos(alu, notas , notas1 , media ))
        println("Deseja cadastrar novos alunos?")
        var sim = "sim"
        sim = readln()
        if (sim == "sim") {
            cadasalunos()
        } else {
            println("Cadastro realizado com sucesso")
        }
    }

  fun pesquisaralunos() {

      println("Qual aluno você deseja encontrar? ")
      var acharaluno = readln()

      var procuraraluno = escola.find { it.alu.equals(acharaluno, ignoreCase = true) }

      if (procuraraluno == null) {
          println("Aluno não encontrado")
      } else {
          println("Aluno encontrado $procuraraluno , ${procuraraluno.situacao} ")
                                                                       // get()
      }
  }
  fun  clasalunos() {
      // ordena a agenda
      escola.sortedBy { it.alu }
      print("Lista ordenada com sucesso")
  }
                   fun apresentaralunos() {
                       if (escola.isEmpty()) {
                           println("Nenhum aluno encontrado")
                           sair()
                       } else {
                           val classic = escola.sortedBy { it.alu } // Ordena a lista
                           println("Lista de alunos em ordem alfabética:")
                           classic.forEach { aluno ->
                               println("Aluno: ${aluno.alu}, Nota: ${aluno.notas}, Média: ${aluno.media} Situação: ${aluno.situacao}")
                           }
                       }
                   }
                   fun sair(){
                       cadastro()
                   }