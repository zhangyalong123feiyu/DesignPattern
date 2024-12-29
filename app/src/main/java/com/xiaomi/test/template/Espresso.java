package com.xiaomi.test.template;

public class Espresso extends CoffeeTemplate{
    @Override
    void brewCoffeeGrinds() {
        System.out.println("萃取咖啡");
    }

    @Override
    void addCondiments() {
        System.out.println("加入巧克力糖浆");
    }
}