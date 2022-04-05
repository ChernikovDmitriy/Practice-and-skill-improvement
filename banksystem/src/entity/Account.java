package entity;

public class Account {

private Person accountHold;

    private Bill bill;

    public Account(Person accountHold, Bill bill) {
        this.accountHold = accountHold;
        this.bill = bill;
    }

    public Person getAccountHold() {
        return accountHold;
    }

    public void setAccountHold(Person accountHold) {
        this.accountHold = accountHold;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
