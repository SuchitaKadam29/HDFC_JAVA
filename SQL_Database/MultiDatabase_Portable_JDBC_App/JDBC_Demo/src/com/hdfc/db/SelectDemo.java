package com.hdfc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {


		//step1 register driver  , register() or forName()
		
				try {
					DriverManager.registerDriver(new  com.mysql.cj.jdbc.Driver());
				
				//step2 get the DB Connection
					
		 Connection conn =    DriverManager.getConnection("jdbc:mysql://localhost:3306/hdfc_emp", "root", "admin");
					
		 			// step3 create any one statement
		 		Statement  stmt =	conn.createStatement();
				
		 	String select = "select dno,dname,location from dept";
		 			
				
		 		ResultSet rs =	stmt.executeQuery(select);
		 	
		 		while(rs.next()) {
		 			
		 System.out.println(rs.getInt("dno") +" "+ rs.getString("dname") +" "+ rs.getString(3));
		 			
		 		}
				
				
		}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				

	}

}
