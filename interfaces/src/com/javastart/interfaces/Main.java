package com.javastart.interfaces;

public class Main {

public static void main (String[] args) {

   Cat lori = new Cat();
    Dog bublik = new Dog();

    lori.say();
    bublik.say();

    findOnwer(lori);
    findOmwer(bublik);

    System.out.println("Lori : " + ((Cat)lori).getOnwer() + "Bublik : " + ((Dog)bublik).getOnwer());
}

    private static void findOmwer(Animal bublik) {
    }

        private static void findOnwer(Animal animal) {
if (animal.getClass() == Cat.class) {
animal.setOnwer("Cat_Onwer");
}
        if (animal.getClass() == Dog.class) {
            animal.setOnwer("Dog_Onwer");
        }
    }

}
