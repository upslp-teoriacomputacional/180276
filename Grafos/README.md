<h2>Programación en Kotlin haciendo uso grafos</h2>

<h3>Para el trabajo de grafos fue necesario buscar otro lenguaje de programación debido a que Lua tiene muy pocas cosas y se complicaria demasiado
a la hora de trabajar por eso kotlin fue una solucion muy buena ya que contaba con muchas librerias que nos iba a facilitar el trabajo y de lo contrario
en lua hubieramos tenido que programar cada funcion y nos hubieramos llevado mucho tiempo, entonces busque en internet como instalar kotlin
y pues buscar unos cuantos ejemplo de como usarlo hasta ver que se parece mucho a java pero trabaja sin ";" y ver que era algo sencillo.</h3>
<br>
<p>El programa se ejecuta de manera directa y funciona creando los nodos de default y estos ve cuales son sus aristas</p>

<p> Source Code</>

```kotlin



*  Universidad Politecnica de San Luis Potosí
*  Ingeniería en Tecnologías de Información
*
*  Materia: Teoría Computacional
*  Profesor: Juan Carlos González Ibarra
*  Nombre:    Manuel Alejandro Guerrero González
*  Matricula: 180276
*  
*  Escrito:       13/02/21
*  Ultima actualización:  13/02/21


//Aqui se inicia inicia por declarar las librerias para trabajar

import kotlin.collections.HashMap //Libreria de kotlin para crear conjuntos de datos

fun main(args: Array<String>) {//Se genera una funcion main para ejecutar el programa
    println("Programa de grafos\n")

    //Se genera el grafo
    val grafos = Grafos<String>()
    grafos.apply {//Se llama la funcion para empezar a agregar datos dentro de los grafos
        addEdge("a", "c")
        addEdge("b", "c")
        addEdge("b", "e")
        addEdge("c", "d")
        addEdge("c", "e")
        addEdge("c", "a")
        addEdge("c", "b")
        addEdge("e", "b")
        addEdge("d", "c")
        addEdge("e", "c")
    }

    print(grafos.toString())//Se imprimen los grafos segun su vertice
}

class Grafos<T> {//Se crea clase grafos para poder meter los valores con una libreria de HashMap de kotlin para ordenar valores
    val valores: HashMap<T, HashSet<T>> = HashMap()
    fun addEdge(verticefuente: T, verticedestino: T) {
        // Se añade el valor al vertice principal
        valores
            .computeIfAbsent(verticefuente) { HashSet() }
            .add(verticedestino)
        // Se añade el valor a las aristas del vertice principal
        valores
            .computeIfAbsent(verticedestino) { HashSet() }
            .add(verticefuente)
    }
    //Funcion toString para imprimir los datos del grafo
    override fun toString(): String = StringBuffer().apply {
        for (key in valores.keys) {
            append("Vertice [$key] -> Arista ")
            append(valores[key]?.joinToString(", ", "[", "]\n"))
        }
    }.toString()
}