package manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.fabric.jdbc.FabricMySQLDriver;
import com.mysql.jdbc.Driver;

public class Connect {
    private static final String URL = "jdbc:mysql://localhost:3306/projectitea";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public Connection connection = null;
    public PreparedStatement preparedStatement = null;
    public ResultSet resultSet = null; 
    public Statement statement = null;
    public Connect()  {
        try {
//            Driver driver = new FabricMySQLDriver();
//            DriverManager.registerDriver(driver);
        	try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//            if(!connection.isClosed()){
//                System.out.println("Coon");
//            }
// connection.close();
        } catch (SQLException e) {
            System.out.println("Fuck");
            e.printStackTrace();
        }
    }
    public void closeConnection() throws SQLException{
    	resultSet.close();
    	preparedStatement.close();
    	statement.close();
    	connection.close();
    }
    
    public Connection getConnection() {
        return connection;
    }
}
