fun main(){
    //coleções -> list e arrayList

    var listaItens = listOf<String>("Banana", "Maça")
    println(listaItens)

    var listaItens2 = arrayListOf<String>("ahuhaduhdas", "paskldopasdk")
    listaItens2.add("kkkk")
    listaItens2.add("psadsaoldsd")
    println(listaItens2)
    listaItens2.remove("psadsaoldsd")
    println(listaItens2)
    println(listaItens2.size)
    println(listaItens2.isEmpty())
}