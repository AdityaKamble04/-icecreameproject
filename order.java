package com.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.Column;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
public class order {

    @Id
  
    @Column(name = "orderid")
    private Long orderId;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private customer customer;

    @Column(name = "order_details")
    private String orderDetails;


   
    public order(customer customer, String orderDetails) {
        this.orderId = generateUniqueOrderId();
        this.customer = customer;
        this.orderDetails = orderDetails;
    }

    
    private Long generateUniqueOrderId() {
       
        return UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
    }

    
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public customer getCustomer() {
        return customer;
    }

    public void setCustomer(customer customer) {
        this.customer = customer;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", orderDetails='" + orderDetails + '\'' +
                '}';
    }
}
