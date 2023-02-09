package com.example.myapplication.kotlin

// 27 Interface
// - 인터페이스는 약속! -> 니가 이것을 구현하면 너도 이 타입이다!
// - 상속은 부모클래스에서 받은 기능을 사용
// - 인터페이스를 구현하는 클래스는 인터페이스가 가지고 있는 함수를 반드시 구현해줘야한다.
// - 생성자가 없다 -> 인스턴스화 시킬 수 없다 -> 설명서가 아니다
// - 지침서 -> 니가 이것을 구현하고 싶다면 반드시 아래 기능을 구현해라!
// - 협업할 때 유용

// 상속이 만들어낸 특징
// - 자식 클래스는 부모 클래스의 타입이다.
// - 부모 클래스는 자식 클래스의 타입이 아니다.

// 상속과 다른점
// - 상속은 조상을 찾아가는 느낌 -> 최소한의 기능을 모아둔 느낌
// - 인터페이스는 종의 특징 -> 특징을 만족하면 이 타입이다 생각 가능


fun main(args: Array<String>) {
    val student_: Student_ = Student_()
    student_.eat() //호출 가능
    student_.sleep()
}


interface Person_ {
    fun eat() //중괄호가 없다
    fun sleep()
}

class Student_ : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}

class SoccerPlayer : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}

// 상속은 자식클래스들이 공통으로 가지고 있는 기능들을 부모클래스에 올려두면 편하다.
// 자식클래스가 부모클래스의 기능을 쓸 때 조금 다르다면 상속이 편함
// 인터페이스는 구현하는 클래스와 기능이 많이 다르다면 상속이 어울린다. -> 공통된 기능이 아니고 기능이 있으면 되기 때문에

open class Person() {
    open fun eat() {

    }

    fun sleep() {

    }
}

class Student() : Person() {
    override fun eat() {
        super.eat()
    }
}

class Teacher() : Person() {

}