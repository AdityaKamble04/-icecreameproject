package com.demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.Entity.admin;
import com.demo.Entity.customer;
import com.demo.Entity.order;
import com.demo.Entity.product;


public class hibernateutil {

	 private static final SessionFactory sessionFactory = buildSessionFactory();

	    // Build the SessionFactory from configuration
	    private static SessionFactory buildSessionFactory() {
	        try {
	            return new Configuration()
	                    .configure("hibernate.cfg.xml") 
	                    .addAnnotatedClass(customer.class).addAnnotatedClass(product.class).addAnnotatedClass(order.class).addAnnotatedClass(paymentt.class).addAnnotatedClass(admin.class)
	                    .buildSessionFactory();
	        } catch (Throwable ex) {
	 
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }

	}

