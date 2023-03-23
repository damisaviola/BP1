import java.io.BufferedReader
import java.io.InputStreamReader
fun main() {

    val input = BufferedReader (InputStreamReader(System.`in`))

    println("Pilihan Bangun datar : ")
    println("------------------------")
    println("1. Lingkaran ")
    println("2. Persegi empat")
    println("3. Persegi Panjang")
    println("4. Segitiga")

    print("Pilihan anda : ")
    val pilihan = input.readLine()!!.toInt()
    print("---------------------------")

    when (pilihan) {

        1 -> {
            println("Pilihan anda adalah lingkaran")
            print("Masukan jari-jari lingkaran: ")
            val jari = readLine()!!.toInt()
            val luas = 3.14 * jari * jari
            print("Luas lingkaran = $luas")

        }

        2 -> {
            print("Pilihan anda adalah persegi empat")
            print(" Masukan sisi persegi: ")
            val sisi = readLine()!!.toDouble()
            val luas = sisi * sisi
            println("Luas persegi = $luas")
        }

        3 -> {
            print("Pilihan anda adalah persegi panjang")
            print("Masukan panjang persegi panjang: ")
            val panjang = readLine()!!.toInt()
            print ("Masukan lebar persegi panjang: ")
            val lebar = readLine()!!.toInt()
            val luasPersegiPanjang = panjang * lebar
            print("Luas persegi panjang = $luasPersegiPanjang")
        }

        4 -> {
            println("Pilihan anda adalah segitiga")
            print("Masukkanan alas segitiga: ")
            val alas = readLine()!!.toInt()
            print("Masukkan tinggi segitiga: ")
            val tinggi = readLine()!!.toInt()
            val luas = 0.5 * alas * tinggi
            println("Luas segitga = $luas")
        }

        else -> {
            println("Pilihan Salah. ")
        }
    }
}