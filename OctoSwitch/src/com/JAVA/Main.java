package com.JAVA;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Папа : О вернулся ! Ну говори каких оценок больше всего,кстати от этого зависит твой подарок,если ты не забыл наш уговор");

        Scanner scanner = new Scanner(System.in);


        int grade = scanner.nextInt(); ;
        String gift;

        switch (grade) {
            case 5:
                gift = "Папа : Молодец завтра куплю тебе велосипед как и договаривались";
                break;
            case 4:
                gift = "Папа : Молодец завтра куплю тебе GoPro4";
                break;
            case 3:
                gift = "Папа : Награды не будет";
                break;
            case 2:
                gift = "Папа : Лучше бы молчал";
                break;
            case 1:
                gift = "Папа : ********* **** ***** **** ";
                break;
            default:
                gift = "Папа : Ну дошутился,фиг тебе а не подарок";
                break;
        }
        System.out.println(gift);

        }

    }

