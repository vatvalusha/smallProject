package servlet;

import java.io.IOException; 

import javax.servlet.RequestDispatcher; 
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 



public class Dispatcher extends HttpServlet { 
	private static final long serialVersionUID = 1L; 

/** 
* @see HttpServlet#HttpServlet() 
*/ 
	public Dispatcher() { 
		super(); 
		// TODO Auto-generated constructor stub 
	} 
	protected void forward(String address, HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{ 
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(address); 
		dispatcher.forward(request, response); 
} 

/** 
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response) 
*/ 


}
