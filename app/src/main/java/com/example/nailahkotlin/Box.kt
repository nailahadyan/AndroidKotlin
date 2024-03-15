package com.example.nailahkotlin
class Box(var width: Int, var height: Int, var length: Int) {
    var volume: Int
        get() = width * height * length / 1000
        private set(value) {
            height = (value * 1000) / (width * length)
        }

    fun printVolume() {
        println("Volume: $volume cubic meters")
    }
}

fun main() {
    val myBox = Box(2, 3, 4)

    // akses untuk property volume
    myBox.printVolume() // Output: Volume: 0 meter cubic

    //kita bisa memodifikasi lebar, tinggi, dan panjang box
    myBox.width = 3
    myBox.height = 4
    myBox.length = 5

    // akses untuk property volume lagi
    myBox.printVolume() // Output: Volume: 0 meter cubic (karena setter nya private)
}
