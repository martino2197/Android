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
    println("\n")

    //STRINGS
    val nombre = "Luis Martin"
    val apellido: String = "Maceda Nazario"

    val nombreapellido = "Martin\nMaceda"

    //println("Tu nombre es: " + nombre)
    println("Tu nombre es: $nombre $apellido")
    //Raw String
    val parrafo = """
        **Lorem Ipsum is simply dummy text of the printing
        and typesetting industry. 
        **Lorem Ipsum has been the industry's standard dummy text
        ever since the 1500s, when an unknown printer took a 
        galley of type and scrambled it to make a type specimen book.
        It has survived not only five centuries, but also the leap
        into electronic typesetting, remaining essentially unchanged. 
        **
        It was popularised in the 1960s with the release of Letraset 
        sheets containing Lorem Ipsum passages, and more recently  
        with desktop publishing software like Aldus PageMaker including
        versions of Lorem Ipsum.
    """.trimIndent() //este metodo respeta la indentacion de mi parrafo

    println(parrafo.trimMargin("**"))

    println("Tu nombre es: $nombreapellido")
}

//click derecho y le damos a la opcion de Run