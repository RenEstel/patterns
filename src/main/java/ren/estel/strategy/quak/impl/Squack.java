package ren.estel.strategy.quak.impl;

import ren.estel.strategy.quak.QuackBehavior;

public class Squack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Пи пи пи");
    }
}
