package commands;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import servlet.Dispatcher;
import sql.DaoFactory;

public class ShowUsers extends Dispatcher {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ShowUsers(){
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
		ArrayList<User> User = new ArrayList<User>();
		User = DaoFactory.newUser().showUsers();
		request.setAttribute("User", User);
		this.forward("/pageShow.jsp", request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
			}
}
