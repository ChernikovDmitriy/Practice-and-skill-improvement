package com.javastart.inhreritance;

public class Main {

public static void main(String[] args) {
    British lori = new British(4, "Alex", "Lori");
    Scotish baxter = new Scotish(10, " Andre", "Baxter");

    lori.sayMeow();
    baxter.sayMeow();

    System.out.println("Cat name : " + lori.getName() + " Age " + lori.getAge() + " Onwer " + lori.getOwner());
    System.out.println("Cat name : " + baxter.getName() + " Age " + baxter.getAge() + " Onwer " + baxter.getOwner());

    British martin = new British(4, "Alex", "Lori");
    British anotherMartin= new British(4, "Alex", "Lori");
    System.out.println(martin == anotherMartin);
    System.out.println(martin.equals(anotherMartin));

}
}
