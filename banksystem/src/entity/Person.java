package entity;

public class Person {

    private String name;

    private String surName;

    private String phoneNomber;

    public Person(String name, String surName, String phoneNomber) {
        this.name = name;
        this.surName = surName;
        this.phoneNomber = phoneNomber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPhoneNomber() {
        return phoneNomber;
    }

    public void setPhoneNomber(String phoneNomber) {
        this.phoneNomber = phoneNomber;
    }
}
