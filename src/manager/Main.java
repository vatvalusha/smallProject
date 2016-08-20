package manager;

import java.sql.SQLException;

import entity.User;
import sql.DaoFactory;
import sql.DaoUser;
import sql.DaoWorker;

public class Main {

	public static void main(String[] args) throws SQLException {
//		Connect connect = new Connect();
		User user = new User();
//		DaoFactory daoFactory = new DaoFactory();
//		DaoUser daoUser =  new DaoUser();
//		try {
//			daoUser.showUsers();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		DaoWorker daoWorker = new DaoWorker();
//		daoWorker.AddWorker("fghj", "dcd", "dfvfdv", "efvfv", "vfv");
		DaoUser daoUser = new DaoUser();
		daoUser.findUser("leha@loh.cpm", "qwerty");
		user.getInfo();
		
	}

}
