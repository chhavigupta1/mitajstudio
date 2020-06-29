package com.niit.mitajstudio.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.niit.mitajstudio.config.HibernateUtil;
import com.niit.mitajstudio.model.Customer;

public class UserDaoImpl implements UserDao {
//show now where? is servlet?
	@Override
	public boolean addUser(Customer u) {
		
		try{
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();	
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(u);
		session.flush();
		tx.commit();
			
		
		return true;
	}
	catch(HibernateException e)
		{
		e.printStackTrace();
		return false;		
		}
	}

	@Override
	public List<Customer> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getUserByusername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validate(String email, String password) {
		// TODO Auto-generated method stub
		return false;
	}
}
