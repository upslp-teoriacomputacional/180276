fun main(args: Array<String>) {//Se genera una funcion main para ejecutar el programa
    //Existe una funcion en varios lenguajes como java, php, javascript que se llama regex que sirve para validar datos
    //que existen en una cadena con un matches para poder comprobar que los datos sean del tipo indicado
    //por eso usar el \\w* minuscula sirve para datos de [a-z,A-Z,0-9] y no aceptara otro dato fuera de estos ni un espacio
    val clave= "\\w+".toRegex()

    //Esta seria otra forma de escribir lo de arriba
    val clave2= "[A-Za-z0-9]+".toRegex()

    val texto1= clave.matches("Saludos companeros")//En esta cadena dara falso debido a que tiene un espacio la cadena y aparte la letra ñ
    println(texto1)
    val texto2= clave.matches("180276UPSLP")//En esta cadena dara verdadero debido a que tiene caracteres dentro del parametro
    println(texto2)
    val texto3= clave.matches("L33rt3x70")//En esta cadena dara verdadero debido a que tiene caracteres dentro del parametro
    println(texto3)
    val texto4= clave.matches("#SaludUpslp")//En esta cadena dara falso debido a que tiene un espacio la cadena
    println(texto4)
    //La variable nos imprimira un falso o verdadero dependiendo de los valores obtenidos al validar las cadenas
}