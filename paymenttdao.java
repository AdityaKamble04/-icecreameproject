package com.demo.dao;

import java.util.List;

import com.demo.Entity.paymentt;

public interface paymenttdao {

    void savePaymentt(paymentt paymentt);
    
    paymentt getPaymentt(Long id);
    
    void updatePaymentt(paymentt paymentt);
    
    void deletePaymentt(Long id);
    
    List<paymentt> getAllPaymentts();
}