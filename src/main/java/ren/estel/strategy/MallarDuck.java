package ren.estel.strategy;

import ren.estel.strategy.fly.impl.FlyWithWings;
import ren.estel.strategy.quak.impl.Quack;

public class MallarDuck extends Duck {

    public MallarDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
}
