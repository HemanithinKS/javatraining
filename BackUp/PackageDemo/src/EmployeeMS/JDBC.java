package EmployeeMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
	static Connection con;
//	static boolean tableExists(String tableName) {
//        try {
//            String checkTable = "SELECT TABLE_NAME FROM USER_TABLES WHERE TABLE_NAME = ?";
//            PreparedStatement st = con.prepareStatement(checkTable);
//            st.setString(1, tableName.toUpperCase()); // Table names are stored in uppercase
//            ResultSet rs = st.executeQuery();
//            return rs.next(); // Returns true if the table exists
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//	static void createTable() {
//		String createTable = "CREATE TABLE Employee (" + "EID INT PRIMARY KEY, " + "Ename VARCHAR2(250), " + "age INT, "
//				+ "email VARCHAR2(250), " + "address VARCHAR2(250))";
//
//		try {
//			if (!tableExists("Employee")) { // Check if the table exists
//				PreparedStatement st = con.prepareStatement(createTable);
//				st.executeUpdate();
//				System.out.println("Table 'Employee' created successfully.");
//			} else {
//				System.out.println("Table 'Employee' already exists.");
//			}
//		} catch (SQLException e) {
//			System.out.println("Table creation error.");
//			e.printStackTrace();
//		}
//	}

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";

			String username = "demo";
			String password = "demo";

			con = DriverManager.getConnection(jdbcUrl, username, password);

			System.out.println("Database connected successfully.");
		} catch (SQLException e) {
			System.out.println("Database connection error.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return con;
	}
}
