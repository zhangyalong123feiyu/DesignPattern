package com.xiaomi.test.template;

public class BlackCoffee extends CoffeeTemplate{
    @Override
    void brewCoffeeGrinds() {
        System.out.println("过滤咖啡");
    }

    @Override
    void addCondiments() {
        System.out.println("加糖和牛奶");
    }
}
