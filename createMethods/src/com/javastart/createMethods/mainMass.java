package com.javastart.createMethods;

import java.util.Scanner;

public class mainMass {

    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int[] mass = new int [5];

for(int i = 0; i < 5; i++) {


    mass[i] = scanner.nextInt();


}
        printMass(mass);

    }

   public static void printMass (int[] mass) {

        /*for(int i = 0; i < mass.length; i++) {

            System.out.println ("Значение индекса : " + i + "Значение элемента : " + mass[i]);
*/
            for(int element : mass) {

                System.out.println ("Значение элемента : " + element);




       }
       }



       }










