package com.demo.Service;

import java.util.List;
import com.demo.Entity.paymentt;

public interface paymenttService {

    void savePaymentt(paymentt paymentt);
    
    paymentt getPaymentt(Long id);
    
    void updatePaymentt(paymentt paymentt);
    
    void deletePaymentt(Long id);
    
    List<paymentt> getAllPaymentts();

	paymentt getPaymentt(String brandToUpdate);

	void deletePaymentt(String brandToDelete);

	
}