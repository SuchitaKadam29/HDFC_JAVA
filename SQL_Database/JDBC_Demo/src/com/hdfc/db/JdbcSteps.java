package com.hdfc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSteps {

	public static void main(String[] args) {


		//step1 register driver  , register() or forName()
		
		try {
			DriverManager.registerDriver(new  com.mysql.cj.jdbc.Driver());
		
		//step2 get the DB Connection
			
 Connection conn =    DriverManager.getConnection("jdbc:mysql://localhost:3306/hdfc_emp", "root", "admin");
			
 			// step3 create any one statement
 		Statement  stmt =	conn.createStatement();
 		
 String insertQuery = "insert into dept(dno,dname,location) values(70,'security','delhi')";
 				
 				// step4 write query and execute it
 				// select query use executeQuery()  Select
 				// non - select query use executeUpdate() for DML
 
 
 			int count =		stmt.executeUpdate(insertQuery); // DML
 			
 				System.out.println(count+ "record inserted..");
 			
			conn.close(); // step5 close connection
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
