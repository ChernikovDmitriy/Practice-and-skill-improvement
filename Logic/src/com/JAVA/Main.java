package com.JAVA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



     System.out.println("Введите 1 число");
        int comprasion = scanner.nextInt();



     System.out.println("Введите 2 число");
        int comprasion2 = scanner.nextInt();

        if (comprasion > comprasion2) {

            System.out.println("1 число больше");

        }

       else if (comprasion2 > comprasion) {

            System.out.println("2 число больше");

        }

        else  {

            System.out.println("Оба числа равны");

        }

    }
}
