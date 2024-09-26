package com.demo.daoimpl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.demo.Entity.customer;
import com.demo.dao.customerdao;

import org.hibernate.HibernateException;

public class customerdaoImpl implements customerdao {

    private SessionFactory sessionFactory;

    public customerdaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveCustomer(customer customer) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.save(customer);
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public customer getCustomer(String customerName) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(customer.class, customerName);
        }
    }

    @Override
    public void updateCustomer(customer customer) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.update(customer);
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void deleteCustomer(String customerName) {
        Transaction transaction = null;
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            customer customer = session.get(customer.class, customerName);
            if (customer != null) {
                session.delete(customer);
                System.out.println("customer is deleted");
            }
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    @Override
    public List<customer> getAllCustomers() {
        try (Session session = sessionFactory.openSession()) {
            Query<customer> query = session.createQuery("from customer", customer.class);
            return query.list();
        }
    }
}
