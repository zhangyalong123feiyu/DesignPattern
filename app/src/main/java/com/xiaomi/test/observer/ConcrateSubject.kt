package com.xiaomi.test.observer

class ConcrateSubject : SubJect{
    val arrayList= ArrayList<Observer>()
    override fun addObserver(observer: Observer) :SubJect {
        arrayList.add(observer)
        return this
    }

    override fun removeObserver(observer: Observer):SubJect {
        arrayList.remove(observer)
        return this
    }

    override fun notifyObservers() {
        arrayList.forEach {
            it.update("")
        }
    }

}