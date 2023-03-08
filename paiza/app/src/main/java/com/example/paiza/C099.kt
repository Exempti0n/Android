package com.example.paiza

fun main() {
    val input1 = readln()
    val NandD = input1.split(" ")
    val N = NandD[0].toInt()
    val D = NandD[1].toInt()
    var totalLength = 0

    for (i in 1..N - 1) {
        val length = D - readln().toInt()
        totalLength += length
    }
    println(D * (D +totalLength))
}