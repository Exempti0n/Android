package com.example.myapplication.kotlin

fun main(args: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3)
    a.add(4) // index 안넣으면 맨 뒤에다 넣음
    println(a)
    a.add(0, 100) //이미 값이 있을 때는 값을 우측으로 밀고 값을 넣음
    println(a)
    a.set(0, 200)
    println(a)
    a.removeAt(1)
    println(a)

    val b = mutableSetOf<Int>(1, 2, 3, 4)
    println()
    b.add(2) // index가 없어서 넣을 필요가 없음
    println(b)
    b.remove(2)
    println(b)
    b.remove(100)
    println()

    val c = mutableMapOf<String, Int>("one" to 1)
    println()
    c.put("two", 2)
    println(c)
    c.replace("two", 3)
    println(c)
    println(c.keys)
    println(c.values)
    c.clear()
    println(c)

}