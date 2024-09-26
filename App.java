package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.Entity.customer;
import com.demo.Entity.product;

public class App 
{
    public static void main( String[] args )
    {
        customer cust=new customer("Aditya","ak@gmail.com","8356050787","Mumbai");
        customer cust1=new customer("raju","rk@gmail.com","4846558272","Mumbai");
        product pro=new product("AMUL","CHOCOLATE","CUP",null);
 
        Configuration config=new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory=config.buildSessionFactory();
        
        Session session= factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cust);
        session.save(cust1);
        session.save(pro);
        tx.commit();
        session.close();
        System.out.println("Records save Succsessfully");
    }
}
