package com.java.scenario.one;

import java.util.Scanner;

class BankAccount {
    public int accountNumber;
    public int balance;

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully. Current balance: " + balance);
        } else {
            System.out.println("Invalid input. Please enter an amount greater than 0.");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }

    public void transfer(int amount, BankAccount recipient) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            recipient.deposit(amount);
            System.out.println("Amount transferred successfully. Your remaining balance: " + balance);
        } else {
            System.out.println("Transfer failed due to insufficient funds or invalid amount.");
        }
    }
}

class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc1 = new BankAccount(12345, 1000);
        BankAccount acc2 = new BankAccount(67890, 1000);

        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter account number: ");
                    int accNum = sc.nextInt();
                    if (accNum == acc1.accountNumber) {
                        System.out.println("Balance: " + acc1.getBalance());
                    } else if (accNum == acc2.accountNumber) {
                        System.out.println("Balance: " + acc2.getBalance());
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    accNum = sc.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    if (accNum == acc1.accountNumber) {
                        acc1.deposit(depositAmount);
                    } else if (accNum == acc2.accountNumber) {
                        acc2.deposit(depositAmount);
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    accNum = sc.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    if (accNum == acc1.accountNumber) {
                        acc1.withdraw(withdrawAmount);
                    } else if (accNum == acc2.accountNumber) {
                        acc2.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Invalid account number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter your account number: ");
                    int senderAccNum = sc.nextInt();
                    System.out.print("Enter recipient account number: ");
                    int recipientAccNum = sc.nextInt();
                    System.out.print("Enter amount to transfer: ");
                    int transferAmount = sc.nextInt();

                    if (senderAccNum == acc1.accountNumber && recipientAccNum == acc2.accountNumber) {
                        acc1.transfer(transferAmount, acc2);
                    } else if (senderAccNum == acc2.accountNumber && recipientAccNum == acc1.accountNumber) {
                        acc2.transfer(transferAmount, acc1);
                    } else {
                        System.out.println("Invalid account number(s).");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the system. Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}
