package com.example.myapplication.kotlin

// 02. 자료형
// 정수형 -> Long > Int > Short > Byte 표현 범위 순서임
// 실수형 -> Double > Float
// 문자 -> Char -문자 1글자
// 문자열 -> String -문자
// 논리형(참True/거짓False) -> Boolean

// 변수 선언 1
var number = 10

// 변수 선언 2
// var/val 변수 : 자료형 = 값

var number1 : Int = 20
var hello1 : String = "Hello"
var point1 : Double = 3.4

// Variable or Value??
// - 1. 변하지 않는 값이라면 -> Value
// - 2. 진짜 모르겠다 -> Value 일단 Value 해두고 바꿀 일 있으면 Variable로 바꿔라

fun main(args: Array<String>) {
    number = 20
//    number = 20.5
}


