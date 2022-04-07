package com.javastart.interfaces;

public abstract class AbstractAnimal implements Animal {

    private String name;
    private int age;
    private String Onwer;

    public abstract void say();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOnwer() {
        return Onwer;
    }

    public void setOnwer(String onwer) {
        Onwer = onwer;
    }
}
