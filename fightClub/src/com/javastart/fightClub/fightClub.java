package com.javastart.fightClub;

    public class fightClub {

   public String fight (Cat firstCat, Cat secondCat) {

       if (firstCat.getWeight() > secondCat.getWeight()) {
           return firstCat.getName();

       } else  {
           return secondCat.getName();
  }

   }

   }
