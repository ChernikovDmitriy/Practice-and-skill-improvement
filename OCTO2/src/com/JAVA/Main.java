package com.JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ArrayList<String> currency = new ArrayList<>();
        currency.add("0 - USD");
        currency.add("1 - RUB");
        currency.add("2 - EUR");
        currency.add("3 - KZT");
        currency.add("4 - SUM");
        currency.add("5 - JPY");
        currency.add("6 - KWD");
        currency.add("7 - BHD");
        currency.add("8 - OMR");
        currency.add("9 - JOD");


        double rateUsdToRub = 89.0;
        double rateUsdToEuro = 0.90;
        double rateUsdToSum = 11400.0;
        double rateUsdToKZT = 465.0;
        double rateUsdToJPY = 121.86;
        double rateUsdToKWD = 0.30;
        double rateUsdToBHD = 0.38;
        double rateUsdToOMR = 0.39;
        double rateUsdToJOD = 10.71;

        double rateRubToUsd = 0.012;
        double rateRubToEuro = 0.011;
        double rateRubToKZT = 5.50;
        double rateRubToSum = 135.53;
        double rateRubToJPY = 1.44;
        double rateRubToKWD = 0.35;
        double rateRubToBHD = 0.0045;
        double rateRubToOMR = 0.0046;
        double rateRubToJOD = 0.0086;
        double rateEuroToRub = 94.25;
        double rateEuroToUsd = 1.12;
        double rateEuroKZT = 518.70;
        double rateEuroToSum = 12588.4;
        double rateEuroToJPY = 135.91;
        double rateEuroToKWD = 0.34;
        double rateEuroToBHD = 0.42;
        double rateEuroToOMR = 0.43;
        double rateEuroToJOD = 0.78;

        double rateKztToUsd = 0.0021;
        double rateKztToRub = 0.18;
        double rateKztToEuro = 0.0019;
        double rateKztToSum = 24.62;
        double rateKztToJpy = 0.26;
        double rateKztToKWD = 0.00064;
        double rateKztToBHD = 0.00080;
        double rateKztToOMR = 0.00081;
        double rateKztToJOD = 0.0015;

        double rateSumToUsd = 0.000087;
        double rateSumToRub = 0.0074;
        double rateSumToEuro = 0.000078;
        double rateSumToKzt = 0.041;
        double rateSumToJpy = 0.011;
        double rateSumToKWD = 0.000027;
        double rateSumToBHD = 0.000033;
        double rateSumToOMR = 0.000034;
        double rateSumToJOD = 0.000062;

        double rateJpyToUsd = 0.0082;
        double rateJpyToRub = 0.69;
        double rateJpyToEuro = 0.0074;
        double rateJpyToKzt = 3.82;
        double rateJpyToSum = 93.97;
        double rateJpyToKWD = 0.23;
        double rateJpyToBHD = 0.0031;
        double rateJpyToOMR = 0.0031;
        double rateJpyToJOD = 0.0058;


        //KWD  отношение валют

        double rateKWDToUsd = 3.29;
        double rateKWDToRub = 273.28;
        double rateKWDToEuro = 2.97;
        double rateKWDToKzt = 1553.87;
        double rateKWDToSum = 37565.47;
        double rateKWDToBHD = 1.24;
        double rateKWDToOMR = 1.27;
        double rateKWDToJOD = 2.33;
        double rateKWDToJPY = 402.71;

        // BHD отношение к валютам

        double rateBHDToUsd = 2.65;
        double rateBHDToRub = 220.46;
        double rateBHDToEuro = 2.40;
        double rateBHDToKzt = 1253.42;
        double rateBHDToSUM = 30302.06;
        double rateBHDToKWD = 0.81;
        double rateBHDToOMR = 1.02;
        double rateBHDToJOD = 1.88;
        double rateBHDToJPY = 324.88;

        //OMR отношение к валютам

        double rateOMRToUsd = 2.60;
        double rateOMRToRub = 215.91;
        double rateOMRToEuro = 2.35;
        double rateOMRToKzt = 1227.61;
        double rateOMRToSum = 29678.08;
        double rateOMRToKWD = 0.79;
        double rateOMRToBHD = 0.98;
        double rateOMRToJOD = 1.84;
        double rateOMRToJPY = 318.6;

        //JOD отношение к валютам

        double rateJODToUsd = 1.41;
        double rateJODToRub = 117.42;
        double rateJODToEuro = 1.28;
        double rateJODToKzt = 666.66;
        double rateJODToSum = 16116.76;
        double rateJODToKWD = 0.43;
        double rateJODToBHD = 0.53;
        double rateJODToOMR = 0.54;
        double rateJODToJPY = 172.78;


        System.out.println(currency);
        System.out.println("Выберите валюту которую вы хотите конвертировать");

        int selectedCurrency = scanner.nextInt();

        System.out.println("Вы выбрали валюту" + " " + currency.get(selectedCurrency));


        System.out.println(currency);
        System.out.println("Выберете валюту в которую вы хотите конвертировать");
        int toConvert = scanner.nextInt();
        System.out.println("Вы выбрали валюту" + " " + currency.get(toConvert));


        System.out.println("Введите кол-во денег которое у вас есть");
        double myCurrencycount = scanner.nextDouble();


        //USD по отношению к выбранной валюте.
        if (selectedCurrency == 0 && toConvert == 1) {
            System.out.println("Ваши сбережения в RUB: " + myCurrencycount / rateUsdToRub);
        } else if (selectedCurrency == 0 && toConvert == 2) {
            System.out.println("Ваши сбережения в EUR: " + myCurrencycount / rateUsdToEuro);
        } else if (selectedCurrency == 0 && toConvert == 3) {
            System.out.println("Ваши сбережения в KZT: " + myCurrencycount / rateUsdToKZT);
        } else if (selectedCurrency == 0 && toConvert == 4) {
            System.out.println("Ваши сбережения в UZS: " + myCurrencycount / rateUsdToSum);
        } else if (selectedCurrency == 0 && toConvert == 5) {
            System.out.println("Ваши сбережения в JPY: " + myCurrencycount / rateUsdToJPY);
        } else if (selectedCurrency == 0 && toConvert == 6) {
                System.out.println("Ваши сбережения в KWD: " + myCurrencycount / rateUsdToKWD);
        } else if (selectedCurrency == 0 && toConvert == 7) {
                System.out.println("Ваши сбережения в BHD: " + myCurrencycount / rateUsdToBHD);
        } else if (selectedCurrency == 0 && toConvert == 8) {
                System.out.println("Ваши сбережения в OMR: " + myCurrencycount / rateUsdToOMR);
        } else if (selectedCurrency == 0 && toConvert == 9) {
                System.out.println("Ваши сбережения в JOD: " + myCurrencycount / rateUsdToJOD);


                //RUB по отношению к выбранной валюте

        } else if (selectedCurrency == 1 && toConvert == 0) {
            System.out.println("Ваши сбережения в USD: " + myCurrencycount / rateRubToUsd);
        } else if (selectedCurrency == 1 && toConvert == 2) {
            System.out.println("Ваши сбережения в EUR: " + myCurrencycount / rateRubToEuro);
        } else if (selectedCurrency == 1 && toConvert == 3) {
            System.out.println("Ваши сбережения в KZT: " + myCurrencycount / rateRubToKZT);
        } else if (selectedCurrency == 1 && toConvert == 4) {
            System.out.println("Ваши сбережения в UZS: " + myCurrencycount / rateRubToSum);
        } else if (selectedCurrency == 1 && toConvert == 5) {
            System.out.println("Ваши сбережения в JPY: " + myCurrencycount / rateRubToJPY);
        } else if (selectedCurrency == 1 && toConvert == 6) {
                System.out.println("Ваши сбережения в KWD: " + myCurrencycount / rateRubToKWD);
        } else if (selectedCurrency == 1 && toConvert == 7) {
                System.out.println("Ваши сбережения в BHD: " + myCurrencycount / rateRubToBHD);
        } else if (selectedCurrency == 1 && toConvert == 8) {
                System.out.println("Ваши сбережения в OMR: " + myCurrencycount / rateRubToOMR);
        } else if (selectedCurrency == 1 && toConvert == 9) {
                System.out.println("Ваши сбережения в JOD: " + myCurrencycount / rateRubToJOD);


            //EUR по отношению к выбраной валюте

        } else if (selectedCurrency == 2 && toConvert == 0) {
            System.out.println("Ваши сбережения в USD: " + myCurrencycount / rateEuroToUsd);
        } else if (selectedCurrency == 2 && toConvert == 1) {
            System.out.println("Ваши сбережения в RUB: " + myCurrencycount / rateEuroToRub);
        } else if (selectedCurrency == 2 && toConvert == 3) {
            System.out.println("Ваши сбережения в KZT: " + myCurrencycount / rateEuroKZT);
        } else if (selectedCurrency == 2 && toConvert == 4) {
            System.out.println("Ваши сбережения в UZS: " + myCurrencycount / rateEuroToSum);
        } else if (selectedCurrency == 2 && toConvert == 5) {
            System.out.println("Ваши сбережения в JPY: " + myCurrencycount / rateEuroToJPY);
        } else if (selectedCurrency == 2 && toConvert == 6) {
                System.out.println("Ваши сбережения в KWD: " + myCurrencycount / rateEuroToKWD);
        } else if (selectedCurrency == 2 && toConvert == 7) {
                System.out.println("Ваши сбережения в BHD: " + myCurrencycount / rateEuroToBHD);
        } else if (selectedCurrency == 2 && toConvert == 8) {
                System.out.println("Ваши сбережения в OMR: " + myCurrencycount / rateEuroToOMR);
        } else if (selectedCurrency == 2 && toConvert == 9) {
                System.out.println("Ваши сбережения в JPY: " + myCurrencycount / rateEuroToJOD);


            //KZT по отношению к выбраной валюте

        } else if (selectedCurrency == 3 && toConvert == 0) {
            System.out.println("Ваши сбережения в USD: " + myCurrencycount / rateKztToUsd);
        } else if (selectedCurrency == 3 && toConvert == 1) {
            System.out.println("Ваши сбережения в RUB: " + myCurrencycount / rateKztToRub);
        } else if (selectedCurrency == 3 && toConvert == 2) {
            System.out.println("Ваши сбережения в EUR: " + myCurrencycount / rateKztToEuro);
        } else if (selectedCurrency == 3 && toConvert == 4) {
            System.out.println("Ваши сбережения в UZS: " + myCurrencycount / rateKztToSum);
        } else if (selectedCurrency == 3 && toConvert == 5) {
            System.out.println("Ваши сбережения в JPY: " + myCurrencycount / rateKztToJpy);
        } else if (selectedCurrency == 3 && toConvert == 6) {
                System.out.println("Ваши сбережения в KWD: " + myCurrencycount / rateKztToKWD);
        } else if (selectedCurrency == 3 && toConvert == 7) {
                System.out.println("Ваши сбережения в BHD: " + myCurrencycount / rateKztToBHD);
        } else if (selectedCurrency == 3 && toConvert == 8) {
                System.out.println("Ваши сбережения в OMR: " + myCurrencycount / rateKztToOMR);
        } else if (selectedCurrency == 3 && toConvert == 9) {
                System.out.println("Ваши сбережения в JOD: " + myCurrencycount / rateKztToJOD);



                //SUM по отношению к выбраной валюте

        } else if (selectedCurrency == 4 && toConvert == 0) {
            System.out.println("Ваши сбережения в USD: " + myCurrencycount / rateSumToUsd);
        } else if (selectedCurrency == 4 && toConvert == 1) {
            System.out.println("Ваши сбережения в RUB: " + myCurrencycount / rateSumToRub);
        } else if (selectedCurrency == 4 && toConvert == 2) {
            System.out.println("Ваши сбережения в EUR: " + myCurrencycount / rateSumToEuro);
        } else if (selectedCurrency == 4 && toConvert == 3) {
            System.out.println("Ваши сбережения в KZT: " + myCurrencycount / rateSumToKzt);
        } else if (selectedCurrency == 4 && toConvert == 5) {
            System.out.println("Ваши сбережения в EUR: " + myCurrencycount / rateSumToJpy);
        } else if (selectedCurrency == 4 && toConvert == 6) {
                System.out.println("Ваши сбережения в KWD: " + myCurrencycount / rateSumToKWD);
        } else if (selectedCurrency == 4 && toConvert == 7) {
                System.out.println("Ваши сбережения в BHD: " + myCurrencycount / rateSumToBHD);
        } else if (selectedCurrency == 4 && toConvert == 8) {
                System.out.println("Ваши сбережения в OMR: " + myCurrencycount / rateSumToOMR);
        } else if (selectedCurrency == 4 && toConvert == 9) {
                System.out.println("Ваши сбережения в JOD: " + myCurrencycount / rateSumToJOD);

                //JPY по отношению к выбраной валюте

        } else if (selectedCurrency == 5 && toConvert == 0) {
            System.out.println("Ваши сбережения в USD: " + myCurrencycount / rateJpyToUsd);
        } else if (selectedCurrency == 5 && toConvert == 1) {
            System.out.println("Ваши сбережения в RUB: " + myCurrencycount / rateJpyToRub);
        } else if (selectedCurrency == 5 && toConvert == 2) {
            System.out.println("Ваши сбережения в EUR: " + myCurrencycount / rateJpyToEuro);
        } else if (selectedCurrency == 5 && toConvert == 3) {
            System.out.println("Ваши сбережения в KZT: " + myCurrencycount / rateJpyToKzt);
        } else if (selectedCurrency == 5 && toConvert == 4) {
            System.out.println("Ваши сбережения в UZS: " + myCurrencycount / rateJpyToSum);
        } else if (selectedCurrency == 5 && toConvert == 6) {
            System.out.println("Ваши сбережения в KWD: " + myCurrencycount / rateJpyToKWD);
        } else if (selectedCurrency == 5 && toConvert == 7) {
            System.out.println("Ваши сбережения в BHD: " + myCurrencycount / rateJpyToBHD);
        } else if (selectedCurrency == 5 && toConvert == 8) {
            System.out.println("Ваши сбережения в OMR: " + myCurrencycount / rateJpyToOMR);
        } else if (selectedCurrency == 5 && toConvert == 9) {
            System.out.println("Ваши сбережения в JOD: " + myCurrencycount / rateJpyToJOD);


            //KWD отношение к валютам

        } else if (selectedCurrency == 6 && toConvert == 0) {
            System.out.println("Ваши сбережения в USD: " + myCurrencycount / rateKWDToUsd);
        } else if (selectedCurrency == 6 && toConvert == 1) {
            System.out.println("Ваши сбережения в RUB: " + myCurrencycount / rateKWDToRub);
        }  else if (selectedCurrency == 6 && toConvert == 2) {
            System.out.println("Ваши сбережения в EUR: " + myCurrencycount / rateKWDToEuro);
        } else if (selectedCurrency == 6 && toConvert == 3) {
            System.out.println("Ваши сбережения в KZT: " + myCurrencycount / rateKWDToKzt);
        } else if (selectedCurrency == 6 && toConvert == 4) {
            System.out.println("Ваши сбережения в UZS: " + myCurrencycount / rateKWDToSum);
        } else if (selectedCurrency == 6 && toConvert == 5) {
            System.out.println("Ваши сбережения в JPY: " + myCurrencycount / rateKWDToJPY);
        }  else if (selectedCurrency == 6 && toConvert == 7) {
            System.out.println("Ваши сбережения в BHD : " + myCurrencycount / rateKWDToBHD);
        } else if (selectedCurrency == 6 && toConvert == 8) {
            System.out.println("Ваши сбережения в OMR: " + myCurrencycount / rateKWDToOMR);
        } else if (selectedCurrency == 6 && toConvert == 9) {
            System.out.println("Ваши сбережения в JOD: " + myCurrencycount / rateKWDToJOD);
        }

        //Конвертация валюты BHD в выбранную валюту

        else if (selectedCurrency == 7 && toConvert == 0) {
            System.out.println("Ваши сбережения в USD: " + myCurrencycount / rateBHDToUsd);
        } else if (selectedCurrency == 7 && toConvert == 1) {
            System.out.println("Ваши сбережения в RUB: " + myCurrencycount / rateBHDToRub);
        }  else if (selectedCurrency == 7 && toConvert == 2) {
            System.out.println("Ваши сбережения в EUR: " + myCurrencycount / rateBHDToEuro);
        } else if (selectedCurrency == 7 && toConvert == 3) {
            System.out.println("Ваши сбережения в KZT: " + myCurrencycount / rateBHDToKzt);
        } else if (selectedCurrency == 7 && toConvert == 4) {
            System.out.println("Ваши сбережения в UZS: " + myCurrencycount / rateBHDToSUM);
        } else if (selectedCurrency == 7 && toConvert == 5) {
            System.out.println("Ваши сбережения в JPY: " + myCurrencycount / rateBHDToJPY);
        } else if (selectedCurrency == 7 && toConvert == 6) {
            System.out.println("Ваши сбережения в KWD: " + myCurrencycount / rateBHDToKWD);
        }  else if (selectedCurrency == 7 && toConvert == 8) {
            System.out.println("Ваши сбережения в OMR: " + myCurrencycount / rateBHDToOMR);
        } else if (selectedCurrency == 7 && toConvert == 9) {
            System.out.println("Ваши сбережения в JOD: " + myCurrencycount / rateBHDToJOD);
        }

        //Конвертация валюты OMR в выбранную валюту

        else if (selectedCurrency == 8 && toConvert == 0) {
            System.out.println("Ваши сбережения в USD: " + myCurrencycount / rateOMRToUsd);
        } else if (selectedCurrency == 8 && toConvert == 1) {
            System.out.println("Ваши сбережения в RUB: " + myCurrencycount / rateOMRToRub);
        }  else if (selectedCurrency == 8 && toConvert == 2) {
            System.out.println("Ваши сбережения в EUR: " + myCurrencycount / rateOMRToEuro);
        } else if (selectedCurrency == 8 && toConvert == 3) {
            System.out.println("Ваши сбережения в KZT: " + myCurrencycount / rateOMRToKzt);
        } else if (selectedCurrency == 8 && toConvert == 4) {
            System.out.println("Ваши сбережения в UZS: " + myCurrencycount / rateOMRToSum);
        } else if (selectedCurrency == 8 && toConvert == 5) {
            System.out.println("Ваши сбережения в JPY: " + myCurrencycount / rateOMRToJPY);
        } else if (selectedCurrency == 8 && toConvert == 6) {
            System.out.println("Ваши сбережения в KWD: " + myCurrencycount / rateOMRToKWD);
        } else if (selectedCurrency == 8 && toConvert == 7) {
            System.out.println("Ваши сбережения в BHD: " + myCurrencycount / rateOMRToBHD);
        }    else if (selectedCurrency == 8 && toConvert == 9) {
            System.out.println("Ваши сбережения в JOD: " + myCurrencycount / rateOMRToJOD);
        }

        //Конвертация валюты JOD в выбранную валюту
        else if (selectedCurrency == 9 && toConvert == 0) {
            System.out.println("Ваши сбережения в USD: " + myCurrencycount / rateJODToUsd);
        } else if (selectedCurrency == 9 && toConvert == 1) {
            System.out.println("Ваши сбережения в RUB: " + myCurrencycount / rateJODToRub);
        }  else if (selectedCurrency == 9 && toConvert == 2) {
            System.out.println("Ваши сбережения в EUR: " + myCurrencycount / rateJODToEuro);
        } else if (selectedCurrency == 9 && toConvert == 3) {
            System.out.println("Ваши сбережения в KZT: " + myCurrencycount / rateJODToKzt);
        } else if (selectedCurrency == 9 && toConvert == 4) {
            System.out.println("Ваши сбережения в UZS: " + myCurrencycount / rateJODToSum);
        } else if (selectedCurrency == 9 && toConvert == 5) {
            System.out.println("Ваши сбережения в JPY: " + myCurrencycount / rateJODToJPY);
        } else if (selectedCurrency == 9 && toConvert == 6) {
            System.out.println("Ваши сбережения в KWD: " + myCurrencycount / rateJODToKWD);
        }   else if (selectedCurrency == 9 && toConvert == 7) {
            System.out.println("Ваши сбережения в BHD: " + myCurrencycount / rateJODToBHD);
        }    else if (selectedCurrency == 9 && toConvert == 8) {
            System.out.println("Ваши сбережения в OMR: " + myCurrencycount / rateJODToOMR);
        }


    }
}



