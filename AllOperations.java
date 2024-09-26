package com.demo.parlor;

import com.demo.Entity.customer;
import com.demo.Entity.product;
import com.demo.Entity.order;
import com.demo.Entity.paymentt;
import com.demo.Entity.admin;
import com.demo.Service.customerService;
import com.demo.Service.productService;
import com.demo.Service.orderService;
import com.demo.Service.paymenttService;
//import com.demo.Service.adminService;
import com.demo.ServiceImpl.customerServiceImpl;
import com.demo.ServiceImpl.productServiceImpl;
import com.demo.ServiceImpl.orderServiceImpl;
import com.demo.ServiceImpl.paymenttServiceImpl;
//import com.demo.ServiceImpl.AdminServiceImpl;

import java.util.List;
import java.util.Scanner;

public class AllOperations {

	static customerService customerService = new customerServiceImpl(null);
    static productService productService = new productServiceImpl();
    static Object orderService = new orderServiceImpl();
    static paymenttService paymentService = new paymenttServiceImpl(null);
    //static AdminService adminService = new AdminServiceImpl();

    static Scanner sc = new Scanner(System.in);

    // Customer Operations
    public static customer customerInputs() {
        System.out.println("Enter Customer Name:");
        String name = sc.nextLine();
        System.out.println("Enter Customer Email:");
        String email = sc.nextLine();
        System.out.println("Enter Customer Contact:");
        String contact = sc.nextLine();
        System.out.println("Enter Customer Address:");
        String address = sc.nextLine();
        return new customer(name, email, contact, address);
    }

    public static void customerOperations() {
        while (true) {
            System.out.println("1. Add Customer\n2. Retrieve All Customers\n3. Update Customer\n4. Delete Customer\n5. Go Back");
            int input = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (input) {
                case 1:
                    customer cust = customerInputs();
                    customerService.saveCustomer(cust);
                    System.out.println("Customer added successfully.");
                    break;
                case 2:
                    List<customer> customers = customerService.getAllCustomers();
                    customers.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Enter Customer Name to update:");
                    String nameToUpdate = sc.nextLine();
                    customer existingCustomer = customerService.getCustomer(nameToUpdate);
                    if (existingCustomer != null) {
                        customer updatedCustomer = customerInputs();
                        updatedCustomer.setCustomername(nameToUpdate); // preserve the original name
                        customerService.updateCustomer(updatedCustomer);
                        System.out.println("Customer updated successfully.");
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter Customer Name to delete:");
                    String nameToDelete = sc.nextLine();
                    customerService.deleteCustomer(nameToDelete);
                    System.out.println("Customer deleted successfully.");
                    break;
                case 5:
                    return; // Exit to main menu
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }

    // Product Operations
    public static product productInputs() {
        System.out.println("Enter Brand:");
        String brand = sc.nextLine();
        System.out.println("Enter Flavour:");
        String flavour = sc.nextLine();
        System.out.println("Enter Packaging:");
        String packaging = sc.nextLine();
        System.out.println("Enter Additional Info (optional):");
        String additionalInfo = sc.nextLine();
        return new product(brand, flavour, packaging, additionalInfo);
    }

    public static void productOperations() {
        while (true) {
            System.out.println("1. Add Product\n2. Retrieve All Products\n3. Update Product\n4. Delete Product\n5. Go Back");
            int input = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (input) {
                case 1:
                    product prod = productInputs();
                    productService.saveProduct(prod);
                    System.out.println("Product added successfully.");
                    break;
                case 2:
                    List<product> products = productService.getAllProducts();
                    products.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Enter Product Brand to update:");
                    String brandToUpdate = sc.nextLine();
                    product existingProduct = productService.getProduct(brandToUpdate);
                    if (existingProduct != null) {
                        product updatedProduct = productInputs();
                        updatedProduct.setBrand(brandToUpdate); // preserve the original brand
                        productService.updateProduct(updatedProduct);
                        System.out.println("Product updated successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter Product Brand to delete:");
                    String brandToDelete = sc.nextLine();
                    productService.deleteProduct(brandToDelete);
                    System.out.println("Product deleted successfully.");
                    break;
                case 5:
                    return; // Exit to main menu
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }

    // Order Operations
    public static order orderInputs() {
        System.out.println("Enter Customer Name:");
        String customerName = sc.nextLine();
        System.out.println("Enter Order Details:");
        String orderDetails = sc.nextLine();
        customer cust = customerService.getCustomer(customerName);
        return new order(cust, orderDetails);
    }
    public static void orderOperations() {
        while (true) {
            System.out.println("1. Add Order\n2. Retrieve All Orders\n3. Update Order\n4. Delete Order\n5. Go Back");
            int input = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (input) {
                case 1:
                    order ord = orderInputs();
                    ((com.demo.Service.orderService) orderService).saveOrder(ord);
                    System.out.println("Order added successfully.");
                    break;
                case 2:
                    List<order> orders = ((com.demo.Service.orderService) orderService).getAllOrders();
                    orders.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Enter Order ID to update:");
                    Long orderIdToUpdate = sc.nextLong();
                    
}
        }
    }
}