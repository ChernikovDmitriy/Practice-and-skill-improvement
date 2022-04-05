package Service;

import entity.Account;

public class TransferService {

    public static void transfer(Account accountFrom, Account accountTo, int amount) {

        int billFromAmount = accountFrom.getBill().getAmount();
        int billToAmount = accountTo.getBill().getAmount();

        if (billFromAmount < amount) {
System.out.println("Недостаточно средств, перевод невозможен ");
  }
        else {

            System.out.println("Происходит перевод средств с аккаунта - " +
                    accountFrom.getAccountHold().getName() + " на аккаунт - " + accountTo.getAccountHold().getName());
            accountFrom.getBill().setAmount(billFromAmount - amount);
            accountTo.getBill().setAmount(billToAmount + amount);
            System.out.println("Перевод успешно завершен, текущее значение вашего счета " + (billFromAmount - amount) );
        }

    }
}
