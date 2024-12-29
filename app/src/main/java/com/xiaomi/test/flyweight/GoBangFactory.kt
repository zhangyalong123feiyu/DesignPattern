package com.xiaomi.test.flyweight

class GoBangFactory  {
    private val map = HashMap<String, GoBangFlyWeight>()

    init {
        map["black"] = BlachGoBanFly()
        map["wight"] = WightGoBanFly()
    }

    fun getGoBang(color: String): GoBangFlyWeight {
        return map[color]!!
    }

    companion object{
        fun getInstance(): GoBangFactory {
            return singleInstance()
        }
        private fun singleInstance(): GoBangFactory {
            val goBangFactory = GoBangFactory()
            return goBangFactory
        }
    }
}