package com.javastart.constructor;

public class SayCatService {

    public static String hello = "Hello from static!";

    public static void sayMeow() {
        System.out.println("Meow!");
    }

public void say(Cat cat, String message) {

    String catName = cat.getName();
    System.out.println(cancatNameAndMessage(catName, message));

}

private  String cancatNameAndMessage(String name, String message) {
return name + ": " + message;


}

}
