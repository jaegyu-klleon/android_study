package com.example.latte

import android.widget.CompoundButton
import java.io.Serializable


//val data: Int
var data1 = 10
var data2: Int = 20

//fun main() {
//    fun sum(no: Int, optionalNumber: Int = 0): Int {
//        var sum: Int = optionalNumber
//        for (i in 1..no) {
//            if (i == 1) {
//                println("$optionalNumber + $i")
//            } else {
//                println("$sum + $i")
//            }
//            sum += i
//
//        }
//        return sum
//    }
//    println(sum(10, optionalNumber = 40))
//}
//
//fun fun1(): Unit {
//    val data: Nothing? = null
//
//}


fun main() {
    val func = {}
    fun func1() {

    }
//    val obj: Double = 5.0
    println("${func.javaClass.name}")
    println("${func.javaClass.kotlin}")
    println("${func.javaClass.kotlin.qualifiedName}")

//    val data: Array<Int> = Array(3) { 0 }
//    val data: Array<Int> = Array(3, { 0 })
//    data[0] = 10
//    data[1] = 20
//    data.set(2, 30)
//    println(data)
//
//    println(
//        """
//        array size : ${data.size}
//        array data : ${data[0]}, ${data[1]} , ${data.get(2)}
//    """.trimIndent()
//    )
//
//    val data1 = arrayOf<Int>(10, 20, 30)

//    val list = listOf<Int>(10, 20, 30)
//    val list: MutableList<Int> = MutableList(5, { 0 })
//    var list2 = mutableListOf(10, 20, 30, 40, 50)
//    list2[0] = 10

//    list2.add(1, 11)
//    list2.add(1, 12)
//    list2.add(1, 13)
//    list2.add(1, 14)
//    list2.set(1, 999)
//
//    println(list2.toString())
//    println(list2[1])
//
//    var set: MutableSet<Int> = mutableSetOf<Int>(10, 10, 20, 30, 40, 10)
//
//
//    set.add(11)
//    println(set.toString())

//    data class User(val age: Int = 0) {
//    }
//    val map: Map<String, User> = mapOf(Pair("one", User(age = 30)), "two" to User(20))
//    println(map.toString())

//    var data: Int = 30
//    when {
//        20 -> {
//            println("data는 20")
//            println("그냥")
//        }
//        30 -> {
//            println("data는 30")
//            println("그으냐앙")
//        }
//        else -> {
//            println("else else")
//        }
//        is String -> {
//            println("String 이래요")
//        }
//        data is Int -> {
//            println("Integer래요")
//        }
//        20, 30 -> {
//            println("20 이거나 30")
//        }
//        in 1..40 -> {
//            println("아하하하하")
//        }
//        data > 10 -> {
//            println("10보다 큰가")
//        }
//    }

//    for (i in 1..11 step 2) {
//        print("${i}, ")
//    }
//    println()
//
//    for (i in 1 until 11 step 2) {
//        print("${i}, ")
//    }
//    println()
//
//    for (i in 10 downTo 1 step 2) {
//        print("${i} , ")
//    }

//    val forList: Array<Int> = arrayOf(10, 20, 30, 40, 50)
//    println(forList.contentToString())
//
//    for (i in forList.indices) {
//        print("${forList[i]} ")
//        println(i)
//    }
//
//    for ((index, value) in forList.withIndex()) {
//        println("index: ${index}, value: ${value}")
//    }

//    class User(val name: String, val age: Int? = null) {
//        init {
//            println("init")
////            println("User 생성, 이름은 ${name}이고 나이는 ${age}")
//        }
//
//        constructor(name: String, age: Int) : this(name) {
//            println("age")
////            println("User 생성, 이름은 ${name}이고 나이는 ${age}")
//        }
//
//        constructor(name: String, age: Int, address: String) : this(name, age) {
//            println("address")
//            println("User 생성, 이름은 ${name}이고 나이는 ${age}살이고 주소는 ${address} 입니다")
//        }
//
//
//        fun printName() {
//            println("My name is ${this.name}")
//        }
//    }
//
//    val kim = User("kim", 17, address = "seoul station")
//
////    kim.name = "change"
//
//    println(kim.name)
//    kim.printName()

//    val jacob = Man("jacob")
//    jacob.printName()


//    printFun("asdflkjalksdf")

//    val abc = higherOrderFunction { no1: Int, no2: Int -> no1 < no2 }
//    println(abc())
//
//    when ("아하하") {
//        null -> println("null 일 때 실행하는지")
//        else -> {
//            println("alsdkfjklalksfjkl;asjfklsdjkl")
//        }
//    }

//    val button = Button()
//    button.showoff()
//    button.setFocus(true)
//    button.click()

//    val just = { println("아하하") }
//    just()

//    fun just() {
//        println("아하하")
//    }

//    fun a() {
//
//        fun b() {
//            println("asdfasdf")
//        }
//        return b()
//    }
//
//    fun c() = println("c1")
//    fun _c() {
//        return println("c2")
//    }
//
//    fun d(): () -> Unit {
//        return { println("lambda d") }
//    }
//
//    val f = { { println("이거냐") } }
//    fun g(): () -> Unit {
//        return { println("1") }
//    }
//
//    fun h(): () -> Int {
//        return { 1 }
//    }
//
//    fun h1(): () -> Unit {
//        fun ret() {
//            println("asdfadsf")
//        }
//        return { ret() }
//    }
//
//    h1()()


//    val tb = TalkativeButton()
//    tb.giveSpeech()

//    val user = User("jay")
//    val facebookUser = FacebookUser(1)
//    println(facebookUser.nickname)

//    val user = User("Alice")
//    user.address = "t1t1t1"
}

class User constructor(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """
            Address was changed for ${name}:
            "${field} -> "${value}".""".trimIndent()
            )
            field = value
        }
}

//interface User {
//    val email: String
//    val nickname: String
//        get() = email.substringBefore("@")
//}

//class PrivateUser(val email: String) : User {
//    override val nickname: String
//        get() = email.substringBefore("@")
//}
//
//class FacebookUser(val accountId: Int) : User {
//    override val nickname = getFacebookName(accountId)
//
//    fun getFacebookName(id: Int): String {
//        println(id)
//        return "facebookId${id}"
//    }
//}

/*  constructor  */
//class User(val nickname: String)

//class User constructor(_nickname: String) {
//    val nickname: String
//    init {
//        nickname = _nickname
//    }
//}

//class User constructor(_nickname: String) {
//    val nickname = _nickname
//}

//class User(val nickname: String, val isSubscribed: Boolean = true)

//open class User(val nickname: String)
//class TwitterUser(nickname: String) : User(nickname) {
//
//}
//
//open class Button()
//class RadioButton : Button() {}
//class Secretive private constructor() {}


interface State : Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State)
}

class CustomButton : View {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) {}

    class ButtonState : State {}
}


internal open class TalkativeButton : Focusable {
    private fun yell() = println("아하하하하")
    protected fun whisper() = println("Let's talk!")

    fun accessModifierTest() {
        yell()
        whisper()
    }
}

internal fun TalkativeButton.giveSpeech() {
    accessModifierTest()
}

class Test : CompoundButton.OnCheckedChangeListener {
    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
        TODO("Not yet implemented")
    }
}

interface Clickable {
    // 일반 메소드
    fun click()

    // default 구현이 있는 메소드
    fun showoff() = println("i'm clickable ")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} Focus")
    fun showoff() = println("I'm focusable")
}

class Button : Clickable, Focusable {
    //    override fun click() {
    //        println("길게 쓰기")
    //    }
    override fun click() = println("한줄로 쓰기")
    override fun showoff() {
        super<Clickable>.showoff()
        super<Focusable>.showoff()
    }
}

open class RightButton : Clickable {
    final override fun click() {
        TODO("Not yet implemented")
    }

}

open class LeftButton : Focusable {
    override fun setFocus(b: Boolean) {
        println("Left Button set Foucs 어쩌구")
        super.setFocus(b)
    }

    override fun showoff() {
        println("Left Button showoff 어쩌구")
        super.showoff()
    }

}

class TestButton : RightButton() {

}

abstract class Animated {
    abstract fun animate()

    open fun stopAnimating() {

    }

    fun animateTwice() {

    }
}


//fun higherOrderFunction(arg: (Int, Int) -> Boolean): () -> String {
//
//
//    return { "asdfasdf" }
//}


//var printFun: (param: String) -> Unit = { param: String ->
//    println(param)
//    println(123)
//}


//open class Person(
//    open val name: String? = null,
//    open val age: Int? = null
//) {
//
//    open fun printName() {
//        println("Person name is ${name}, age is ${age}")
//        println("Person name is ${this.name}, age is ${age}")
//    }
//}
//
//
////class Man(name: String) : Person(name) {
////
////}
//class Man(
//    override val name: String,
//    override val age: Int? = null
//) : Person(name) {
//
//    override fun printName() {
//        super.printName()
//        println("Man name is ${name}")
//        println("Man name is ${this.name}")
//        println("Man name is ${super.name}")
//
//    }
//}



