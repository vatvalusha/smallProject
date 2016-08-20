package commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.Dispatcher;
import sql.DaoFactory;

public class AddUser extends Dispatcher {
	private static final long serialVersionUID = 1L;
	
	private static final String idUser="idUser";
	private static final String NAME = "name";
	private static final String  EMAIL = "email";
	private static final String  PASSWORD = "password";
	private static final String SURNAME = "surname";
	private static final String AGE = "age";
	private static final String SPECIALTY = "specialty";
	
	public AddUser() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response){
		String name = request.getParameter(NAME);
		String surname = request.getParameter(SURNAME);
		String password = request.getParameter(PASSWORD);
		String email = request.getParameter(EMAIL);
		String age = request.getParameter(AGE);
		String specialty = request.getParameter(SPECIALTY);	
	
		try{
			if(DaoFactory.newUser().inspectio(email, password))
				this.forward("/error.jsp", request, response);
			else{
				HttpSession session = request.getSession(true);
				session.setAttribute("email", email);
				DaoFactory.newUser().addUser(name, surname, password, email, age, specialty);
				this.forward("/pageUser.jsp", request, response);
				 
				}
		}catch(Exception e){
			
		}
	}
 	
	
}
