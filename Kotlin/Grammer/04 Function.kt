package com.example.myapplication.kotlin

// 04 Function
// - 함수
// 어떤 input을 넣으면 어떤 output이 나오는 것
// -함수 선언하는 방범
// fun 함수명 (변수명: 타입, 변수명:타입 ....) : 반환형 {
//     함수 내용
//     return 반환값
// }
fun plus(first: Int, second: Int): Int {
    println(first)
    println(second)
    val result: Int = first + second
    println(result)
    return result
}

// 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// 반환값이 없는 함수 만들기
fun printPlus(first: Int, second: Int): Unit { //유닛은 함수가 아무것도 리턴하지 않겠다고 말하는 것, 생략 가능
    val result: Int = first + second
    println(result)
}

fun printplus2(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
}

// 간단하게 함수를 선언하는 방법, 축약보단 기본형 선호
fun plusShort(first: Int, second: Int) = first + second

// 가변 인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun main(args: Array<String>) {
//    함수를 호출하는 방법
    val result = plus(5, 10)
    println(result)
//    인수를 명시적으로 전달하는 방법
    val result2 = plus(first = 20, second = 30)
    println(result2)
    val result3 = plus(second = 100, first = 10)
    println(result3)

//    디폴트 값을 갖는 함수 호출 자동정렬 옵션 커맨드 L
    println()
    val result4 = plusFive(10, 20)
    println(result4)
    val result5 = plusFive(10)
    println(result5)

    println()
    printPlus(10, 20)

    println()
    val result6 = plusShort(50, 50)
    println(result6)

    println()
    plusMany(1, 2, 3)
    plusMany(100)
}