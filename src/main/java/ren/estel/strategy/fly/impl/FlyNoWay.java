package ren.estel.strategy.fly.impl;

import ren.estel.strategy.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
