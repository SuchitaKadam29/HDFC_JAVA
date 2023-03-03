package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.DBUtil;
import pojo.Dept;

public class DeptService {

	Connection conn = DBUtil.getDBConnection();

	public int insert(Dept dept) {

		int count = 0;

		String query = "insert into dept(dno,dname,location) values(?,?,?)"; // ? = positional param
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setInt(1, dept.getDno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLocation());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {

				System.err.println("Some Exp occur");
		}
		return count;
	}

	public int update(Dept dept) {

		int count = 0;

		String query = "update dept set dname = ? , location = ? where dno = ?"; // ? = positional param
		try {
			PreparedStatement pstmt = conn.prepareStatement(query);

			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLocation());
			pstmt.setInt(3, dept.getDno());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public int deleteById(int dno) {

		int count = 0;

		String query = "delete from dept where dno = ?";

		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public Dept selectById(int dno) {

		String query = "select * from dept where dno = ?";
		Dept selectedDept = new Dept();

		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, dno);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {

				selectedDept.setDno(rs.getInt("dno"));
				selectedDept.setDname(rs.getString("dname"));
				selectedDept.setLocation(rs.getString("location"));

			}
			else {
				
				// DeptNotFoundExp();
				
				System.err.println("Dept Not Found");
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return selectedDept;

	}

	public List selectAll() {

		List<Dept> list = new ArrayList<Dept>();

		String select = "select dno,dname,location from dept ";

		try {
			PreparedStatement pstmt = conn.prepareStatement(select);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				Dept dept = new Dept();

				dept.setDno(rs.getInt("dno"));
				dept.setDname(rs.getString("dname"));
				dept.setLocation(rs.getString("location"));

				list.add(dept);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;

	}

}
