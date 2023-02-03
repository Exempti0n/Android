package com.example.myapplication.kotlin

// 10 제어흐름
// when

fun main(args: Array<String>) {

    val value: Int = 3

    when (value) { //중괄호 없애도 됨
        1 -> {
            println("value is 1")
        }
        2 -> {
            println("value is 2")
        }
        3 -> {
            println("value is 3")
        }
        else -> {
            println("I don't know value")
        }
    }

    if (value == 1) { //얘도 중괄호 없애도 됨, 조건 많으면 when 추천
        println("value is 1")
    } else if (value == 2) {
        println("value is 2")
    } else if (value == 3) {
        println("value is 3")
    } else {
        println("I don't know value")
    }

//    값 리턴 when
    val value2 = when (value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)

}