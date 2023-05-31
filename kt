fun filterArray (arr: List<Int>): List<Int> {
    return arr.filter { it > 50 }
}

fun main () {
    val arr = mutableListOf<Int>()
    print("Masukan angka (pisahkan dengan spasi, tekan enter untuk berhenti) : ")
    val input = readLine()
    val numbers =  input?.split(" ")

    for (number in  numbers ?: emptyList()) {
        val num = number.toIntOrNull()
        if (num != null) {
            arr.add(num)
    }
}

val filtered = filterArray(arr)
if (filtered.isEmpty()) {
    println("tidak ada elemen yang lebih besar dari 50")

} else {
    println("elemen - elemen yang lebih besar dari 50: ")
    print(filtered)
}
    
}

