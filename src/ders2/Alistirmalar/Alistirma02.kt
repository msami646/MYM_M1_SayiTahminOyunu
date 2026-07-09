package ders2.Alistirmalar

fun main() {
    val UrunAdi = "Su"
    val urunAdeti = 10
    val urunFiyati = 6.99
    val stokKontrol = true
    var toplamFiyat = urunFiyati * urunAdeti

    println("---Market Sepeti---")
    println("Ürün toplam fiyatı: " + urunAdeti + " X " + urunFiyati + " = " + toplamFiyat)
    println("Stokta var mı: " + stokKontrol)
}