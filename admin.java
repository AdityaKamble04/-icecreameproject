package com.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
public class admin {
    @Id
    private Long id;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private customer customer;

    @OneToOne
    @JoinColumn(name = "paymentt_id")
    private paymentt paymentt;

    @Column(nullable = false)
    private String feedbackForm;

    // Constructors, getters, and setter

    public admin(Long id, customer customer, paymentt paymentt, String feedbackForm) {
        this.id = id;
        this.customer = customer;
        this.paymentt = paymentt;
        this.feedbackForm = feedbackForm;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public customer getCustomer() {
        return customer;
    }

    public void setCustomer(customer customer) {
        this.customer = customer;
    }

    public paymentt getPayment() {
        return paymentt;
    }

    public void setPayment(paymentt paymentt) {
        this.paymentt = paymentt;
    }

    public String getFeedbackForm() {
        return feedbackForm;
    }

    public void setFeedbackForm(String feedbackForm) {
        this.feedbackForm = feedbackForm;
    }
}