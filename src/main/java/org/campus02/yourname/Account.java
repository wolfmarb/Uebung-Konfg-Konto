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
        if (amount >= value ) {
            amount = amount - value;
            return true;
        } return false;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
