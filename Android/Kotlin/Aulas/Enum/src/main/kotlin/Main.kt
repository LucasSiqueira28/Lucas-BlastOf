fun main(args: Array<String>) {
    //enum -> conjunto de constantes
    val pedido = Pedido()
    if(pedido.status == StatusPedido.REPROVADO){
        println("Pedido está sendo processado!")
    }

    if(pedido.status == StatusPedido.APROVADO){
        println("Pedido está aprovado!")
    }
}


enum class StatusPedido{
    PROCESSANDO, APROVADO, REPROVADO
}

class Pedido {
    var status: StatusPedido = StatusPedido.PROCESSANDO
}