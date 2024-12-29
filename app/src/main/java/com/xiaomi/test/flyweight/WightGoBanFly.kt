package com.xiaomi.test.flyweight

class WightGoBanFly : GoBangFlyWeight() {
    override fun getChessmanColor(): String {
        return "白色"
    }
}