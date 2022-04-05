package com.homework.banksystem;

import Service.DepositService;
import Service.PaymentService;
import Service.TransferService;
import entity.Account;
import entity.Bill;
import entity.Person;

public class Main {

    public static void main (String[] args) {

Person loriPerson = new Person("Lori", "Cat", "+32432545");

Bill loriBill = new Bill(10000);

Account loriAccount = new Account(loriPerson, loriBill);

Person martinPerson = new Person("Martin", "Dog", "+3465464576");

    Bill martinBill = new Bill(8000);

    Account martinAccount = new Account(martinPerson, martinBill);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(loriAccount, 1000);
        paymentService.pay(martinAccount, 1500);

        DepositService depositService = new DepositService();
        depositService.deposit(loriAccount, 3000);
        depositService.deposit(martinAccount, 3500);

        TransferService transferService = new TransferService();
        transferService.transfer(loriAccount, martinAccount, 3000);

    }

        }
