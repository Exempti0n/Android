package com.example.myapplication.kotlin

// 01. 변수
// Variable -> 변수
// -> 상자
// -내 마음대로 원하는 것을 넣을 수 있는 상자 -> Variable 변수
// -한 번 넣으면 바꿀 수 없는 상자 -> Value 상수

// 변수 선언하는 방법
// var/val 변수명 = 값
// Variable/Value

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20

fun main(args:Array<String>) {
    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Good Bye"
    point = 10.4

    println(num)
    println(hello)
    println(point)



}