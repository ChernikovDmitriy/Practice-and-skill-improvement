package com.javastart.fightClub;

public class Main {

public static void main(String[] args) {

Cat loriCat = new Cat();

loriCat.setName("Lori");
loriCat.setWeight(4);

   Cat baxter = new Cat();

   baxter.setName("Baxter");
   baxter.setWeight(10);


    fightClub fightClub = new fightClub();

    System.out.println("Winner : " + fightClub.fight(loriCat, baxter));

   loriCat.setWeight(12);
System.out.println("New Winner : " + fightClub.fight(loriCat, baxter));
}


}
