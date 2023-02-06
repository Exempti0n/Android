package com.example.myapplication.kotlin

// 18 Class
// OOP 객체 지향 프로그래밍

// "객체"란 뭘까
// - 이름이 있는 모든 것

// 절차지향 프로그래밍
// - 코드를 위에서 부터 아래로 실행을 하면 문제가 해결된다

// 객체지향 프로그래밍
// - 객체를 만들어서, 객체에게 일을 시켜서 문제를 해결한다.
// - 선수, 심판, 경기장, 관중 -> 축구 게임

// 객체를 만드는 방법
// - 설명서가 있어야 한다.

fun main(args: Array<String>) {
// 클래스(설명서)를 통해서 실체를 만드는 방법
// -> 인스턴스화 -> 인스턴스(객체)
    Car("v8 engine", "big")

    val bigCar = Car("v8 engine", "big")
//    우리가 만든 클래스(설명서)는 자료형이 된다
    val bigCar1: Car = Car("v8 engine", "big")

    val superCar: SuperCar = SuperCar("good engine", "big", "white")

//    인스턴스가 가지고 있는 기능을 사용하는 방법
    val runableCar: RunableCar = RunableCar("simple engine", "short body")
//    RunableCar.ride() -> 불가능
    runableCar.ride()
    runableCar.navi("東京")
    runableCar.drive()

// 인스턴스의 멤버 변수에 접근하는 방법
    val runableCar2: RunableCar2 = RunableCar2("nice engine", "long body")
    println(runableCar2.body)
    println(runableCar2.engine)

    println()
    val testClass = TestClass()
    testClass.test(1)
    testClass.test(1, 2)

}

// 클래스(설명서) 만드는 방법(1)
class Car(var engine: String, var body: String) {

}

// 클래스(설명서) 만드는 방법(2)
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법(3) -> 1번 방법의 확장
class Car1 constructor(engine: String, body: String) {
    var door: String = ""

    //    생성자
    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

// 클래스(설명서) 만드는 방법(4) -> 2번의 확장
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}


class RunableCar(engine: String, body: String) {

    fun ride() {
        println("탑승하였습니다.")
    }

    fun drive() {
        println("달립니다.")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

class RunableCar2 {
    var engine: String
    var body: String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    init {
        //실제 객체가 만들어질 때(클래스가 인스턴스화 될 때) 무조건 가장 먼저 호출된다.
        //초기 세팅 할 때 유용하다
        println("RunableCar2가 만들어졌습니다.")
    }

    fun ride() {
        println("탑승하였습니다.")
    }

    fun drive() {
        println("달립니다.")
    }

    fun navi(destination: String) {
        println("$destination 으로 목적지가 설정되었습니다.")
    }
}

//오버로딩
// -> 이름이 같지만 받는 파라미터가 다른 함수
class TestClass() {
    //    멤버변수는 이름 같은거 못씀
    //    구분할 수 없는 두개를 작성할 수 없음
    //    이름이 같더라도 파라미터가 다르면 구분할 수 있으므로
    //    이름이 같은 함수 두 개를 만들 수 있다.
    fun test(a: Int) {
        println("up")
    }

    fun test(a: Int, b: Int) {
        println("down")
    }
}