package ders3

fun main() {
    var dusmanCani = 100

    val saldiriGücü = (15 .. 35).random()

    dusmanCani -= saldiriGücü

    println("Düşmana $saldiriGücü hasar verdiniz! Düşmanın kalan canı: $dusmanCani")
}