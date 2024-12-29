package com.xiaomi.test.flyweight

//五子棋类享元设计模式
abstract class GoBangFlyWeight {

    fun display(){
        System.out.print("棋子颜色："+getChessmanColor())
    }

    abstract fun getChessmanColor():String
}