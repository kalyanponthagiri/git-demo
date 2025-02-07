package com.java.scenario.two;


abstract class Customer {
 public String name;
 public double totalPurchase;


 public Customer(String name, double totalPurchase) {
     this.name = name;
     this.totalPurchase = totalPurchase;
 }


 public abstract double calculateDiscount();
}


class RegularCustomer extends Customer {
	
 public RegularCustomer(String name, double totalPurchase) {
     super(name, totalPurchase);
 }

 @Override
 public double calculateDiscount() {
     
     return 0.05 * totalPurchase;
 }
}


class PremiumCustomer extends Customer {
	
 public PremiumCustomer(String name, double totalPurchase) {
     super(name, totalPurchase);
 }

 @Override
 public double calculateDiscount() {
    
     return 0.10 * totalPurchase;
 }
}


class Employee extends Customer {
	
 public Employee(String name, double totalPurchase) {
     super(name, totalPurchase);
 }

 @Override
 public double calculateDiscount() {
	 
     return 0.20 * totalPurchase;
 }
}
