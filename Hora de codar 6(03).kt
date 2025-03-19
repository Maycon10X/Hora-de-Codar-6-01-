data class Peoples(
    var pessoas: String,
    var altura: Double,
)
val tamanho = mutableListOf<Peoples>()
var opcoe = 0
fun main() { // loop infinito
    while (true) {
        println(
            "Seu menu de opçoes\n" +
                    "1-Cadastrar pessoas\n" +
                    "2-Menores ou iguais a 1.50\n" +
                    "3-Maiores que 1.50\n" +
                    "4-Maiores que 1.50 e menores que 2.0\n" +
                    "5-Media\n" +
                    "6-Sair"
        )
        println("escolha uma opção:")
        var escolha = readln().toIntOrNull()

        when (escolha) {

            1 -> { cadastrarpessoas()
            }
            2 -> { menoresiguais()
            }
            3 -> { maiores()
            }
            4 -> { mediaextraida()
            }
            5 -> { mediaa()

            }
        }
    }
}
fun cadastrarpessoas() {
    println("Qual o nome da pessoa? ")
    var pessoas = readln().toString()
    println("Qual a altura da pessoa?")
    var altura = readln().toDouble()
    while ( altura < 0.0) {
        println("Altura inválida Digite novamente: ")
        altura = readln().toDouble()
    }
    tamanho.add(Peoples(pessoas, altura))
    println("Deseja cadastrar novas pessoas?")
    var sim = "sim"
    sim = readln()
    if (sim == "sim") {
        cadasalunos()
    } else {
        println("Cadastro realizado com sucesso")
    }
}
fun menoresiguais() {
    val pes = tamanho.filter { it.altura <= 1.50 }
    pes.forEach { ferro ->
        println("Pessoa: ${ferro.pessoas}, Altura: ${ferro.altura}")
    }
}
    fun maiores() {
        val sep = tamanho.filter { it.altura > 1.50 }
        sep.forEach { ferro ->
            println("Pessoa: ${ferro.pessoas}, Altura: ${ferro.altura}")
        }
    }
    fun mediaextraida() {
        val l = tamanho.filter { it.altura > 1.50 && it.altura < 2.0 }
        l.forEach { ferro ->
            println("Pessoa: ${ferro.pessoas}, Altura: ${ferro.altura}")
        }
    }
    fun mediaa(){
        val x = tamanho.sumOf { it.altura }
        val z = tamanho.size
         print("A média é \n" + x/z)
        }
        fun exit() {
            cadastro()
        }

