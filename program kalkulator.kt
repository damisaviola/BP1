import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.Exception

fun main() {
    var num1: Double
    var num2: Double
    var operator: Char
    var result: Double

    println("Kalkulator Sederhana")

    while (true) {
        try {
            val reader = BufferedReader(InputStreamReader(System.`in`))

            print("Masukkan bilangan pertama: ")
            num1 = reader.readLine().toDouble()

            print("Masukkan bilangan kedua: ")
            num2 = reader.readLine().toDouble()

            print("Masukkan operator (+, -, *, /): ")
            operator = reader.readLine()[0]

            result = when (operator) {
                '+' -> num1 + num2
                '-' -> num1 - num2
                '*' -> num1 * num2
                '/' -> num1 / num2
                else -> {
                    println("Operator tidak dikenal")
                    continue
                }
            }

            println("Hasil: $result")
        } catch (e: Exception) {
            println("Terjadi kesalahan: ${e.message}")
        }
    }
}
