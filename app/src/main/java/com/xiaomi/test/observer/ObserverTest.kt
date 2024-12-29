package com.xiaomi.test.observer

class ObserverTest {

    fun testObserver(){
        val observerOne=ObserverOne()
        val observerTwo=ObserverTwo()
        val concrateSubject=ConcrateSubject()
        concrateSubject.addObserver(observerOne).addObserver(observerTwo).notifyObservers()
    }
}