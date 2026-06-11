package entities;

import java.util.Random;

public class Account {

    private User user;
    private int accountNumber;
    private double balance;
    private int password;

    public Account(int accountNumber, double balance, User user) {
        this.user = user;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(double balance, User user, int password) {
        this.user = user;
        this.accountNumber = accountNumGenerete();
        this.balance = balance;
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void addBalance(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    private int accountNumGenerete(){
        Random random = new Random();
        return 1000 + random.nextInt(9000);
    }

    public int getAccountNum(){
        return accountNumber;
    }

    public String toString(){
        return "Número da conta: " +
        accountNumber + "\n" +
        "Saldo: R$" +
        String.format("%.2f",balance);
    }
}
