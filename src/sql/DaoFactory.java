package sql;


public class DaoFactory {
	
	
	public static DaoUser newUser(){
		return new DaoUser();
	}
	
	 public static DaoWorker newWorker(){
	        return new DaoWorker();
	 }
	 
	 public static DaoRelation newRelation(){
		 return new DaoRelation();
	 }

}
