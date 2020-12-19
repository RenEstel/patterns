package ren.estel.strategy.quak.impl;

import ren.estel.strategy.quak.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Кря - кря");
    }
}
