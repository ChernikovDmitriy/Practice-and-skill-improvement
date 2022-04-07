package com.javastart.wrappers;

public class MainString {

public static void main (String[] args) {

    String firstString = "ABC";
    String secondString = "ABC";
    String thirdString = new String("ABC");
    String fourthString = new String("ABC").intern();

System.out.println(fourthString == thirdString);
System.out.println(fourthString.equals(thirdString));
System.out.println(firstString == secondString);
System.out.println(firstString == fourthString);

}

}
