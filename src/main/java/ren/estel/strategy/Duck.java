package ren.estel.strategy;


import ren.estel.strategy.fly.FlyBehavior;
import ren.estel.strategy.quak.QuackBehavior;


public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("я плаваю");
    }

    public void display() {
        System.out.println("я выгляжу так");
    }
}
