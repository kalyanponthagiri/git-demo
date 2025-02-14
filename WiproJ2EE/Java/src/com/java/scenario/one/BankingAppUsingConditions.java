package com.java.scenario.one;

import java.util.Scanner;

public class BankingAppUsingConditions {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int acc1 = 12345;
        int acc2 = 67890;
        double balanceAcc1 = 1000.00;  
        double balanceAcc2 = 2000.00;
        int option;
        

        while (true) {

            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            
            option = sc.nextInt();              
            
            switch (option) {
                case 1: 
                    System.out.println("Account 1 Balance: " + balanceAcc1);
                    System.out.println("Account 2 Balance: " + balanceAcc2);
                    break;
                
                case 2:
                    System.out.print("Enter account number (12345 for Account 1, 67890 for Account 2): ");
                    int accountNumber = sc.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    
                    if (accountNumber == acc1) {
                        balanceAcc1 += depositAmount;
                        System.out.println("Deposited " + depositAmount + " to Account 1. New balance: " + balanceAcc1);
                    } else if (accountNumber == acc2) {
                        balanceAcc2 += depositAmount;
                        System.out.println("Deposited " + depositAmount + " to Account 2. New balance: " + balanceAcc2);
                    } else {
                        System.out.println("Invalid Input");
                    }
                    break;
                
                case 3:
                    System.out.print("Enter account number (12345 for Account 1, 67890 for Account 2): ");
                    accountNumber = sc.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    
                    if (accountNumber == acc1) {
                        if (balanceAcc1 >= withdrawAmount) {
                            balanceAcc1 -= withdrawAmount;
                            System.out.println("Withdrew " + withdrawAmount + " from Account 1. New balance: " + balanceAcc1);
                        } else {
                            System.out.println("Insufficient balance in Account 1.");
                        }
                    } else if (accountNumber == acc2) {
                        if (balanceAcc2 >= withdrawAmount) {
                            balanceAcc2 -= withdrawAmount;
                            System.out.println("Withdrew " + withdrawAmount + " from Account 2. New balance: " + balanceAcc2);
                        } else {
                            System.out.println("Insufficient balance in Account 2.");
                        }
                    } else {
                        System.out.println("Invalid Input");
                    }
                    break;
                
                case 4:
                    System.out.print("Enter your account number: ");
                    int sourceAccount = sc.nextInt();
                    System.out.print("Enter recipient account number: ");
                    int destAccount = sc.nextInt();
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = sc.nextDouble();
                    
                    if (sourceAccount == acc1 && destAccount == acc2) {
                        if (balanceAcc1 >= transferAmount) {
                            balanceAcc1 -= transferAmount;
                            balanceAcc2 += transferAmount;
                            System.out.println("Transferred " + transferAmount + " from Account 1 to Account 2.");
                            System.out.println("New balance for Account 1: " + balanceAcc1);
                            System.out.println("New balance for Account 2: " + balanceAcc2);
                        } else {
                            System.out.println("Insufficient balance in Account 1.");
                        }
                    } else if (sourceAccount == acc2 && destAccount == acc1) {
                        if (balanceAcc2 >= transferAmount) {
                            balanceAcc2 -= transferAmount;
                            balanceAcc1 += transferAmount;
                            System.out.println("Transferred " + transferAmount + " from Account 2 to Account 1.");
                            System.out.println("New balance for Account 1: " + balanceAcc1);
                            System.out.println("New balance for Account 2: " + balanceAcc2);
                        } else {
                            System.out.println("Insufficient balance in Account 2.");
                        }
                    } else {
                        System.out.println("Invalid Input");
                    }
                    break;
                
                case 5:
                    System.out.println("Exiting the application...");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
