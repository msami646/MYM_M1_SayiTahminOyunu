package ders2.Alistirmalar

fun main() {
    val urunAdi = "süt"
    val urunAdeti = 10
    val urunFiyati = 35
    val stokKontrol = true
    var toplamFiyat = urunFiyati * urunAdeti

    println("Ürünün adı: $urunAdi")
    println("Ürün Toplam Fiyatı: " + urunAdeti + " X " + urunFiyati +" = " + toplamFiyat)
    println("Stokta var mı: " + stokKontrol)

    toplamFiyat += 50
    println(toplamFiyat)
    toplamFiyat += 30
    println(toplamFiyat)


}