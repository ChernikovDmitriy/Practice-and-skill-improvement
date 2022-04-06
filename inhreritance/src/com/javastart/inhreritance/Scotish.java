package com.javastart.inhreritance;

public class Scotish extends Cat {

    private String name;

    public String getName() {
        return name;
    }

    public Scotish(int age, String onwer, String name) {
        super(age, onwer);
this.name = name;


    }

    @Override
    public String toString() {
        return "Cat name : " + name + " Age : " + getAge() + " Owner : " + getOwner();
    }

}