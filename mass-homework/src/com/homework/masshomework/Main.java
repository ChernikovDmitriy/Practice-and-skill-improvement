package com.homework.masshomework;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputCommand = new Scanner(System.in);

        System.out.println("Введите размер массива ");
        int massLenght = inputCommand.nextInt();

        int[] mass = new int [massLenght];

        Random random = new Random();

   for (int i = 0; i < mass.length; i++) {

     mass[i] = random.nextInt(30);

   }
        System.out.println("Введите число для поиска в массиве ");
   int number = inputCommand.nextInt();

   for (int element : mass) {

       if (element == number) {

           System.out.println(element);

       }

   }

   mass[8] = 9999;

   int max = mass[0];

   for(int element : mass) {

       if (element > max) {

           max = element;

       }

   }
       System.out.println("Максимальное значение");



    }

}
