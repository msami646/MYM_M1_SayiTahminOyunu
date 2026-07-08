package ders2

fun main() {
    val urunAdi = "kahve"
    val adet = 7
    val fiyat = 39.99
    val kargoBedavaKampamnya = true
    val araToplam = adet * fiyat

    println("---SEPET DETAYI---")
    println("Seçilen Ürün: " + urunAdi)
    println("Şipariş " + adet + " adet X " + fiyat + "TL")
    println("Ödenecek Tutar: " + araToplam + "TL")
    println("Kargo Bedava mı: " + kargoBedavaKampamnya)

}