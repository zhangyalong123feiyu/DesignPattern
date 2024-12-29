package com.xiaomi.test.decker

class Harding(worker: Worker) : Skill(worker) {
    private var worker: Worker? = null

    init {
        this.worker = worker
    }

    override fun work() {
        System.out.print("我在淬火")

    }
}