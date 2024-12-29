package com.xiaomi.test.observer

interface SubJect {
    fun addObserver(observer: Observer): SubJect
    fun removeObserver(observer: Observer):SubJect
    fun notifyObservers()
}