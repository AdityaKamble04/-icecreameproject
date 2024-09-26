package com.demo.Entity;

import java.util.Scanner;
import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class paymentt {

	 @Column(name = "brand")
	    private String brand;

	    @Column(name = "unit_price")
	    private double unitPrice;

	    @Column(name = "quantity")
	    private int quantity;


	   
	    public paymentt(String brand, double unitPrice, int quantity) {
	        this.brand = brand;
	        this.unitPrice = unitPrice;
	        this.quantity = quantity;
	    }

	    
	    public double calculateAmountToPay() {
	        return unitPrice * quantity;
	    }


	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public double getUnitPrice() {
	        return unitPrice;
	    }

	    public void setUnitPrice(double unitPrice) {
	        this.unitPrice = unitPrice;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    @Override
	    public String toString() {
	        return "Paymentt{" +
	                ", brand='" + brand + '\'' +
	                ", unitPrice=" + unitPrice +
	                ", quantity=" + quantity +
	                '}';
	    }

	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("**Please enter quantity**");
	        int quantity = scanner.nextInt();
	        scanner.nextLine(); 
	        System.out.println("**Please enter brand**");
	        String brand = scanner.nextLine();

	        paymentt payment = new paymentt(brand, 1000, quantity);

	        
	        double amount = payment.calculateAmountToPay();
	        System.out.println("Total amount to be paid for " + payment.getQuantity() + " " + payment.getBrand() + ": " + amount);

	       
	        String[] paymentMethods = {"UPI", "VISA", "MASTERCARD", "COD"};
	        System.out.println();
	        System.out.println("Please select a payment method:");
	        for (int i = 0; i < paymentMethods.length; i++) {
	            System.out.println((i + 1) + ". " + paymentMethods[i]);
	        }

	        
	        int choice = scanner.nextInt();
	        scanner.nextLine(); 

	    
	        switch (choice) {
	            case 1: // UPI//
	                System.out.println("Enter your UPI ID:");
	                String upiId = scanner.nextLine();
	                System.out.println("Payment will be made using UPI ID: " + upiId);
	                break;
	            case 2: // VISA//
	            case 3: // MASTERCARD//
	                System.out.println("Enter your card number:");
	                String cardNumber = scanner.nextLine();
	                System.out.println("Enter card expiry date (MM/YY):");
	                String expiryDate = scanner.nextLine();
	                System.out.println("Enter card CVV:");
	                String cvv = scanner.nextLine();
	                String cardType = choice == 2 ? "VISA" : "MASTERCARD";
	                System.out.println("Payment will be made using " + cardType + " card.");
	                System.out.println("Card Number: " + cardNumber);
	                System.out.println("Expiry Date: " + expiryDate);
	                System.out.println("CVV: " + cvv);
	                break;
	            case 4: // COD//
	                System.out.println("Payment will be made using Cash on Delivery (COD).");
	                break;
	            default:
	                System.out.println("Invalid choice. Please select a valid payment method.");
	                break;
	        }

	    }
	}

