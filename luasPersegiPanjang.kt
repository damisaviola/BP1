// Menghitung Luas persegi panjang

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))

    println("PROGRAM MENGHITUNG LUAS PERSEGI PANJANG")
    println("=================================")
    print("Masukan panjang : ")
    val panjang = input.readLine().toInt()
    print("Masukan Lebar : ")
    val lebar = input.readLine().toInt()

    val luas = panjang * lebar

    println("Luas persegi panjang = $luas")

}