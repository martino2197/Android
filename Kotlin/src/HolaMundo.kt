const val N = "NAME" //const tiempo de compilacion y en variables globales
//val n = 3
//var n = 3 //mala practica de programacion


//Funciones Puras
fun main(args: Array<String>) {

    println("Hola Mundo")
    //Operadores En Kotlin, valores primitivos vs objetos.
    println(1+1)
    println(3-1)
    println(2*2)
    println(4/2)
    println(7%2)
    println("\n")
    val a = 4
    val b = 2
    val c = 10

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))
    println("\n")

    //TODO EN KOTLIN ES UN OBJETO

    //a = 10 //val cannot be reassigned

    //n = 10
    val name = args[0] //tiempo de ejecucion, variables locales

    println(name)
    println(N)
}

//click derecho y le damos a la opcion de Run