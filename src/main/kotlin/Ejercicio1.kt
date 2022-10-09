import java.io.IOException
import kotlin.math.*
fun main() {
    try {
        print("Ingresa el valor numérico al que desea aplicarle una operación: ")
        val valor = readLine()!!.toInt()// Se lee el valor númerico que ingresa el usuario
        println()
        println("Ingresa la función que desea aplicar al número "+valor+ "\nSeno --> (1)\nCoseno -->" + " (2)\nTangente --> (3)\nExponencial --> (4)\nLogaritmo --> (5)")
        val operacion = readLine()!!.toInt()// Se lee el número de la operación a realizar
        calculo(valor, operacion)//Se manda llamar  la función calculo
    } catch (e: IOException) {
        println("Ha ocurrido un error, vulva a ejecutar la aplicación y asegurece de ingresar bien los valores")
    }
}
fun calculo( valor: Int, operacion: Int) { //Esta función recibe el número mayor al que se le ejecutará la operación y el otro  valor es un entero que debe ser del 1 al 5 que especifica la operación a realizar
    for (i in 1..valor) { // Se crea un for que recorra desde 1 hasta el valor maximo
        val aux= // aux guarda el valor de la operacion
            when (operacion) {
                1 -> sin(i.toDouble())
                2 -> cos(i.toDouble())
                3 -> tan(i.toDouble())
                4 -> exp(i.toDouble())
                5 -> ln(i.toDouble())
                else -> 0.0
            }
        //se imprimen los valores
        if(aux<0){
            println("$i -> $aux")
        }else{
            println("$i ->  $aux")
        }
    }
}
