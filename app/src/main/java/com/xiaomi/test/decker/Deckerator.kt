package com.xiaomi.test.decker

class Deckerator {
    fun doTest(){
        val smith=Smith("张三", 20)
        val harding=Harding(smith)
        val beat=Beat(harding)
        harding.skill()
    }
}