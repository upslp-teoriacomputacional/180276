<h2>Programación en Kotlin haciendo uso del lenguaje</h2>

<h3>En esta práctica el uso del lenguaje fue muy importante, ya que nos permitió ir modificando
de una forma diferente los textos que teníamos escritos, ya que con saber que podemos tener
distintas funciones del programa podemos manipularlos y hacer que hagan distintas funciones</h3>

<p>El programa funciona de manera que se va ejecutando poco a poco y nos da un resultado diferente según lo que se pide.</p>

<p> Source Code</p>


```kotlin
*  Universidad Politecnica de San Luis Potosí
*  Ingeniería en Tecnologías de Información
*
*  Materia: Teoría Computacional
*  Profesor: Juan Carlos González Ibarra
*  Nombre:    Manuel Alejandro Guerrero González
*  Matricula: 180276
*  
*  Escrito:       27/02/21
*  Ultima actualización:  27/02/21

import java.util.regex.Pattern//Funcion de java para el Regex de una palabra

fun main(args: Array<String>) {//Se genera una funcion main para ejecutar el programa
    //val comillasimple = 'Hola a todos' //En Kotlin la comilla simple no funciona
    val comilladoble  = "Hola a todos"
    println(comilladoble)
    //Hola a todos

    //message = "Hello, Kotlin!" Esta funcion no existe en kotlin
    val message = "Hello, Kotlin!"
    println(message[7])
    //K

    /*
    #Text            =   K O T L I N
    # Positive Index =   0 1 2 3 4 5
    # Negative Index = -(5 4 3 2 1 0)
    */

    val Text ="KOTLIN"
    println(Text[3])                //Imprime texto de una posicion en especifico
    //L

    println(Text.reversed()[4])     //Imprime texto de manera inversa de una posicion en especifico
    //O

    println(message.substring(7..10)) //Puede imprimir un rango en kotlin
    //Kotl

    var mensaje="           Hola kotlin     "//Este quita los espacios del inicio y final del texto si no hay nada entre ellos
    println(mensaje.strip())
    //Hola kotlin

    mensaje="Hola Kotlin"
    println(mensaje.toLowerCase())          //Funcion que hace minusculas las letras
    //hola kotlin

    mensaje="Hola Kotlin"
    println(mensaje.toUpperCase())          //Funcion que hace mayusculas las letras
    //HOLA KOTLIN

    mensaje="Hola Kotlin"
    //println(len(mensaje))                 //La funcion len no existe en kotlin pero podemos usar mensaje.lenght()
    println(mensaje.length)
    //11

    mensaje="Hola Kotlin"
    println(mensaje.replace("Hola","Adios")) //Esta funcion cambia un valor de la variable e imprime el nuevo valor
    //Adios Kotlin

    mensaje="Kotlin, es, un, lenguaje"
    println(mensaje.split(","))     //Esta funcion separa los textos por espacios y los mete entre corchetes
    //[Kotlin,  es,  un,  lenguaje]

    mensaje="hola kotlin aqui andamos"
    upperCaseAllFirstCharacter(mensaje)      //Esta funcion permite cambiar cada primera letra de cada palabra en mayuscula
    //Hola Kotlin Aqui Andamos
    //println(mensaje.capitalizeWords)         Esta funcion no existe en kotlin pero sirve para poner en mayusculas despues de un espacio la primera letra

    mensaje="hola kotlin"
    println(mensaje.capitalize())           //Esta funcion lo que hace es que la primera letra la pasara a mayusculas
    //Hola kotlin

    mensaje="hola kotlin"
    println(mensaje.count{"l".contains(it)})     //Esta funcion sirve para contar la cantidad de letras de un mismo tipo en una oracion
    2

    mensaje="hola kotlin"
    println(mensaje.indexOf("kotlin"))    //Esta funcion permite encontrar una palabra en la oracion y ver la posicion en la que esta
    //5

    var mensaje1="Hola"                     //Aqui concatenaremos estas palabras
    var mensaje2="Mundo"
    println(mensaje1+" "+mensaje2)
    //Hola Mundo

    var numero="1"                          //Aqui concatenaremos estas palabras con un texto de un numero
    println(mensaje1+" "+mensaje2+" "+numero)
    //Hola Mundo 1

    var numero1= 1                          //Aqui concatenaremos estas palabras con un numero entero y haciendo pruebas no es necesario el .toString
    println(mensaje1+" "+mensaje2+" "+numero1.toString())
    //Hola Mundo 1

}


fun upperCaseAllFirstCharacter(text: String?) {
    val regex = "\\b(.)(.*?)\\b"
    val result: String = Pattern.compile(regex).matcher(text).replaceAll { matche ->
        matche.group(1).toUpperCase() + matche.group(2)
    }
    println(result)
}