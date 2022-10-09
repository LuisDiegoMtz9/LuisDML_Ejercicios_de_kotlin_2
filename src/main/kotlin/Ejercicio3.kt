fun main(args: Array<String>) {
    val calificaciones= listOf<Int>(80,70,100,32,43,98,90,65,74)//Lista con las calificaciones
    desempeño(calificaciones)// SE manda llamar la función desempeño
}
fun desempeño(calificaciones : List<Int>){//Esta función recibe la lista de calificaciones
    var final= mutableListOf<String>()// Esta lista mutable nos ayudara a guardar los valores
    for (i in calificaciones) // en la variable i guardaremos todos los valores de la lista
    {
        // En los siguientes if solo comparamos en que rango entra la calificación y guaramos primero la calificación
        // y despues el dessempeño
        if (i <=100 && i >=95){
            final.add(i.toString())
            final.add("Excelente")
        }else if (i <=94 && i >=85){
            final.add(i.toString())
            final.add("Notable")
        }
        else if (i <=84 && i >=75){
            final.add(i.toString())
            final.add("Bueno")
        }
        else if (i <=74 && i >=70){
            final.add(i.toString())
            final.add("Suficiente")
        } else if (i<70){
            final.add(i.toString())
            final.add("Insuficiente")
        }
    }
    println(final) // SE retorna la lista con la calificación y el desempello
}

