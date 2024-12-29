package com.xiaomi.test;

import com.xiaomi.test.proxy.Player;

public class TestProxyClient {
    public void doProxy(){
        RealPlayer realPlayer=new RealPlayer();
        Player jdkProxyFactory=new JDKProxyFactory(realPlayer).getProxy();
        jdkProxyFactory.loadVideo("ds");
    }
}
