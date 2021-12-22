fun main(){
    //como criar coleções

    //araylist - classes
     val frutas1 = ArrayList<String>()
    frutas1.add("Morango")
    frutas1.add("Banana")
    println(frutas1)

    //arraylist - funcao
    val frutas2 = arrayListOf<String>("Cimento", "Madeira")

    println(frutas2.last())


    val numeros = setOf(1,14,2)
    println(numeros.maxOrNull())
}