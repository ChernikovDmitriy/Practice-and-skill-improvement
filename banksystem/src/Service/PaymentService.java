package Service;

import entity.Account;
import entity.Bill;

public class PaymentService {

public void pay (Account account, int amount) {

Bill bill = account.getBill();
if (bill.getAmount() < amount) {

    System.out.println("Плотеж невозможен, недостаточно средств");

} else {

    int carrountBillAmount = bill.getAmount();
    System.out.println ("Происходит операция платежа, текущее значение счета : " + carrountBillAmount);
    bill.setAmount (carrountBillAmount - amount);
    System.out.println("Платеж завершен, новое значение счета : " + bill.getAmount() );

}

}
}
