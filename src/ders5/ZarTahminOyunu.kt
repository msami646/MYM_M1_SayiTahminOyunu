package ders5

fun main() {
    val zarSayi = (1..6).random()
    //println(zarSayi)

    println("Zar Tahmin Oyununa Hoş Geldiniz")
    print("Zar tahminizi giriniz(1-6): ")
    val zarTahmini = readln().toIntOrNull()

    if (zarTahmini == null){
        println("Lütfen geçerli bir sayı giriniz")
    }else if (zarTahmini < 1 || zarTahmini > 6){
        println("Lütfen 1 ile 6 arasında bir sayı giriniz")
    }else if (zarSayi != zarTahmini){
        println("Zar tahminiz yanlış . Doğru sayı $zarSayi ")
    }else{
        println("Zar Tahminiz doğru. Tebrikler")
    }


}