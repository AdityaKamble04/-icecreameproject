package com.demo.dao;

import java.util.List;

import com.demo.Entity.order;

public interface orderdao {

    void saveOrder(order order);
    
    order getOrder(Long orderId);
    
    void updateOrder(order order);
    
    void deleteOrder(Long orderId);
    
    List<order> getAllOrders();
}
