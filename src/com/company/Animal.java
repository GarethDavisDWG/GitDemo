package com.company;

public abstract class Animal {

    ////////////////Attributes///////////////////////////////////





    //////////////////Constructors//////////////////////////////



    //////////////////Methods/////////////////////////////////
    public abstract void breathe();

    public abstract void eat();

    public void sleep(){
        System.out.println("I am sleeping");
    }

    public void die(){
        System.out.println("I am dead");
    }

    public abstract void reproduce();
}
