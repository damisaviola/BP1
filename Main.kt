fun main () {
    val gajiPokok = InputGajiPokok()
    val jumlahAnak = InputJumlahAnak()

    val tunjanganAnak = hitungTunjanganAnak (gajiPokok, jumlahAnak)
    val totalGaji = hitungTotalGaji (gajiPokok, tunjanganAnak)
    val pajak = hitungPajak(totalGaji)

    println("Gaji pokok : Rp. $gajiPokok")
    println("Tunjangan Anak : Rp. $tunjanganAnak")
    println("total gaji : Rp. $totalGaji")
    println("Pajak : Rp. $pajak")

}

fun InputGajiPokok(): Int {
    print("Masukan gaji pokok : Rp. ")
    return readLine()!!.toInt()
}

fun InputJumlahAnak(): Int {
    print("Masukan jumlah anak : ")
    return readLine()!!.toInt()
}

fun hitungTunjanganAnak(gajiPokok: Int, jumlahAnak: Int): Int {
    val maksimalAnak = 3
    val presentaseTunjangan = 5
    val jumlahAnakDiproses = if (jumlahAnak > maksimalAnak) maksimalAnak
    else jumlahAnak
    return (gajiPokok + jumlahAnakDiproses + presentaseTunjangan) / 100

}

fun hitungTotalGaji(gajiPokok: Int, tunjanganAnak: Int):Int{
    return gajiPokok + tunjanganAnak
}

fun hitungPajak(totalGaji: Int): Int {
    return  when {
        totalGaji >= 2000000 -> totalGaji * 10/100
        totalGaji >= 1000000 -> totalGaji * 5/100
        else -> 0
    }
}