data class Funcionarios(
    var empregado: String,
    var matricula: Int,
    var salario: Double
)
val empresa = mutableListOf<Funcionarios>()

class Pessoal {

}

var opco = 0
            fun main() { // loop infinito
    while (true) {
        println(
            "Seu menu de opçoes\n" +
                    "1-Cadastrar funcionários\n" +
                    "2-Encontrar funcionários\n" +
                    "3-Apresentar funcionarios mais que mil \n" +
                    "4-Apresentar funcionarios menos que mil\n" +
                    "5-Apresentar funcionarios igual que mil\n" +
                    "6-Sair"
        )
        println("escolha uma opção:")
        var escolha = readln().toIntOrNull()

        when (escolha) {

            1 -> { colaboradores()
            }
            2 -> { pesquisafuncionario()
            }
            3 -> { apresntarFuncio()
            }
            4 -> { apresentarfunci()
            }
            5 -> { apresentarfunc()
            }
            6 -> { close()
            }
        }
               if (escolha == 6)
                   return
    }
}
             fun colaboradores() {
                 println("Qual o nome do funcionário?")
                 var empregado = readln()
                 println("O funcionário $empregado foi registrado no sistema!!!")
                 println("Atribua um número de matrícula ao funcioário $empregado:")
                 var matricula = readln().toInt()
                 println("Digite o salário do funcionário $empregado:")
                 var salario = readln().toDouble()
                 println("Funcionário cadastrado com sucesso no sistema!!!")
                 empresa.add(Funcionarios(empregado, matricula, salario))
             }
             fun pesquisafuncionario(){
                println("Digite o número de matrícula para encontrar o funcionário")
                 var acharfuncio = readln().toInt()
                 var procurarfuncio = empresa.find { it.matricula == acharfuncio}
                 println("$procurarfuncio")
             }
             fun apresntarFuncio(){
                 var f = empresa.filter { it.salario > 1000 }.sortedBy { it.matricula }.forEach{println(it)}
             }
             fun apresentarfunci(){
                 var h = empresa.filter { it.salario < 1000 }.sortedBy { it.matricula }.forEach{println(it)}

             }
             fun apresentarfunc(){
                 var j = empresa.filter { it.salario.toInt() == 1000 }.sortedBy { it.matricula }.forEach{println(it)}
             }
             fun close(){
                 println("Obrigado!!!")
             }
