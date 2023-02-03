package com.example.myapplication.kotlin

fun main(args: Array<String>) {
    first()
    second(90)
    third(52)
    gugudan()
}


// 1번 문제
// List를 두 개 만든다
// 첫번째 List에는 1부터 9까지 넣는다 (반복문 사용)
// 두번째 List에는 첫번째 List의 값을 하나씩 확인한 후
// 짝수면 True 홀수면 False 출력
fun first() {
    val firstList = mutableListOf<Int>()
    for (i in 1..9) {
        firstList.add(i - 1, i)
    }
    println(firstList)

    val secondList = mutableListOf<String>()
    for (i in 0 until firstList.size) {
        if (firstList.get(i) % 2 == 0) {
            secondList.add(i, "true")
        } else {
            secondList.add(i, "false")
        }
    }
    println(secondList)
}

// 2번 문제
// 학점 구하기
// 함수에 전수 전달하면 학점 반환
// 80-90 -> A
// 70-79 -> B
// 60-69 -> C
// 나머지 F
fun second(score: Int) {
    if (score in 0..99) {
        when (score) {
            in 80..90 -> {
                println("A")
            }
            in 70..79 -> {
                println("B")
            }
            in 60..69 -> {
                println("C")
            }
            else -> {
                println("F")
            }
        }
    }
}

// 3번 문제
// 전달 받은 숫자의 각 자리 수의 합을 구하기
// 조건: 전달 받은 숫자는 무조건 두자리 수
fun third(number: Int) {
    if (number in 10..99) {
        val a = number / 10
        val b = number % 10
        val result = a + b
        println(result)
    }
}


// 4번 문제
// 구구단 출력
fun gugudan() {
    for (i in 2..9) {
        for (j in 1..9) {
            val result = i * j
            println("$i X $j = $result")
        }
        println()
    }
}