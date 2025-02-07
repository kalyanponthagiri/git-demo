package com.java.scenario.three;

import java.util.Scanner;

public class Admin extends User{
	
	Scanner sc;
	
	public Admin(String name, String email, String number) {
		super(name, email, number);
	}

	public void manageUserData() {
        sc = new Scanner(System.in);

        System.out.println("Select option:");
        System.out.println("1. Add User");
        System.out.println("2. Edit User");
        System.out.println("3. Delete User");
        System.out.println("4. View All Users");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addUser();
                break;
            case 2:
                editUser();
                break;
            case 3:
                deleteUser();
                break;
            case 4:
                viewAllUsers();
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }

	private void viewAllUsers() {
		System.out.println("User is viewing");
		
	}

	private void deleteUser() {
		System.out.println("User data is deleted");
		
	}

	private void editUser() {
		System.out.println("Data Edited");
		
	}

	private void addUser() {
		System.out.println("User data is added");		
	}
	
	
	
}
