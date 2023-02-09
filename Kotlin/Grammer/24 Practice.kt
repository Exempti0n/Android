package com.example.myapplication.kotlin


fun main(args: Array<String>) {

    val night = Night(20, 4)
    val monster = Monster(15, 5)

    night.attack(monster)
    monster.attack(night)

//    night.hp = 100
//    println(night.hp)
//
//    monster.hp = 200
//    monster.power = 100
//    night.heal()
//    private 하지 않으면 접근 가능
//    범위를 최소한으로 만든 다음에 필요한 경우에 넓혀가도록 한다.
}

class Night(private var hp: Int, private var power: Int) {

    fun attack(monster: Monster) {
        monster.defense(power)
    }

    fun defence(damage: Int) {
        hp -= damage
        if (hp > 0) {
            heal()
            println("기사 현재 채력은 $hp 입니다")
        } else println("기사가 죽었습니다")
    }

    private fun heal() {
//        아무때나 사용하는게 아니라
//        공격을 당했을 때 죽지 않았다면 사용 -> fun 앞에 private
        hp += 3
    }
}

class Monster2(private val hp: Int, private val power : Int) {
//    처음에 이렇게 만들고, 나중에 변경이 필요해지면 var로 변경
    private fun attack() {
//        함수도 private 붙였다가, 나중에 필요하면 private 없애기
    }
}

class Monster(private var hp: Int, private var power: Int) {

    fun attack(night: Night) {
        night.defence(power)
    }

    fun defense(damage: Int) {
        hp -= damage
        if (hp > 0) println("몬스터 현재 채력은 $hp 입니다")
        else println("몬스터가 죽었습니다")
    }
}