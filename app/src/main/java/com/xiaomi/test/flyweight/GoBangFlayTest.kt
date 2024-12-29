package com.xiaomi.test.flyweight

class GoBangFlayTest {
    fun testGoBangFlyWeight() {
        val goBangFlyWeightFactory = GoBangFactory.getInstance()
        val b1=goBangFlyWeightFactory.getGoBang("black")
        val b2=goBangFlyWeightFactory.getGoBang("black")
        val w1=goBangFlyWeightFactory.getGoBang("wight")
        val w2=goBangFlyWeightFactory.getGoBang("wight")
        b1.display()
        b2.display()
        w1.display()
        w2.display()
    }
}