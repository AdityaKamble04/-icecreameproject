package com.demo.Service;

import java.util.List;
import com.demo.Entity.customer;

public interface customerService {

    void saveCustomer(customer customer);
    
    customer getCustomer(String customerName);
    
    void updateCustomer(customer customer);
    
    void deleteCustomer(String customerName);
    
    List<customer> getAllCustomers();
}