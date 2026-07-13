package ders3.Alistirmalar

fun main() {
    println("Sepet tutarını giriniz: ")
    var sepetTutari = readln().toDouble()

    val indirimYuzdesi = (10..50).random()

    val indirimMiktari = sepetTutari * indirimYuzdesi /100


    sepetTutari -= indirimMiktari
    val formatliSepetTutari = "%.2f".format(sepetTutari)

    println("Tebrikler , Çarktan %$indirimYuzdesi indirim kazandınız. Yeni ödüyeceginiz tutar $formatliSepetTutari TL")



}