package ders3.Alistirmalar

fun main() {
    println("Şehiri girin: ")
    val sehir = readln()

    println("En düşük sıcaklığı girin: ")
    val dusuk = readln().toDouble()

    println("En yüksek sıcaklığı girin")
    val yuksuk = readln().toDouble()

    val ortalama = (dusuk + yuksuk) /2.0

    println("Burası $sehir .Bugün sıcaklık $dusuk ile $yuksuk arasında değişecek. Ortalama sıcaklık ise $ortalama derece")



}