import kotlin.collections.HashMap //Libreria de kotlin para crear conjuntos de datos

fun main(args: Array<String>) {//Se genera una funcion main para ejecutar el programa
    println("Programa de grafos\n")

    //Se genera el grafo
    val grafos = Grafos<String>()
    grafos.apply {
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