package ders4.Alistirmalar

fun main() {
    print("Lütfen notunuzu giriniz: ")
    val not = readln().toIntOrNull()

    if (not == null) {
        println("Lütfen notunuzu rakamlar ile giriniz")
    } else {
        val durum = if (not >= 50) "Geçti" else "kaldı"
        if (not >= 85) {
            println("Takdir belgesi kazandınız")
        } else if (not >= 50){
            println("Tebrikler geçtiniz")
        }else{
            println("Kaldınız")
        }
        println(durum)
    }
}