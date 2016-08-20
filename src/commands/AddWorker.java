package commands;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.Dispatcher;
import sql.DaoFactory;

public class AddWorker extends Dispatcher{
	private static final String IdWorker = "idWorker";
	private static final String NAME = "name";
    private static final String COMPANY = "company";
    private static final String SURNAME = "surname";
    private static final String EMAIL = "email";
    private static final String PASSWORD = "password";
    
    public AddWorker() {
    	super();
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
	    String name = request.getParameter(NAME);
		String surname = request.getParameter(SURNAME);
		String password = request.getParameter(PASSWORD);
		String email = request.getParameter(EMAIL);
		String company = request.getParameter(COMPANY);	
	
		try{
			if(DaoFactory.newWorker().inspectio(email, password))
				this.forward("/error.jsp", request, response);
			else{
				HttpSession session = request.getSession(true);
				session.setAttribute("email", email);
				DaoFactory.newWorker().AddWorker(name, surname, password, email, company);
				this.forward("/pageWorker.jsp", request, response);
				}
		}catch(Exception e){
			
	}
}
	
}
