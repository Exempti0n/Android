package com.example.myapplication.kotlin

import android.speech.tts.TextToSpeech.Engine

// 25 상속
// 두 번까지는 봐준다
// 두 번 이상이 넘어가면 리팩토링 해라
// 부모로부터 설명서를 물려받는다

fun main(args: Array<String>) {
    val superCar100: SuperCar100 = SuperCar100()
    println(superCar100.drive())
    superCar100.stop()

    val bus100: Bus100 = Bus100()
//    bus100.drive()

}

// 부모 : Car100
// 자식 : SuperCar100, Bus100
open class Car100() { //class는 private이 기본임 private 없애는것 -> open
    open fun drive(): String { // fun도 동일
        return "Run"
    }

    open fun stop() {

    }
}

class SuperCar100() : Car100() {
    override fun drive(): String {
        val run = super.drive()
        return "Fast $run"
    }
//    부모의 기능을 무시하고 만들거나
//    부모의 기능을 개조한다
    override fun stop() {

    }
}

class Bus100() : Car100() {

}
