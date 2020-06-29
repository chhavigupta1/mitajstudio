package com.niit.mitajstudio.customercontroller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.mitajstudio.dao.UserDao;
import com.niit.mitajstudio.dao.UserDaoImpl;
import com.niit.mitajstudio.model.Customer;;

/**
 * Servlet implementation class GetAllUser
 */
@WebServlet("/GetAllUser")
public class GetAllUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
        
		RequestDispatcher rd;
		
        UserDao dao = new UserDaoImpl();
		List<Customer> customerList = dao.getAllUser();
		if(customerList!=null)
		{
			System.out.println("Getting user");
			request.setAttribute("list", customerList);
			rd=request.getRequestDispatcher("output.jsp");
			rd.forward(request, response);
		}
		else {
			rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
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
