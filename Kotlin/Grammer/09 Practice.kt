package com.example.myapplication.kotlin

fun main(args: Array<String>) {
    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a는 null입니다.")
    } else {
        println("a는 null이 아닙니다.")
    }

    if (b + c == 110) {
        println("b + c = 110")
    } else {
        println("b + c != 110")
    }

//    엘비스 연산자
    val number: Int? = 100
    val number2 = number ?: 10
    println()
    println(number2)

    val num1: Int = 10
    val num2: Int = 20
    val max = if (num1 > num2) {
        num1 //5
    } else if (num1 == num2) {
        num2 //10
    } else {
        100
    }
}