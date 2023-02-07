package com.example.myapplication.kotlin

// 2 은행 계좌 만들기
// 계좌 생성 기능 (이름, 생년월일, 초기금액)
// 잔고 확인기능
// 출금 기능
// 예금 기능
fun main(args: Array<String>) {
    val account = Account("MESSI", "1989/06/24", 1000)
    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdraw(2000))
    println(account.checkBalance())

    println()
    val account2 = Account("MESSI", "1989/06/24", -2000)
    println(account2.checkBalance())
    println()

    val account3 = Account2("Neymar", "1992/02/05")
    println(account3.checkBalance())

}

class Account {

    val name: String
    val birth: String
    var balance: Int

    constructor(name: String, birth: String, balance: Int) {
        this.name = name
        this.birth = birth
        if (balance >= 0) {
            this.balance = balance
        } else {
            this.balance = 0
        }
    }

    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account2(val name: String, val birth: String, var balance: Int = 1000) {
    // balance 안들어오면 1000, 뭐라도 들어오면 그거
    fun checkBalance(): Int {
        return balance
    }

    fun withdraw(amount: Int): Boolean {
        if (balance >= amount) {
            balance -= amount
            return true
        } else {
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account3(initialBalance: Int) {

    val balance: Int = if (initialBalance >= 0) initialBalance else 0

    fun checkBalance(): Int {
        return balance
    }
}
