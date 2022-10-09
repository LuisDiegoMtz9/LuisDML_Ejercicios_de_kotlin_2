fun main() {
    var valores= listOf(3,5,32,6,8,28,53,10,4,100,56,87,43)// Lista de los valores a evaluar
    println(si(valores) { a -> par(a) }) // Se imprimme la lista que retorna el metodo si
}
fun par(valor:Int): Boolean {// Esta función evalua con un if si el valor de la lista es paro impar gracias al modulo, si da 0
    // como resultado es par, de lo conttrario es impar
    if(valor%2==0){
        return true
    }else{
        return false
    }
}
fun si(valores: List<Int>,par:(Int)->Boolean):List<Pair<Int,Boolean>> { // Esta función recibe la lista y la función par

    val lista: MutableList<Pair<Int, Boolean>> = mutableListOf()// esta lista guardara los valores par y la palabra true
    // si la función par devuleve un true quiere decir que el valor de la lista es par, por lo tanto agregamos el valor y la palabra
    // true a la lista
    for (i in valores.indices) {
        if (par(valores[i])){
            lista.add(Pair(valores[i], par(valores[i])))
        }
    }
    return lista
}