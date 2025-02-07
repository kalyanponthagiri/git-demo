package com.java.scenario.three;

import java.util.Scanner;

public class Patient extends User{
	
	Scanner sc;
	
	public Patient(String name, String email, String number) {
		super(name, email, number);
	}

	
	public void displayMeanu()
	{
		System.out.println("Select option: ");
        System.out.println("1. Book Appointment");
        System.out.println("2. View Medical History");
        System.out.println("3. Make Payment");
	}

	public void chooseAction() {
		sc = new Scanner(System.in);
		int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bookAppointment();
                break;
            case 2:
                viewMedicalHistory();
                break;
            case 3:
                makePayment();
                break;
            default:
                System.out.println("Invalid choice.");
        }
        
	}
	
	public void bookAppointment() {
		System.out.println("Appoint is booking ");
	}
	
	public void viewMedicalHistory() {
		System.out.println("viewing medical history");
	}
	
	public void makePayment() {
		System.out.println("making payment...");
	}
	
	
}
