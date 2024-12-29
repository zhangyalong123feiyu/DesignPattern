package com.xiaomi.test.decker

class Beat(worker: Worker) : Skill(worker) {
    private var worker: Worker? = null

    override fun work() {
        System.out.print("我在打")
    }
}