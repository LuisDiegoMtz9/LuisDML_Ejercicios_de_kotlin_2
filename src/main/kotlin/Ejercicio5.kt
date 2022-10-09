fun main() {
    val houses = listOf( //Esta lista tendra los valores de la casa
        House(1810, 7, 1, false, 'B'), House(2010, 15, 3, true, 'B'), House(2022, 20, 4, true, 'A'), House(2003, 10, 2, true, 'A'), House(1999, 8, 1, false, 'A'))
    println(precio(houses, 100000000.0)) // se manda llamar la función precio
}
class House(var año: Int, var metros: Int, var habitaciones: Int, var garaje: Boolean, var zona: Char) // Esta clase nos ayuda para dar  el formato de entrada de los valores

fun precio(houses: List<House>, presupuesto: Double): List<Pair<String, Double>> {
    val lista: MutableList<Pair<String, Double>> = mutableListOf() // En estra lista se guardarán los datos
    var precio = 0.0 // Esta variable nos permitira guardar el precio
    for (i in houses.indices) {  // En los siguientes if se compara el tipo de zona que esta y si tiene garaje, para ejecutar las operaciones  indicadas para cada situación
        if (houses[i].zona == 'A') {
            precio = if (houses[i].garaje) {
                ((houses[i].metros * 1000 + houses[i].habitaciones * 5000 + 15000) * (2022 - houses[i].año / 100)).toDouble()
            } else {
                ((houses[i].metros * 1000 + houses[i].habitaciones * 5000) * (2022 - houses[i].año / 100)).toDouble()
            }
        } else if (houses[i].zona == 'B') {
            precio = if (houses[i].garaje) {
                (houses[i].metros * 1000 + houses[i].habitaciones * 5000 + 15000) * (2022 - houses[i].año / 100) * 1.5
            } else {
                (houses[i].metros * 1000 + houses[i].habitaciones * 5000) * (2022 - houses[i].año / 100) * 1.5
            }
        }
        if (precio <= presupuesto) {// si el precio es menor al presupuesto dado se guardará la lista con la descripcción de la casa
            // y el precio
            val cad="Año: "+houses[i].año.toString()+", "+"Metros: "+houses[i].metros.toString() + "Habitaciones: "+houses[i].habitaciones.toString()+", "+"Garage: "+houses[i].garaje.toString()+", "+"Zona: "+houses[i].zona.toString()+", "
            lista.add(Pair(cad, precio))
        }
    }
    return lista     //Se retorna la lista
}