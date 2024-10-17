package week2.Object

import week2.Class.Mobil

fun main() {
    val toyota = Mobil()
    toyota.nama = "Cumi-cumi"
    toyota.warna = "Merah"
    println(toyota.nama)
    println(toyota.warna)

    val honda = Mobil()
    honda.nama = "Civic"
    honda.warna = "Putih"
    println(honda.nama)
    println(honda.warna)
}