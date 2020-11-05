/*Arreglos */
fun main(args: Array<String>) {
    //var i = 1
    var arreglo = intArrayOf(1,2,3)
    val enteros:Array<Int> = arrayOf(5,6,7,8)
    val nombres:Array<String> = arrayOf("Yesser","Joel","Juana","Maria")

    println(arreglo[2])
    println(enteros[1])
    println("Bienvenido ${nombres[0]}")

    //podemos pasarle argumentos de string al programa y obtenerlo
    println(args[0])

    //podemos leer datos
    println("Enter Two number")
    var (a, b) = readLine()!!.split(' ') // !! this operator use for NPE(NullPointerException).

    println("Max number is : ${maxNum(a.toInt(), b.toInt())}")
}

fun maxNum(a: Int, b: Int): Int {

    var max = if (a > b) {
        println("The value of a is $a");
        a
    } else {
        println("The value of b is $b")
        b
    }

    return max;

}