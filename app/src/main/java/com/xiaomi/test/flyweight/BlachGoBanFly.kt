package com.xiaomi.test.flyweight

class BlachGoBanFly : GoBangFlyWeight() {
    override fun getChessmanColor(): String {
        return "黑色"
    }
}