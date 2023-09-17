package oop.homework;

public class Account1 {
    private double bal;
    private int accnum;

    public Account1() {
    }

    public Account1(int a) {
        bal = 0.0;
        accnum = a;
    }

    public void deposit(double sum) {
        if (sum > 0) bal += sum;
        else System.out.println("Account.deposit(...):" + "cannot deposit negative ammount .");
    }

    public void withdraw(double sum) {
        if (sum > 0) bal -= sum;
        else System.out.println("Account.withdraw(...):" + "cannot withdraw negative ammount .");
    }

    public double getBalance() {
        return bal;
    }

    public double getAccnumNumber() {
        return accnum;
    }

    public String toString() {
        return "Acc" + accnum + ":" + "balance =" + bal;
    }

    public final void print() {
        System.out.println(toString());
    }
}

