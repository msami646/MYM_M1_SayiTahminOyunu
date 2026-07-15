package ders4.Alistirmalar

fun main() {
    val yas = 18
    val egitimTamam = true

    if (yas >= 18  ){
        println("Yaşınız tutuyor")
    }else{
        println("Ehliyet almak için yaşınız tutmuyor")
    }

    if(yas >= 18 && egitimTamam){
        println("Başvurunuz onaylandı.")
    }else{
        print("kaydınız reddeldi")
    }

}