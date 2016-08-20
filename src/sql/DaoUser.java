package sql;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sun.org.apache.regexp.internal.recompile;

import entity.User;
import manager.Connect;

public class DaoUser {
	
	/**

	 * Все sql запрос которые относятьс к работнику

	**/
//	String sql="Insert into users (name_user, surname_user, pass_user, email_user, age_user, specialty_user, flag )  value(?,?,?,?,?,?);";
	String sqlInspectio="Select * from worek WHERE email_user = ? and pass_user = ?";
	String sqlInsert = "Insert into worek (name_user, surname_user, pass_user, email_user, age_user, specialty_user)  value(?,?,?,?,?,?);";
	String sqlFindUser = "Select * from worek where email_user = ? and pass_user = ?;";
	String sqlIdUser = "Select id_user from worek where email_user =  ?;";
	String sqlOutPutUser = "Select * from worek where email_user = ? ";
	
	Connect connect = new Connect();
	
    public ArrayList<User> showUsers() throws SQLException {
		connect.statement = connect.getConnection().createStatement();
		connect.resultSet = connect.statement.executeQuery("select * from worek;");
		ArrayList<User> users = new ArrayList<User>();
        while (connect.resultSet.next()) {
        	User user = new User();
        	user.setId(connect.resultSet.getInt("id_user"));
        	user.setName(connect.resultSet.getString("name_user"));
        	user.setSurname(connect.resultSet.getString("surname_user"));
        	user.setEmail(connect.resultSet.getString("email_user"));
        	user.setPass(connect.resultSet.getString("pass_user"));
        	user.setAge(connect.resultSet.getInt("age_user"));
        	user.setSpecialty(connect.resultSet.getString("specialty_user"));
        	user.setFlag(connect.resultSet.getBoolean("flag"));
            users.add(user);
        	//System.out.println(user.toString());
        }
        return users;
    }    
    public boolean inspectio(String email, String password) throws SQLException{
    	
    	try{
    		connect.preparedStatement = connect.connection.prepareStatement(sqlInspectio);
	    	connect.preparedStatement.setString(1, email);
	    	connect.preparedStatement.setString(2, password);
		    	try {
		    		connect.resultSet = connect.preparedStatement.executeQuery();
		    		return connect.resultSet.next();
		    	}finally{
					if(connect.resultSet != null) connect.resultSet.close();
					if(connect.preparedStatement != null) connect.preparedStatement.close();
					if(connect.connection != null) connect.connection.close();
				}
    	}catch(SQLException e){
    		e.printStackTrace();
        	return false;
    		}
    	}
    
    public void addUser(String name, String surname, String password, String email, String age, String specialty) throws SQLException{
    	try {
			connect.preparedStatement = connect.connection.prepareStatement(sqlInsert);
			connect.preparedStatement.setString(1, name);
	        connect.preparedStatement.setString(2, surname);
	        connect.preparedStatement.setString(3, password);
	        connect.preparedStatement.setString(4, email);
	        connect.preparedStatement.setString(5, age);
	        connect.preparedStatement.setString(6, specialty);
	        connect.preparedStatement.executeUpdate();
	        
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	finally{
			if(connect.resultSet != null) connect.resultSet.close();
			if(connect.preparedStatement != null) connect.preparedStatement.close();
			if(connect.connection != null) connect.connection.close();
		}
    	
    }

	public boolean findUser(String email, String password){
    	try{

    	
    		connect.preparedStatement = connect.connection.prepareStatement(sqlFindUser);
    		connect.preparedStatement.setString(1, email);
    		connect.preparedStatement.setString(2, password);
    		connect.resultSet = null;
    		try{
    			connect.resultSet=connect.preparedStatement.executeQuery();
    			return connect.resultSet.next();
    		}finally{
    			if(connect.resultSet != null) connect.resultSet.close();
    			if(connect.preparedStatement != null) connect.preparedStatement.close();
    			if(connect.connection != null) connect.connection.close();
    		}
    		
    	}catch(SQLException e){
    		e.printStackTrace();
    		return false;
    	}	
    }
	
	public String idUser(String email){
		try{
			String id = null;
			connect.preparedStatement = connect.connection.prepareStatement(sqlIdUser);
			connect.preparedStatement.setString(1, email);
			try{
				connect.resultSet = connect.preparedStatement.executeQuery();
				while(connect.resultSet.next()){
					id = connect.resultSet.getString("id_user");
				}
				return id;
			}finally{
				connect.closeConnection();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		String id = null;
		return id;
	}
	
	public ArrayList<User> outPutUser(String email) throws SQLException{
	
			connect.preparedStatement = connect.connection.prepareStatement(sqlOutPutUser);
			connect.preparedStatement.setString(1, email);
			connect.resultSet = connect.preparedStatement.executeQuery();
			ArrayList<User> entities = new ArrayList<User>();
			while(connect.resultSet.next()){
				User user = new User();
				user.setId(connect.resultSet.getInt("id_user"));
		       	user.setName(connect.resultSet.getString("name_user"));
		       	user.setSurname(connect.resultSet.getString("surname_user"));
		       	user.setEmail(connect.resultSet.getString("email_user"));
		       	user.setPass(connect.resultSet.getString("pass_user"));
	        	user.setAge(connect.resultSet.getInt("age_user"));
	        	user.setSpecialty(connect.resultSet.getString("specialty_user"));		        	user.setFlag(connect.resultSet.getBoolean("flag"));
		        entities.add(user);
			}
			return entities;
		}
	
//    public User findPersonalUser(String email){
//    	
//    }
//    public void findUser(){
//    	
//    }
}
