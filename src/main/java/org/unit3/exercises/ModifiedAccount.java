package org.unit3.exercises;

import java.math.BigDecimal;

public class ModifiedAccount {
    // Instance variable
    private double amount;
    private double balance;

    // Constructor
    public ModifiedAccount(double balance){
        this.balance = balance;
    }

    public String withdrawal(double amount){
        if(amount > balance)
            return "Withdrawal amount exceeded account balance";
        else
            balance -= amount;
            return String.format("You have successfully withdrawn %.2f from your account! Your current balance is %.2f", amount, balance);
    }
}
