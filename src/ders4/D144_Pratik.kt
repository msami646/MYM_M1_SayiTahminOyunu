package ders4

fun main() {
    val karanlikModAktif = true

    val arkaPlanRengi =
        if(karanlikModAktif){
            "#000000 Siyah"
        }else{
            "#FFFFFF Beyaz"
        }

    println("Arkaplan Rengi: $arkaPlanRengi")
}