package commands;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.User;
import servlet.Dispatcher;
import sql.DaoFactory;

public class LogOut  extends Dispatcher{

	public LogOut(){
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession(false);
		session.invalidate();
		this.forward("/index.jsp", request, response);
	}
}
