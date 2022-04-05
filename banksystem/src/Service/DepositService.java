package Service;

import entity.Account;
import entity.Bill;



public class DepositService {

    public void deposit (Account account, int amount) {

Bill bill  = account.getBill();

int currentBillAmount = bill.getAmount();
        System.out.println("Операция пополнение счета, текущее значениее счета : " + currentBillAmount);
bill.setAmount(currentBillAmount + amount);
        System.out.println("Пополнение счета прошло успешно, новое значение счета : " + bill.getAmount());
    }

}
