package ders4

fun main() {
    print("Sepet tuıtarını girin: ")
    val tutar = readln().toDoubleOrNull()

    if (tutar == null) {
        println("Lütfen tutarı sayısal bir ifade olarak girimn!")
    }else if (tutar >= 500){
        println("Süper Fırsat! %20 İndirim Kazandınız")
    }else if (tutar >= 200){
        println("Kargo Bedava")
    }else{
        println("İndrrim için ürün eklemmeye devam edin")
    }
}