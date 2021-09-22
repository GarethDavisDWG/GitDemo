package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main
{


    public static void main(String[] args)
    {
        List<Animal> zoo = new ArrayList<Animal>();
        zoo.add(new Bat());
        zoo.add(new Cat());
        zoo.add(new DuckBilledPlatypus());

        for(Animal a:zoo){
            System.out.println(a.getClass());
            a.breathe();
            a.die();
            a.eat();
            a.sleep();
            a.reproduce();
            System.out.println();
            if(a instanceof Flying){
                ((Flying) a).fly();
                ((Flying) a).land();
                ((Flying) a).takeOff();
            }
        }

    }


}


