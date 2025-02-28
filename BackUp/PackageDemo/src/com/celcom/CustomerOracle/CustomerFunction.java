package com.celcom.CustomerOracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerFunction {
	Connection con = DataBaseConnection.getConnection();
	Scanner sc = new Scanner(System.in);

	void createTable() {
		String createTable = "CREATE TABLE CUSTOMER (" + "ID NUMBER PRIMARY KEY, " + "Name VARCHAR2(155), "
				+ "DOB VARCHAR2(25), " + "Address VARCHAR2(255), " + "fatherName VARCHAR2(25), "
				+ "phoneNumber VARCHAR2(15), " + "AadharNumber VARCHAR2(12))";

		try {
			PreparedStatement pt = con.prepareStatement(createTable);
			pt.executeUpdate();
			System.out.println("Table created success.");
		} catch (SQLException e) {
			System.out.println("Error creating table.");
			e.printStackTrace();
		}
	}

	void addCustomer() {
		String addCustomer = "INSERT INTO CUSTOMER(ID, Name, DOB, Address, fatherName, phoneNumber, AadharNumber) VALUES(?, ?, ?, ?, ?, ?, ?)";

		try {
			PreparedStatement pt = con.prepareStatement(addCustomer);

			System.out.println("Enter Customer ID:");
			int id = sc.nextInt();
			pt.setInt(1, id);

			sc.nextLine();

			System.out.println("Enter The Name:");
			String name = sc.nextLine();
			pt.setString(2, name);

			System.out.println("Enter The DOB :");
			String DOB = sc.next();
			pt.setString(3, DOB);

			sc.nextLine();

			System.out.println("Enter the Address:");
			String Address = sc.nextLine();
			pt.setString(4, Address);

			System.out.println("Enter The Father's Name:");
			String Fname = sc.nextLine();
			pt.setString(5, Fname);

			System.out.println("Enter The Phone Number:");
			String pnum = sc.next();
			pt.setString(6, pnum);

			System.out.println("Enter The Aadhar Number:");
			String anum = sc.next();
			pt.setString(7, anum);

			pt.executeUpdate();
			pt.close();

			System.out.println("Added successfully!");

		} catch (SQLException e) {
			System.out.println("Adding error");
			e.printStackTrace();
		}
	}

	void editCustomerById() {
		String updateQuery = "UPDATE CUSTOMER SET Name = ?, DOB = ?, Address = ?, fatherName = ?, phoneNumber = ?, aadharNumber = ? WHERE ID = ?";

		try (PreparedStatement pt = con.prepareStatement(updateQuery)) {
			System.out.println("Enter Customer ID:");
			int id = sc.nextInt();

			System.out.println("Enter New Name:");
			String name = sc.nextLine();

			System.out.println("Enter New DOB (YYYY-MM-DD):");
			String dob = sc.nextLine();

			System.out.println("Enter New Address:");
			String address = sc.nextLine();

			System.out.println("Enter New Father's Name:");
			String fatherName = sc.nextLine();

			System.out.println("Enter New Phone Number:");
			String phoneNumber = sc.nextLine();

			System.out.println("Enter New Aadhar Number:");
			String aadharNumber = sc.nextLine();

			pt.setString(1, name);
			pt.setString(2, dob);
			pt.setString(3, address);
			pt.setString(4, fatherName);
			pt.setString(5, phoneNumber);
			pt.setString(6, aadharNumber);
			pt.setInt(7, id);

			int rowsUpdated = pt.executeUpdate();

			if (rowsUpdated > 0) {
				System.out.println("CUStomer details updated");
			} else {
				System.out.println("Customer  not found.");
			}

		} catch (SQLException e) {
			System.out.println("Update error");
			e.printStackTrace();
		}
	}

	void viewallCustomer() {
		String view = "select * from CUSTOMER";
		PreparedStatement pt;
		try {
			pt = con.prepareStatement(view);
			ResultSet rs = pt.executeQuery();
			System.out.println(
					"Id  |        Name        |      DOB     |       Address                  |    FAther Name         |  Phone number    | Aadhar Number            | ");
			while (rs.next()) {
				System.out.printf("%d | %s | %s | %s | %s | %s | %s |\n", rs.getInt("ID"), rs.getString("Name"),
						rs.getString("DOB"), rs.getString("Address"), rs.getString("fatherName"),
						rs.getString("phoneNumber"), rs.getString("AadharNumber"));

			}
		} catch (SQLException e) {
			System.out.println("view error ");
			e.printStackTrace();
		}

	}

	void removeCustomerById() {
		String delete = "DELETE FROM CUSTOMER WHERE ID = ?";

		try {
			PreparedStatement pt = con.prepareStatement(delete);
			System.out.println("Enter Customer ID to remove:");
			int id = sc.nextInt();

			pt.setInt(1, id);

			int rowsDeleted = pt.executeUpdate();

			if (rowsDeleted > 0) {
				System.out.println("Customer with removed ");
			} else {
				System.out.println("CUSTomer not found.");
			}

		} catch (SQLException e) {
			System.out.println("Error while removing customer");
			e.printStackTrace();
		}
	}

}
