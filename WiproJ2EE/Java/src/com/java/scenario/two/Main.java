package com.java.scenario.two;

public class Main {
    
    public static void printDiscount(Customer customer) {
        double discount = customer.calculateDiscount();
        System.out.println(customer.name + " gets a discount of: $" + String.format("%.2f", discount));
    }

    public static void main(String[] args) {
        
        Customer regularCustomer = new RegularCustomer("Alice", 200);
        Customer premiumCustomer = new PremiumCustomer("Bob", 200);
        Customer employee = new Employee("Charlie", 200);

        
        printDiscount(regularCustomer);  
        printDiscount(premiumCustomer);  
        printDiscount(employee);         
    }
}
