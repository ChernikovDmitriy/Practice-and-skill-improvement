package com.javastart.createMethods;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

System.out.println("Ведите первое число");
   int first = scanner.nextInt();

System.out.println("Ведите второе число");
int second = scanner.nextInt();

System.out.println("Сумма " + sum(first, second));

}

public static int sum(int firstNumber, int secondNomber) {

int result = 0;

return result = firstNumber + secondNomber;

}

}
