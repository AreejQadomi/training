package classes;

public class Account {

    // Instance variables
    private String name;
    private double balance;
    private String type; // current, savings

    // Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Methods
    public void deposit(double amount){
        balance += amount; // balance = balance + amount
    }

    public void withdraw(double amount) {
        balance -= amount; // balance = balance - amount
    }
}
