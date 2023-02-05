package com.example.myapplication.kotlin

fun main(args: Array<String>) {
    first()
    println(second(90))
    third(52)
    gugudan()
}


// 1번 문제
// List를 두 개 만든다
// 첫번째 List에는 1부터 9까지 넣는다 (반복문 사용)
// 두번째 List에는 첫번째 List의 값을 하나씩 확인한 후
// 짝수면 True 홀수면 False 출력
fun first() {
    val firstList = MutableList(9, { 0 })
    for (i in 0..8) {
        firstList[i] = i + 1
    }
    println(firstList)

    val secondList = MutableList(firstList.size, { true })
    firstList.forEachIndexed { index, value ->
        if (value % 2 == 0) {
            secondList[index] = true
        } else {
            secondList[index] = false
        }
    }
    println(secondList)
}

// 2번 문제
// 학점 구하기
// 함수에 전수 전달하면 학점 반환
// 90-100 -> A
// 80-89 -> B
// 70-79 -> C
// 나머지 F
fun second(score: Int): String {
    when (score) {
        in 90..100 -> {
            return "A"
        }
        in 80..89 -> {
            return "B"
        }
        in 70..79 -> {
            return "C"
        }
        else -> {
            return "F"
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