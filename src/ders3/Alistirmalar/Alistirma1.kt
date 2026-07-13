package ders3.Alistirmalar

fun main() {
    println("İsminizi giriniz")
    val isim = readln()

    println("Kilonuzu giriniz")
    val kilo: Double = readln().toDouble()

    println("Boyunuzu giriniz")
    val boy = readln().toDouble()

    val vki = kilo / (boy * boy)

    val formatliVki = "%.2f".format(vki)
    print("İsminiz: $isim Vücut Kitle İndeksinizi $formatliVki")
}