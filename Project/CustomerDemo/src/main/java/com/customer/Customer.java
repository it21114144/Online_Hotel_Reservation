package com.customer;
import java.util.Random;
public class Customer extends Person{
	//private int id;
	private String name;
	private String email;
	private String phone;
	private String nic;
	
	int size = 10000;
	int id;
	
	Random r = new Random();
	
	//overloaded constructor
	public Customer(int id , String name, String email, String phone, String nic, String username, String password) {
		super(username, password);
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.nic = nic;
	}
	
	//getters
	public String getId() {
		for (int i = 0 ; i < size ; i++) {
			id = r.nextInt(10000);		
		}
		return ("EFF" + id);
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getNic() {
		return nic;
	}

	
}
