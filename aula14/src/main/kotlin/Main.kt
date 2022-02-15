import java.util.Scanner
fun main(args: Array<String>) {

    val menu = Scanner(System.`in`)
    print("menu de opcoes|  ")

    print("| Opção 1 - Média")
    print("| Opção 2 - Palíndromo")
    print("| Opção 3 - Sair ")


    var opcoes = readLine()!!.toInt()


    if (opcoes == 1) {
        println("Digite o seu primeiro numero: ")
        var number1 = readLine()!!.toInt()
        println("Digite seu segundo numbero: ")
        var number2 = readLine()!!.toInt()
        var result = (number1 + number2) / 2
        println("sua media é: " + result)
    } else {
        if (opcoes == 2) {

            println("Digite sua palavra")
            var input = Scanner(System.`in`)
            var palavra = input.next()
            var tam : Int = palavra.length-1

            var aux: Int = 0
            var msg: String = "É palindromo"

            while (aux < tam){
                if (palavra[aux] != palavra[tam-aux]) {

                    msg = "nao e palindromo"
                    break
                }
                aux++
            }
            println(msg)
        }
        if (opcoes == 3){
            println("")
        }
    }}

