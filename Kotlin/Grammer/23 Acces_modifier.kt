package com.example.myapplication.kotlin

// 23 접근 제어자

fun main(args: Array<String>) {

    val testAccess: TestAccess = TestAccess("Mbappe")
//    Private 키워드 때문에 외부에서 더 이상 사용할 수 없다.
//    testAccess.test()
//    println(testAccess.name)
//    testAccess.name = "Neymar"
//   println(testAccess.name)

    val reward: Reward = Reward()
    reward.rewardAmount = 2000 //객체 안의 멤버변수를 마음대로 바꿀 수가 있다.

    val runningCar: RunningCar = RunningCar()
    runningCar.runFast()
//  runningCar.run()

}

class Reward() {
    var rewardAmount: Int = 1000
}

class TestAccess {
    private var name: String = "MESSI" //private를 적으면 외부(클래스 밖)에서 변경할 수 없다.

    constructor(name: String) {
        this.name = name
    }

    fun changeName(newName: String) {
        this.name = newName
    }

    private fun test() {
        println("Test")
    }
}

class RunningCar() {
    fun runFast() {
        run()
    }

    private fun run() { //어떤 함수를 사용하기 위한 로직이 다른 함수에 있을 수도 있고, 이런 함수는 공개할 필요가 없다.

    }
}