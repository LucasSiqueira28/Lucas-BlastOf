 //como se fosse o instaceof/ typeof

 interface Expressao
 class Numero(val valor: Int) : Expressao
 class Soma (val esquerdo: Expressao, val direito: Expressao): Expressao

 fun avaliacao(expressao: Expressao): Int {
     if(expressao is Numero){
         //val numero = expressao as Numero - em java
         return expressao.valor
     }

     if(expressao is Soma){
         return avaliacao(expressao.esquerdo) + avaliacao(expressao.direito)
     }

     throw  IllegalArgumentException("Expressão desconhecida")
 }

 fun main(){
     val resultado = avaliacao(Soma(Soma(Numero(1), Numero(2)), Numero(4)))
     println(resultado)
 }
