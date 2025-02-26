package EmployeeMS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeManager {
	private Connection con = JDBC.getConnection();
	private Scanner sc = new Scanner(System.in);

	public void addEmployee() {
		System.out.print("Enter Employee ID: ");
		int id = sc.nextInt();
	

		System.out.print("Enter Name: ");
		String name = sc.next();

		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		System.out.print("Enter Email: ");
		String email = sc.next();

		System.out.print("Enter Address: ");
		String address = sc.next();

		String query = "INSERT INTO Employee (EID, Ename, age, email, address) VALUES (?, ?, ?, ?, ?)";
		try (PreparedStatement ps = con.prepareStatement(query)) {
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4, email);
			ps.setString(5, address);
			ps.executeUpdate();
			System.out.println("Employee added successfully.");
		} catch (SQLException e) {
			System.out.println("Error adding employee.");
			e.printStackTrace();
		}
	}

	public void removeEmployee() {
		System.out.print("Enter Employee ID to remove: ");
		int id = sc.nextInt();

		String query = "DELETE FROM Employee WHERE EID = ?";
		try (PreparedStatement ps = con.prepareStatement(query)) {
			ps.setInt(1, id);
			int rowsAffected = ps.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Employee removed successfully.");
			} else {
				System.out.println("Employee not found.");
			}
		} catch (SQLException e) {
			System.out.println("Error removing employee.");
			e.printStackTrace();
		}
	}

	public void editEmployee() {
		System.out.print("Enter Employee ID to edit: ");
		int id = sc.nextInt();


		System.out.print("Enter new Email: ");
		String email = sc.next();

		System.out.print("Enter new Address: ");
		String address = sc.next();

		String query = "UPDATE Employee SET email = ?, address = ? WHERE EID = ?";
		try (PreparedStatement ps = con.prepareStatement(query)) {
			ps.setString(1, email);
			ps.setString(2, address);
			ps.setInt(3, id);
			int rowsAffected = ps.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Employee details updated successfully.");
			} else {
				System.out.println("Employee not found.");
			}
		} catch (SQLException e) {
			System.out.println("Error updating employee.");
			e.printStackTrace();
		}
	}
	public void ageEmployee() {
	    System.out.print("Enter age to find employees older than: ");
	    int age = sc.nextInt();

	    String query = "SELECT * FROM Employee WHERE age > ?";
	    try (PreparedStatement ps = con.prepareStatement(query)) {
	        ps.setInt(1, age);
	        ResultSet rs = ps.executeQuery();

	        boolean found = false;
	        while (rs.next()) {
	            found = true;
	            System.out.println("ID: " + rs.getInt("EID"));
	            System.out.println("Name: " + rs.getString("Ename"));
	            System.out.println("Age: " + rs.getInt("age"));
	            System.out.println("Email: " + rs.getString("email"));
	            System.out.println("Address: " + rs.getString("address"));
	        }
	        
	        if (!found) {
	            System.out.println("No employees found above the age of " + age);
	        }
	    } catch (SQLException e) {
	        System.out.println("Error fetching employees.");
	        e.printStackTrace();
	    }
	}

	public void searchEmployee() {
		System.out.print("Enter Employee ID to search: ");
		int id = sc.nextInt();

		String query = "SELECT * FROM Employee WHERE EID = ?";
		try (PreparedStatement ps = con.prepareStatement(query)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("ID: " + rs.getInt("EID"));
				System.out.println("Name: " + rs.getString("Ename"));
				System.out.println("Age: " + rs.getInt("age"));
				System.out.println("Email: " + rs.getString("email"));
				System.out.println("Address: " + rs.getString("address"));
			} else {
				System.out.println("Employee not found.");
			}
		} catch (SQLException e) {
			System.out.println("Error searching employee.");
			e.printStackTrace();
		}
	}

	public void viewEmployee() {
		String query = "SELECT * FROM Employee";
		try (PreparedStatement ps = con.prepareStatement(query); ResultSet rs = ps.executeQuery()) {
			System.out.println("\nAll Employees:");
			while (rs.next()) {
				System.out.println(
						"ID: " + rs.getInt("EID") + ", Name: " + rs.getString("Ename") + ", Age: " + rs.getInt("age")
								+ ", Email: " + rs.getString("email") + ", Address: " + rs.getString("address"));
			}
		} catch (SQLException e) {
			System.out.println("Error fetching employees.");
			e.printStackTrace();
		}
	}
}
