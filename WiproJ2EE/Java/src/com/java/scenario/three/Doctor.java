package com.java.scenario.three;

import java.util.Scanner;

public class Doctor extends User{
	
	Scanner sc;
	
	public Doctor(String name, String email, String number) {
		super(name, email, number);
	}
	
	public void displayMenu() {
        System.out.println("Select option: ");
        System.out.println("1. Add Appointment");
        System.out.println("2. View Appointments");
        System.out.println("3. Access Medical Records");
    }

    public void chooseAction() {
        sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addAppointment();
                break;
            case 2:
                viewAppointments();
                break;
            case 3:
                accessMedicalRecords();
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }

	public void addAppointment() {
		System.out.println("Booking Appointment");
	}
	
	public void viewAppointments() {
		System.out.println("Viewing Appointment");
	}
	
	public void accessMedicalRecords() {
		System.out.println("Accessing medical records");
	}
	
}
