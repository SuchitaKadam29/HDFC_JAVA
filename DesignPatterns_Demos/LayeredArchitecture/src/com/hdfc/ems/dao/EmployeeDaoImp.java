package com.hdfc.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hdfc.ems.entity.Employee;

public class EmployeeDaoImp implements IEmployeeDAO {

	private Connection conn;

	public EmployeeDaoImp() {

		this.conn = DBUtil.getDBConnection();

	}

	@Override
	public int addEmployee(Employee emp) {

		String insertQuery = "insert into employees(eid,ename,salary) values(?,?,?)";

		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, emp.getEid());
			pstmt.setString(2, emp.getEname());
			pstmt.setDouble(3, emp.getSalary());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> list = new ArrayList<Employee>();
		
		try {
			Statement stmt =		conn.createStatement();
			
			String query = "select eid,ename,salary from employees";
			
		ResultSet rs =	stmt.executeQuery(query);
			
				
			while(rs.next()) {
				
			Employee emp = new Employee();
			
				emp.setEid(rs.getInt("eid"));
				emp.setEname(rs.getString("ename"));
				emp.setSalary(rs.getDouble("salary"));
				
				list.add(emp);
				
				
				
			}
		
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
		
	}

}
