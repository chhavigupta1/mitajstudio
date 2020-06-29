package com.niit.mitajstudio.user;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niit.mitajstudio.dao.UserDao;
import com.niit.mitajstudio.dao.UserDaoImpl;
import com.niit.mitajstudio.model.Customer;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int userId;
	
	/**
     * @see HttpServlet#HttpServlet()
     */
	public RegisterServlet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		long phn=Long.parseLong(phone);
		
	Customer u = new Customer();
		
		u.setFirstname(firstname);
		u.setLastname(lastname);
		u.setUsername(username);
		u.setPassword(password);
		u.setEmail(email);
		u.setPhone(phn);
		
		System.out.println("User is going to add");
		UserDao dao=new UserDaoImpl();
		RequestDispatcher rd;
		
		try
		{
		
		if(dao.addUser(u))
		{
			System.out.println("User added");
			
			rd=request.getRequestDispatcher("/login.jsp");
			rd.forward(request, response);
			
		/*	HttpSession httpSession = request.getSession();
			httpSession.setAttribute("message", "Registration Successfull !! User id is " +customerId);
			
			response.sendRedirect("register.jsp");*/
		}
		else
		{
			rd=request.getRequestDispatcher("/register.jsp");
			rd.forward(request, response);
			/*
			System.out.println("There is some error please fill the form again!");
			rd=request.getRequestDispatcher("error.jsp");
			rd.include(request, response);*/
		}
	 
	 }
		catch (Exception e)	
		  {
			   System.out.println("------ EXCEPTION FROM SIGNUP.JAVA ------");
			   e.printStackTrace();
		  }
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			super.doPost(request, response);
		}
		
		

	}
