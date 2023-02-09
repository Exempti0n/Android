package com.example.myapplication.kotlin
// 변수의 접근 범위
// 1. 전역 변수 -> 어디에서나 접근할 수 있는 변수
// 2. 지역 변수 -> 해당 지역에서만 접근할 수 있는 변수
// 접근 범위는 최소한으로 설정하는게 중요하다.

var number100: Int = 10 //전역변수, 이 파일 어디서든 접근 가능, 위험하다

// 변수를 선언한 위치에 따라 접근할 수 있는 범위가 정해진다
fun main(args: Array<String>) {
    println(number100)

    val test = Test("MESSI")
    test.testFun()
    test.name
    println(number100)
}

class Test(var name: String) {

    fun testFun() {
        var birth: String = "1999/09/27"
        name = "MESSI" //지역변수
        number100 = 100
        //gender gender 접근 불가
        fun testFun2() {
            var gender : String = "male"
        }
    }

    fun testFun2() {
        name = "NEYMAR" //name 접근가능
//        birth 접근 불가
        number100 = 200 //number100 접근가능
    }
}