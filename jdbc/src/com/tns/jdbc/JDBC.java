package com.tns.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");// step 2  class loader 
		

		try {
 			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bindu","root","Bindu@123");//step 3 create connection
			
			Statement st = con.createStatement();// step 4
			String query1 = "insert into emp1 values(3,'Shivani')";
			String query = "select * from emp1";
			ResultSet rs = st.executeQuery("SELECT * from emp1");
			while(rs.next())
			  {
			    System.out.println(rs.getString(1));  //First Column
			    System.out.println(rs.getString(2));  //Second Column
			    //System.out.println(rs.getString(3));  //Third Column
			  }
			st.executeUpdate(query1);
			System.out.println("Student Table created successfully");
			
		System.out.println("Row inserted successfully");
			
st.close();
con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
