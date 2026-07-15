package ders4.Alistirmalar

fun main() {
    val ortalama = 80
    val durum = if (ortalama >= 85){
        "Takdir Belgesi"
    }else if(ortalama < 85 && ortalama >= 50){
        "Tebrikler geçtiniz"
    }else{
        "Dersten Kaldınız"
    }
    println(durum)
}