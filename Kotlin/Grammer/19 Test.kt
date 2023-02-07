package com.example.myapplication.kotlin

fun main(args: Array<String>) {
    val calculator = Calculator1()
    calculator.plus(1, 5)
    calculator.minus(1, 5)
    calculator.multiply(2, 4)
    calculator.divide(4, 2)
    println()

    val calculator2 = Calculator2()
    println(calculator2.plus(1, 2, 3, 4, 5))
    println(calculator2.minus(10, 1, 2, 3))
    println(calculator2.multiply(1, 2, 3))
    println(calculator2.divide(10, 2, 3))
    println()

    val calculator3 = Calculator3(3)
    val result = calculator3.plus(5).minus(7)
    println(result.initialValue)
//  ----------/Calculator3(3)
//  -------------------------/Calculator3(8)
//  ---------------------------------Calculator3(8).minus
//    -> 체이닝

}


// 1 사칙연산을 수행할 수 있는 클래스
class Calculator1() {

    fun plus(a: Int, b: Int) {
        println("$a + $b = ${a + b}")
    }

    fun minus(a: Int, b: Int) {
        println("$a - $b = ${a - b}")
    }

    fun multiply(a: Int, b: Int) {
        println("$a x $b = ${a * b}")
    }

    fun divide(a: Int, b: Int) {
        println("$a / $b = ${a / b}")
    }
}

class Calculator2() {
    fun plus(vararg numbers: Int): Int {
        var result = 0
        numbers.forEach {
            result += it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        for (i in 0 until numbers.size) {
            if (i != 0) {
                result = result - numbers[i]
            }
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach {
            if (it != 0) {
                result = result * it
            }
        }
        return result
    }

    fun divide(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        numbers.forEachIndexed { index, value ->
            if (index != 0 && value != 0) {
                result = result / value
            }
        }
        return result
    }
}

class Calculator3(val initialValue: Int) {

    fun plus(number: Int): Calculator3 {
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun minus(number: Int): Calculator3 {
        val result = this.initialValue - number
        return Calculator3(result)
    }

    fun multiply(number: Int): Calculator3 {
        val result = this.initialValue * number
        return Calculator3(result)
    }

    fun divide(number: Int): Calculator3 {
        val result = this.initialValue / number
        return Calculator3(result)
    }
}
