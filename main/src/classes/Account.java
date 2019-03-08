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
        if(balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be less than 0");
        }
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
