package entities;

public class Account {

    private int accountNumber;
    private double balance;

    public Account() {
    }

    public Account(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
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

    public void addBalance(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public String toString(){
        return "Número da conta: " +
        accountNumber + "\n" +
        "Saldo: R$" +
        String.format("%.2f",balance);
    }
}
