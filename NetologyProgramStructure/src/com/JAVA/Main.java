package com.JAVA;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число : ");
        int value1 = scanner.nextInt();

        System.out.println("Введите второе число : ");
        int value2 = scanner.nextInt();

        int sumAddition = sum(value1, value2);
     System.out.println("Результат сложения: " + sumAddition );

        }

        static int sum(int value1, int value2) {
            int result = value1 + value2;
            return result;
        }
    }





















