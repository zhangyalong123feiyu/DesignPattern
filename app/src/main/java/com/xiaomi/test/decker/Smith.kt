package com.xiaomi.test.decker

class Smith(name: String, age: Int) : Worker {
    private var name: String? = name
    private var age: Int? = age
    fun getName(): String? {
        return name
    }
    fun setName(name: String) {
        this.name = name
    }
    fun getAge(): Int? {
        return age
    }
    fun setAge(age: Int) {
        this.age = age
    }
    override fun work() {
        println("打铁")
    }
}