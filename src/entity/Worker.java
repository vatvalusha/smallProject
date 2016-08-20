package entity;

import java.io.Serializable;


public class Worker implements Serializable {
	
	private String idEmployer;
	private String name;	
	private String surname;
	private String pass;
	private String email;
	private String company;
	public Worker() {
	}
	public String getIdEmployer() {
		return idEmployer;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getPass() {
		return pass;
	}
	public String getEmail() {
		return email;
	}
	public String getCompany() {
		return company;
	}
	public void setIdEmployer(String idEmployer) {
		this.idEmployer = idEmployer;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	

}
