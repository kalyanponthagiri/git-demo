package com.java.scenario.three;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Select user type:");
            System.out.println("1. Patient");
            System.out.println("2. Doctor");
            System.out.println("3. Admin");
            System.out.println("4. Exit");
            
            n = sc.nextInt();

        } while (n < 1 || n > 4);

        switch (n) {
            case 1:
                Patient patient = new Patient("Enter your name", "Enter your email", "Enter your phone number");
                patient.displayMeanu();
                patient.chooseAction();
                break;
            case 2:
                Doctor doctor = new Doctor("Enter your name", "Enter your email", "Enter your phone number");
                doctor.displayMenu();
                doctor.chooseAction();
                break;
            case 3:
                Admin admin = new Admin("Enter your name", "Enter your email", "Enter your phone number");
                admin.manageUserData();
                break;
            case 4:
                System.out.println("Exiting...");
                break;
        }

        sc.close();
    }
}