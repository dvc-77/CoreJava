package org.unit4.exercises;

public class CreditLimit {
    private int accountNumber;
    private int beginningBalance;
    private int creditLimit;
    private int totalAmountCharged;
    private int totalCreditsApplied;

    public CreditLimit(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance){
        beginningBalance = balance;
    }

    public void setCreditLimit(int creditLimit){
        this.creditLimit = creditLimit;
    }

    public void setTotalAmountCharged(int totalAmountCharged){
        this.totalAmountCharged = totalAmountCharged;
    }

    public void setTotalCreditsApplied(int totalCreditsApplied){
        this.totalCreditsApplied = totalCreditsApplied;
    }

    public boolean isCreditExceeded(){
        return beginningBalance > creditLimit;
    }

    public void newBalance(){
        beginningBalance += totalAmountCharged - totalCreditsApplied;
    }
}
