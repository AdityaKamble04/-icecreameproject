package com.demo.ServiceImpl;

import java.util.List;
import com.demo.Entity.customer;
import com.demo.Service.customerService;
import com.demo.dao.customerdao;

public class customerServiceImpl implements customerService {

    private customerdao customerDao;

    public customerServiceImpl(customerdao customerDao) {
        this.customerDao = customerDao;
    }

    public customerServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
    public void saveCustomer(customer customer) {
        // Business logic can be added here
        customerDao.saveCustomer(customer);
    }

    @Override
    public customer getCustomer(String customerName) {
        // Business logic can be added here
        return customerDao.getCustomer(customerName);
    }

    @Override
    public void updateCustomer(customer customer) {
        // Business logic can be added here
        customerDao.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(String customerName) {
        // Business logic can be added here
        customerDao.deleteCustomer(customerName);
    }

    @Override
    public List<customer> getAllCustomers() {
        // Business logic can be added here
        return customerDao.getAllCustomers();
    }
}