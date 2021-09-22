package com.company;

public abstract class Mammal extends Animal{

    /////////////////////////Attributes////////////////



    ////////////////////////Constructors///////////////////////




    //////////////////////////Methods/////////////////////////
    public void breathe(){
        System.out.println("Breathe in... breathe out");
    }

    @Override
    public void reproduce() {
        System.out.println("I do a Live Birth");
    }
}
