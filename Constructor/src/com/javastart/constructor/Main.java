package com.javastart.constructor;

public class Main {

public static void main(String[] args) {

Cat lori = new Cat("lori");

SayCatService sayCatService = new SayCatService();

sayCatService.say(lori, "I want to eat");

    Cat baxter = new Cat("Baxter");
    sayCatService.say(baxter, "I want to sleep");

    Cat martin = new Cat("Martin");
    sayCatService.say(martin, "I want to play");

SayCatService.sayMeow();
System.out.println(sayCatService.hello);



}




}
