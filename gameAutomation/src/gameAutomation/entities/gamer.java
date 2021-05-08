package gameAutomation.entities;

import gameAutomation.abstracts.Entity;

public class gamer implements Entity{
	private int id;
	private String userName;
	private String firstName;
	private String lastName;
	private String age;
	private String national›dentificationNumbe;
	private String bornDate;
	
	public gamer() {
		
	}

	public gamer(int id, String firstName, String lastName, String age, String national›dentificationNumbe,
			String bornDate, String userName) {
	    
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.national›dentificationNumbe = national›dentificationNumbe;
		this.bornDate = bornDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getNational›dentificationNumbe() {
		return national›dentificationNumbe;
	}

	public void setNational›dentificationNumbe(String national›dentificationNumbe) {
		this.national›dentificationNumbe = national›dentificationNumbe;
	}

	public String getBornDate() {
		return bornDate;
	}

	public void setBornDate(String bornDate) {
		this.bornDate = bornDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
