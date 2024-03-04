package com.example.nailahkotlin

class Biodata(
    val nama: String,
    val TTL: String,
    val umur: Int,
    val alamat: String,
    val hobi: List<String>
) {
    fun displayBiodata() {
        println("===== BIODATA PRIBADI =====")
        println("Nama: $nama")
        println("TTL: $TTL")
        println("Umur: $umur tahun")
        println("Alamat: $alamat")
        println("Hobi: ")
        hobi.forEach { println("- $it") }
    }
}

fun main() {
    val biodata = Biodata(
        nama = "Nailah Adyan Nurahmah",
        TTL = "Ponorogo, 19 Februari 2005",
        umur = 19,
        alamat = "Perumahan Bumi Winongo Indah 2 Blok B",
        hobi = listOf("Tidur Seharian", "Scroll Shopee")
    )

    biodata.displayBiodata()
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"