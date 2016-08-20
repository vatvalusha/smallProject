package commands;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.glass.ui.Window.Level;
import com.sun.istack.internal.logging.Logger;

import entity.User;
import manager.Config;
import servlet.Dispatcher;
import sql.DaoFactory;

public class LoginUser extends Dispatcher {
	
	private static final String EMAIL = "email";
    private static final String PASSWORD = "password";
    
    public LoginUser() {
    	super();
	}
    public String exute(HttpServletRequest request,
			HttpServletResponse responce) throws ServletException, IOException{
	    	String page = null;
	        String email = request.getParameter(EMAIL);
	        String password = request.getParameter(PASSWORD);
	        try{
	        	if(DaoFactory.newUser().findUser(email, password)){
	        		System.out.println("+");
	        		HttpSession session = request.getSession(true);
	        		session.setAttribute("",new String(email));
	        		
	        		ArrayList<User> entities = new ArrayList<User>();
	        		
	        		entities = DaoFactory.newUser().outPutUser(email);
	        		request.setAttribute("rows",entities);
	        		request.setAttribute("email", email);
	        		page = Config.getInstance().getProperty(Config.PRIVATE);
//	        		this.forward("/private.jsp", request, responce);
	        	}else{
//	        		this.forward("/error.jsp", request, responce);
	        		page = Config.getInstance().getProperty(Config.LOGIN);
	        	}
	        	
	        }catch(SQLException e){
	        	Logger.getLogger(LoginUser.class.getName(), null).log(java.util.logging.Level.SEVERE, null, e);
	        }
	        return page;
    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String email = request.getParameter(EMAIL);
//		String password = request.getParameter(PASSWORD);
//        try {
//			if(DaoFactory.newUser().findUser(email, password)){
//				HttpSession session = request.getSession(true);
//				session.setAttribute("email", new String(email));
//				User user = DaoFactory.newUser().outPutUser(email);
//				int id_user = user.getId();
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//    }
    
}
