package com.company;

public class Bat extends Mammal implements Flying{
    @Override
    public void eat() {
        System.out.println("I eat moths");
    }

    @Override
    public void takeOff() {
        System.out.println("I am a Bat taking off");
    }

    @Override
    public void land() {
        System.out.println("I am a Bat landing");

    }

    @Override
    public void fly() {
        System.out.println("I am a Bat flying");
    }
}
