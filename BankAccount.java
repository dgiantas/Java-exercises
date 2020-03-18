
package bankaccount;

import java.util.ArrayList;

public class BankAccount {

    private int number;
    private double amount;
    private String name;
    private boolean active;
    private ArrayList<String> transactions = new ArrayList();
    private static int accountsOpened;

    //Constructors:
    public BankAccount() {
        transactions.add("A new account is created.");
        System.out.println("The number of accounts opened:" + accountsOpened);
        accountsOpened++;
    }

    public BankAccount(String name, int number) {
        this();
        this.name = name;
        this.number = number;
    }

    public BankAccount(int number, String name, double amount, boolean active) {
        this();
        this.name = name;
        this.number = number;
        this.amount = amount;
        this.active = active;
        transactions.add("Name : " + this.name);
    }

    //Instance variables:
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setTransactions(ArrayList<String> transactions) {
        this.transactions = transactions;
    }

    public ArrayList<String> getTransactions() {
        return this.transactions;
    }
    //mMethods deposit and withdraw:

    public void deposit(double amount) {
        this.amount = this.amount + amount;
        this.transactions.add("Deposit: " + amount + "\n Total amount: " + (this.amount + amount));

    }

    public void withdraw(double amount) {
        if (this.amount - amount > 0) {
            this.transactions.add("Withdraw: " + amount + "\n Total amount: " + (this.amount - amount));
            this.amount = this.amount = amount;
        } else {
            System.out.println("You have insufficient funds to complete this transaction");
        }
    }

    public static void main(String[] args) {

    }

}
