package com.niit.mitajstudio.dao;

import java.util.List;

import com.niit.mitajstudio.model.Customer;

public interface UserDao {
	
	public boolean addUser(Customer u);
	/*boolean updatecustomerDetails(User userusername);*/
	/*boolean deletecustomerDetails(User userusername);*/
	
	List<Customer>getAllUser();
	List<Customer>getUserByusername(String username);
	
	
	public boolean validate (String email, String password);
	

}
