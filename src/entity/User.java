package entity;

import java.io.Serializable;

public class User implements Serializable {
	 	private int id;
	    public String name;
	    private String pass;
	    private String email;
	    private int age;
	    private String surname;
	    private String specialty;
	    
	    public String getSpecialty() {
			return specialty;
		}
		public void setSpecialty(String specialty) {
			this.specialty = specialty;
		}
		private boolean flag;
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public String getPass() {
			return pass;
		}
		public String getEmail() {
			return email;
		}
		public int getAge() {
			return age;
		}
		public String getSurname() {
			return surname;
		}
		public boolean isFlag() {
			return flag;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public void setFlag(boolean flag) {
			this.flag = flag;
		}

		
		public void getInfo(){
			System.out.println("Email: "+ email + " pass" + pass);
		}
//		@Override
//	    public String toString() {
//	        return getClass().getSimpleName() + "[id: " + id+
//	                "; Name: " + name +
//	                "; Surname: "+ surname +
//	                "; Password: " + pass +
//	                "; Email: "+ email +
//	                "; Age: "+ age +
//	                "; Specialty" + specialty +
//	                "; Flag: " + flag + "]";
//	    }

}
