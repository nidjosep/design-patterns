package com.c.bank.demo;

import com.b.singleton.logger.Logger;

public class Demo {

    private static final Logger logger = Logger.getInstance("bank-application.log");

    public static void main(String[] args) {
        BankAccount bankAccount = getBankAccount(1);
        bankAccount.deposit(100);
        bankAccount.deposit(200);
        bankAccount.withdraw(50);
        BankAccount recipient = getBankAccount(2);
        bankAccount.transfer(recipient, 60);
        bankAccount.withdraw(200);

        logger.write(String.format("[Acc No: %d] Current Balance: $%.2f", bankAccount.getAccountNumber(), bankAccount.getBalance()));
        logger.write(String.format("[Acc No: %d] Current Balance: $%.2f", recipient.getAccountNumber(), recipient.getBalance()));

    }

    private static BankAccount getBankAccount(long accountNumber) {
        logger.write(String.format("[Acc No: %d] Fetching bank account details", accountNumber));
        return new BankAccount(accountNumber);
    }
}
