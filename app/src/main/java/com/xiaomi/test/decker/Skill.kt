package com.xiaomi.test.decker

open class Skill(worker: Worker) : Worker {
    private var worker: Worker? = worker

    override fun work() {
        this.worker?.work()
    }

    fun skill() {
        println("技能")
    }
}