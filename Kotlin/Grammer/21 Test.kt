package com.example.myapplication.kotlin

// 3 TV 클래스
// on/off
// 채널을 돌리는 기능
// 초기 채널은 (S사 M사 K사 3개)

fun main(args: Array<String>) {
    val tv = TV(listOf<String>("KBS", "SBS", "MBC"))

    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelUp()
    println(tv.checkCurrentChannel())
    println()

    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())

}

class TV(val channels: List<String>) {

    var onOrOff: Boolean = false //True -> ON False -> OFF
    var currentChannelNumber = 0
        set(value) {
            field = value
            if (field > 2) {
                field = 0
            }
            if (field < 0) {
                field = 2
            }
        }
        get() {
            println("호출되었습니다.")
            return field
        }
//    값의 할당
//    a = b

    fun switch() {
        onOrOff = !onOrOff
    }

    fun checkCurrentChannel(): String {
        return channels[currentChannelNumber]
    }

    fun channelUp() {
        currentChannelNumber = currentChannelNumber + 1
//        channels.forEachIndexed { index, value ->
//            if (currentChannelNumber == index) {
//                currentChannelNumber += 1
//                return
//            }
//        }
    }

    fun channelDown() {
        currentChannelNumber = currentChannelNumber - 1
    }
//        channels.forEachIndexed { index, value ->
//            if (currentChannelNumber == index) {
//                currentChannelNumber -= 1
//                return
//            }
//        }
//    }
}