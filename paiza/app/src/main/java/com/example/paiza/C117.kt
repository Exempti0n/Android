package com.example.paiza

fun main() {
    var closeShop = 0
    val input1 = readln()
    val NandM = input1.split(" ")
    val N = NandM[0].toInt()
    val M = NandM[1].toInt()

    val input2 = readln()
    val ABC = input2.split(" ")
    val A = ABC[0].toInt()
    val B = ABC[1].toInt()
    val C = ABC[2].toInt()

    for (i in 1..N) {
        val Sold = readln().toInt()
        val sell = (C * Sold) - A - M * B
        if (sell < 0) {
            closeShop += 1
        }
    }

    println(closeShop)

}
