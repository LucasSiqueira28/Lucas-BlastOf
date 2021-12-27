fun main(){
    //when é um switch-case

    var opcao = 3

    //pode guardar o when em uma variavel ai no caso remove todos os println da estrutura
    when(opcao){
        1 -> println("Chocolate quente")
        2 -> println("Café")
        3 -> {
            println("Opção de numero: ${opcao}")
            println("Menu da casa")
            println("café")
            println("pão")
        }
        else -> println("Opção invalida")
    }
}