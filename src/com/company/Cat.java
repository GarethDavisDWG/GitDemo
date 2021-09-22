package com.company;

import java.time.LocalDate;

public class Cat extends Mammal{

    //////////////////Attributes///////////////////////////
    private String breed;
    private LocalDate dateOfBirth;
    private String name;

    /////////////////Constructors//////////////////////////
    public Cat(){
        this("Moggy");
    }

    public Cat(String name){
        this(name,LocalDate.now());
    }

    public Cat(String name, LocalDate dOB){
        this(name,LocalDate.now(),"DSH");
    }

    public Cat(String name, LocalDate dOB, String breed){
        this.name = name;
        this.dateOfBirth =  dOB;
        this.breed = breed;
    }



    /////////////////Methods///////////////////////////////
    public String purr(){
        return "Puurrrrrr";
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("I eat mice");
    }
}
