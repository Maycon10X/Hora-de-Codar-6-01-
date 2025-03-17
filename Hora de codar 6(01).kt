
  // conjunto de armazenamento onde pode se guardar variaveis dentro de uma so variavel
    data class Pessoa(
    var nome : String ,
    var endereco : String ,
    var telefone: String
    )
   val agenda = mutableListOf<Pessoa>()
    var menu = 0
    fun main() { // loop infinito
        while (true) {
            println(
                "Seu menu de opçoes\n" +
                        "1-Cadastrar registros\n" +
                        "2-Pesquisar registros\n" +
                        "3-Classificar registros\n" +
                        "4-Apresentar todos os registros\n" +
                        "5-Sair"
            )
            println("escolha uma opção:")
            var escolha = readln().toIntOrNull()

            when (escolha) {

                1 -> { cadastro()


                }

                2 -> { pesquisa()

                }

                3 -> { classificar()

                }

                4 -> { apresentar()

                }
            }
        }
    }
    fun cadastro(){
        println("Qual usuário você deseja cadastrar na agenda? ")
        var nome = readln()
        println("Qual endereço você deseja cadastrar na agenda? ")
        var endereco = readln()
        println("Qual número de telefone você deseja cadastrar na agenda? ")
        var telefone = readln()
        agenda.add(Pessoa(nome, endereco, telefone))
        println("Cadastro realizado com sucesso")
    }
    fun pesquisa(){
        println("Qual usuário você deseja pesquisar  na agenda? ")
        var usuario = readln()
                               // find, procurar dentro da lista
        var procurar = agenda.find {it.nome.equals(usuario, ignoreCase = true)}
                                    // por     //igual            // iguinora a letra maiuscula


        if (procurar == null){
            println("Usuário não encontrado")
        }
        else {
            println("Usuário encontrado $procurar")
        }
    }
  fun classificar(){
              // ordena a agenda
      agenda.sortBy {it.nome}
      print("Lista ordenada com sucesso")
  }
  fun apresentar(){
       agenda.forEach{println(it)}

  }










