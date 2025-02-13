package constructors;

import java.time.LocalDateTime;

public class BankAccount {
    String name;
    LocalDateTime opened;
    double balance;

    // no argument constructor
    public BankAccount() {
        this.name = "";
        this.opened = LocalDateTime.now();
        this.balance = 0.0d;
    }

    // parameterized constructor
    public BankAccount(String name, LocalDateTime opened, double balance) {
        this.name = name;
        this.opened = opened;
        this.balance = balance;
    }

    // copy constructor
    public BankAccount(BankAccount other) {
        this.name = other.name;
        this.opened = LocalDateTime.now();
        this.balance = other.balance;
    }

    // chained constructor
    public BankAccount(String name) {
        // if we want to chain a superclass constructor we have to use super instead of this
        this(name, LocalDateTime.now(), 0.0d);
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %f", this.name, this.opened.toString(), this.balance);
    }
}
