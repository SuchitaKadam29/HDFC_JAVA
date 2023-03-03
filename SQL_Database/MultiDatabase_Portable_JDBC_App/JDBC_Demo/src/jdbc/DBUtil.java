package jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	public static Connection getDBConnection() {

		Connection conn = null;

		// step1 register driver
		try {
			/*
			 * Class.forName("com.mysql.cj.jdbc.Driver"); String url =
			 * "jdbc:mysql://localhost:3306/hdfc_emp"; String username = "root"; String
			 * password = "admin";
			 */

			FileReader fr = new FileReader("database.properties");

			Properties prop = new Properties();

			prop.load(fr);

			String driver = prop.getProperty("driver.classname");

			
			String url = prop.getProperty("url");
			String username = prop.getProperty("username");
			String password = prop.getProperty("password");

			
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;

	}

}
