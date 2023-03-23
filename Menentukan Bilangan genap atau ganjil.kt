import java.io.BufferedReader
import java.io.InputStreamReader
fun main(args: Array<String>) {
    println("Masukan Bilangan : ")
    val bilanganInput = readLine()!!.toInt()

    if (bilanganInput % 2 == 0) {
        println("$bilanganInput = Bilanan genap")
    }
    else {
        println("$bilanganInput = Bilangan ganjil")

    }

}