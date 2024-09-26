package com.demo.Service;


import java.util.List;
import com.demo.Entity.order;

public interface orderService {

    void saveOrder(order order);
    
    order getOrder(Long orderId);
    
    void updateOrder(order order);
    
    void deleteOrder(Long orderId);
    
    List<order> getAllOrders();
}
