package com.customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




public class CustomerDB {
	
	private static Connection con = null;
	private static Statement stat = null;
	private static ResultSet rs = null;
	private static boolean isSuccess;
	
	//.....customer login....
	public static boolean validate(String username, String password){
			
		//validate...
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "select * from customer where username='"+username+"'and password='"+password+"'";
			rs = stat.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} 
			else {
				isSuccess = false;
			}
			
			
		
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return isSuccess;
		
	}
	
	public static List<Customer> getCustomer(String userName) {
		
		ArrayList<Customer> customer = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stat = con.createStatement();
			
			String sql = "select * from customer where username='"+userName+"'";
			rs = stat.executeQuery(sql);
			
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String nic = rs.getString(5);
				String username = rs.getString(6);
				String password = rs.getString(7);
				
				Customer cus = new Customer(id,name,email,phone,nic,username,password);
				customer.add(cus);
			}
			
		} catch (Exception e) {
			
		}
		
		return customer;	
	}
	
	//...register...
	public static boolean insertCustomer(String name , String email , String phone , String nic , String uname , String password) {

		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			
			String sql = "insert into customer values (0,'"+name+"','"+email+"','"+phone+"','"+nic+"','"+uname+"','"+password+"')";
			int rs = stat.executeUpdate(sql);	
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
		return isSuccess;
			
	}
	
	//...edit profile...
	public static boolean updateCustomer(String id , String name , String email , String phone , String nic , String username) {
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			
			String sql = "update customer set name ='"+name+"', email ='"+email+"', phone ='"+phone+"', username ='"+username+"'" + "where id = '"+id+"' ";
			int rs = stat.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
		
	}
		
	public static List <Customer> getCustomerDetails(String Id){
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList <Customer> cus = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			
			String sql = "select * from customer where id = '"+convertedID+"' ";
			rs = stat.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String nic = rs.getString(5);
				String username = rs.getString(6);
				String password = rs.getString(7);
				
				Customer c = new Customer(id, name, email, phone, nic, username, password);
				cus.add(c);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return cus;
	}
	
	//...delete account...
	public static boolean deleteCustomer(String id) {
		
		int convID = Integer.parseInt(id);
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			
			String sql = "delete from customer where id = '"+convID+"'";
			int r = stat.executeUpdate(sql);
			
			if(r > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	//...admin login...
	public static boolean validateAdmin(String username, String password) {		
	//validate...
			try {
				con = DBConnect.getConnection();
				stat = con.createStatement();
				String sql = "select * from adminDet where username='"+username+"'and password='"+password+"'";
				rs = stat.executeQuery(sql);
				
				if (rs.next()) {
					isSuccess = true;
				} 
				else {
					isSuccess = false;
				}
				
				
			
			}
			catch(Exception e) {
				e.printStackTrace();
				
			}
			
			return isSuccess;
			
		}

}
