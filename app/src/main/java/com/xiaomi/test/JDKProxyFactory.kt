package com.xiaomi.test

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

class JDKProxyFactory(var any: Any) :InvocationHandler {

    fun <T> getProxy():T{
        return Proxy.newProxyInstance(Thread.currentThread().contextClassLoader,
            any.javaClass.interfaces,this) as T
    }

    override fun invoke(p0: Any?, p1: Method?, p2: Array<out Any>?): Any {
        var result:Any?=null
        if ("loadVideo".equals(p1!!.name)){
            result=p1.invoke(p0,p2)
        }
        if ("playVideo".equals(p1.name)){
            result=p1.invoke(p0,p2)
        }
        return result!!
    }
}