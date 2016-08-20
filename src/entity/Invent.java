package entity;

import java.io.Serializable;




public class Invent implements Serializable {
	private String discription;

	private User user;

	private Worker worker;

	public Invent() {
		super();
	}

	public String getDiscription() {
		return discription;
	}

	public User getUser() {
		return user;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	
	
}
