package com.xiaomi.test.template;

public abstract class CoffeeTemplate {
    public final void makeCoffee() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addCondiments();
    }

    abstract void brewCoffeeGrinds();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("煮开水");
    }

    void pourInCup() {
        System.out.println("倒入杯中");
    }
}
