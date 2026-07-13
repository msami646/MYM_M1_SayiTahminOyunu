package ders3.Alistirmalar

fun main() {
    var ejderhacani = 1000.0

    print("Kahraman adını giriniz: ")
    val kahramanAdi = readln()

    print("Saldırı güçünü girin(ondalıklı şekilde): ")
    var saldiriGucu = readln().toDouble()

    val kritikHasar = (10..50).random()

    saldiriGucu += kritikHasar

    ejderhacani -= saldiriGucu

    val formatliEjderhaCani = "%.2f".format(ejderhacani)

    println("$kahramanAdi adlı kahraman ejdehaya karşı $kritikHasar kritik hasar ile toplam $saldiriGucu kadar hasar vurdu.Ejderhanın son canı $ejderhacani ")
}