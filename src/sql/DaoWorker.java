package sql;


import java.sql.SQLException;

import manager.Connect;

public class DaoWorker {
	String sqlInspectio="Select * from employer WHERE email_emp = ? and pass_emp = ?";
	String sqlInsert = "insert into employer (name_emp,secondname_emp,pass_emp,email_emp,specialty_emp) value(?,?,?,?,?);";
	Connect connect = new Connect();
	
	
	public void AddWorker(String name, String	surname,
			String password, String email, String company) throws SQLException
	{
		try{
			connect.preparedStatement = connect.connection.prepareStatement(sqlInsert);
			connect.preparedStatement.setString(1, name);
			connect.preparedStatement.setString(2, surname);
			connect.preparedStatement.setString(3, password);
			connect.preparedStatement.setString(4, email);
			connect.preparedStatement.setString(5, company);
			connect.preparedStatement.executeUpdate();
		}catch (SQLException e) {
            e.printStackTrace();
        }finally {
			connect.preparedStatement.close();
			connect.connection.close();
		}
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
}
