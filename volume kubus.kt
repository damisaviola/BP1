// Menghitung volume kubus

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))

    println("PROGRAM MENGHITUNG VOLUME KUBUS")
    println("=================================")
    print("Masukan panjang sisi kubus : ")
    val sisi = input.readLine().toInt()

    val volume = sisi * sisi * sisi

    println("Volume kubus = $volume")

}