package EmployeeMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC {
	static Connection con;
	static void createTable() {
		String createTable = "create table if not exists Employee ( EID int  PRIMARY KEY, Ename varchar(250), age int, email varchar(250), address varchar(250)) ;";
		try {
			PreparedStatement st = con.prepareStatement(createTable);
			st.executeUpdate();
			System.out.println("table created");
		} catch (Exception e) {
			System.out.println("Table creation error");
			
			
			
			
			e.printStackTrace();

		}
	}
	static {
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "nithin123");

			System.out.println("Database connected successfully.");
		} catch (SQLException e) {
			System.out.println("Database connection error.");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return con;
	}
}
