package com.demo.ServiceImpl;

import java.util.List;
import com.demo.Entity.paymentt;
import com.demo.Service.paymenttService;
import com.demo.dao.paymenttdao;



public class paymenttServiceImpl implements paymenttService {

    private final paymenttdao paymenttDao;

    
    public paymenttServiceImpl(paymenttdao paymenttDao) {
        this.paymenttDao = paymenttDao;
    }

    @Override
    public void savePaymentt(paymentt paymentt) {
        // Business logic can be added here if needed
        paymenttDao.savePaymentt(paymentt);
    }

    @Override
    public paymentt getPaymentt(Long id) {
        // Business logic can be added here if needed
        return paymenttDao.getPaymentt(id);
    }

    @Override
    public void updatePaymentt(paymentt paymentt) {
        // Business logic can be added here if needed
        paymenttDao.updatePaymentt(paymentt);
    }

    @Override
    public void deletePaymentt(Long id) {
        // Business logic can be added here if needed
        paymenttDao.deletePaymentt(id);
    }

    @Override
    public List<paymentt> getAllPaymentts() {
        // Business logic can be added here if needed
        return paymenttDao.getAllPaymentts();
    }

	@Override
	public paymentt getPaymentt(String brandToUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePaymentt(String brandToDelete) {
		// TODO Auto-generated method stub
		
	}
}
