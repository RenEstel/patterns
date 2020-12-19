package ren.estel.strategy.fly.impl;

import ren.estel.strategy.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I fly with wings");
    }
}
