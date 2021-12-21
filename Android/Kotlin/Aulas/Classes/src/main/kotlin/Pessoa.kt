class Pessoa (
    val nome: String,
    val idade: Int
    )

fun main(){
    val pessoa: Pessoa = Pessoa("Lucas", 22)
    println(pessoa.nome)
}