package com.niit.mitajstudio.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.niit.mitajstudio.dao.UserDao;
import com.niit.mitajstudio.model.Customer;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	/*	response.getWriter().append("Served at: ").append(request.getContextPath());*/	
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter(); 
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		
		Customer u=new Customer();
		u.setEmail(email);
		u.setPassword(password);
		
		RequestDispatcher rd=null;
		if(email.equalsIgnoreCase(email) && password.equalsIgnoreCase(password))
		{
			System.out.println("Login Successfull.");
			rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			
		}
		else {
			System.out.println("Your have entered a wrong email id or password!");
			rd=request.getRequestDispatcher("error.jsp");
			rd.include(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
