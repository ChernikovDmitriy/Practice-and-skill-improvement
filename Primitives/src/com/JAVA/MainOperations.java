package com.JAVA;

/*
ДЗ Создать все численные типы инцилизировать их значениями провести математические операции создать переменные
для результатов операций результаты вывести в консоль
Так же повторить задание но все математические операции проводить в разным методах
 */

public class MainOperations {

    public static void main(String[] args) {


        int intValue = 91;
        byte byteValue = 19;
        double doubleValue = 32.65;
        long longValue = 345;
        float floatValue = 153.23f;
        short shortValue = 320;

        int result = byteValue + shortValue;
        long result2 = longValue + intValue;
        double result3 = doubleValue + floatValue;
        double result4 = intValue + doubleValue;

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        sumOperationsResult( byteValue, shortValue);
        sumOperationsResult2(longValue,  intValue);
        sumOperationsResult3( doubleValue, floatValue);
        sumOperationsResult4( intValue, doubleValue);

    }

    public static void sumOperationsResult(byte byteValue, short shortValue) {

        System.out.println(byteValue + shortValue);
  }

    public static void sumOperationsResult2(long longValue, int intValue) {

        System.out.println(longValue + intValue);
  }

    public static void sumOperationsResult3(double doubleValue, float floatValue) {

        System.out.println(doubleValue + floatValue);
  }

    public static void sumOperationsResult4(int intValue, double doubleValue) {

        System.out.println(intValue + doubleValue);
    }
}
