package com.JAVA;

public class Main {

    public static void main(String[] args) {
        RecordStudio junoRecords = new RecordStudio("GHOST", "Bill", 2007, 156000);
        RecordStudio catManRecords = new RecordStudio("CAR", "Alex", 2009, 200000);
        RecordStudio weekRecords = new RecordStudio("BOOM", "JON", 2005, 120000);

       System.out.println("TOP 1 " + "\n Label : " + catManRecords.label  + "\n Owner : " + catManRecords.owner  + "\n Foundation year : " + catManRecords.foundationYear  + "\n Records : " + catManRecords.records);

       System.out.println("TOP 2 " + "\n Label : " + junoRecords.label + "\n Owner : " + junoRecords.owner  + "\n Foundation year : " + junoRecords.foundationYear  + "\n Records : " + junoRecords.records);

       System.out.println("TOP 3 " + "\n Label : "  + weekRecords.label  + "\n Owner : " + weekRecords.owner  + "\n Foundation year : " + weekRecords.foundationYear  + "\n Records : " + weekRecords.records);


    }
}
