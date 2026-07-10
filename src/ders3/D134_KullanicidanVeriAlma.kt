package ders3

fun main() {
    println("Adını gir: ")
    val isim = readln()

    println("Kilonu gir: ")
    val dunyaKilosu = readln().toDouble()

    println("Adınız $isim,Dünyadaki kilonuz: $dunyaKilosu kg")

    val marsKilosu = dunyaKilosu * 0.36
    println("Marstaki kilonuz: ${marsKilosu}")


}