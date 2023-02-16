package com.c.bank.demo;

import com.b.singleton.logger.Logger;

public class BankAccount {

    private final long accountNumber;
    private float balance = 0;
    private final Logger logger;

    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
        this.logger = Logger.getInstance("bank-application.log");
    }

    public void deposit(float amount) {
        balance += amount;
        logger.write(String.format("[Acc No: %d] $%.2f has been successfully credited. Updated balance=$%.2f", accountNumber, amount, balance));
    }

    public void withdraw(float amount) {
        if (balance >= amount) {
            balance -= amount;
            logger.write(String.format("[Acc No: %d] $%.2f has been successfully debited. Updated balance=$%.2f", accountNumber, amount, balance));
        } else {
            logger.write(String.format("[Acc No: %d] Debit failed due to insufficient balance. Current balance=$%.2f, Requested amount:$%.2f", accountNumber, balance, amount));
        }
    }

    public void transfer(BankAccount recipient, float amount) {
        if (balance >= amount) {
            balance -= amount;
            logger.write(String.format("[Acc No: %d] $%.2f has been successfully transferred. Updated balance=$%.2f", accountNumber, amount, balance));
            recipient.deposit(amount);
        } else {
            logger.write(String.format("[Acc No: %d] Transfer failed due to insufficient balance. Current balance=$%.2f, Requested amount:$%.2f", accountNumber, balance, amount));
        }
    }

    public double getBalance() {
        logger.write(String.format("[Acc No: %d] Balance request has been successfully processed. Current balance: $%.2f", accountNumber, balance));
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}
