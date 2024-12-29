package com.xiaomi.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyFactory implements InvocationHandler {
    // 需要被代理的对象
    private Object object;

    public JDKProxyFactory(Object object) {
        this.object = object;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(
                // 当前线程的上下文类加载器
                Thread.currentThread().getContextClassLoader(),
                // 被代理对象的接口
                object.getClass().getInterfaces(),
                // 处理器自身
                this
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        // 进行方法匹配，调用对应方法名的方法
        if ("loadVideo".equals(method.getName())) {
            result = method.invoke(object, args);
        }

        if ("playVideo".equals(method.getName())) {
            System.out.println("前置增强");
            result = method.invoke(object, args);
            System.out.println("后置增强");
        }
        return result;
    }

}

