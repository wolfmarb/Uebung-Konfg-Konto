package org.campus02.yourname;

public class Account {
    private String owner;
    private double amount;

    public Account(String accountOwner) {
        this.owner = accountOwner;
        this.amount = 100;
    }

    public double credit (double value) {
        amount = amount + value;
        return amount;
    }

    public boolean debit (double value) {
        amount = amount - value;
        if (amount < 0) {
            return false;
        } return true;
    }
}
