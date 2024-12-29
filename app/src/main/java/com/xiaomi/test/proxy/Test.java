package com.xiaomi.test.proxy;

public class Test {
    public void doTest(){
        RealPlayer realPlayer=new RealPlayer();
        Player jdkProxyFactory=new JDKProxyFactory(realPlayer).getProxy();
        jdkProxyFactory.loadVideo("mp3");

    }
}
