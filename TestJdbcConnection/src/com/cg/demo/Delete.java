package com.cg.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.util.DBtil;

public class Delete {

	public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
		
		
		
		String qry = "delete from employee_tbl where empid = ?";
		try {
		
		Connection con =DBtil.getConnection();
		
		PreparedStatement pstmt = con.prepareStatement(qry);
		
		System.out.println("Enter Emp Id to Delete :");
		int id = sc.nextInt();
		pstmt.setInt(1, id);
		
		int n = pstmt.executeUpdate();
		System.out.println(n+" row Deleted");
		
		con.close();
	}
		catch(ClassNotFoundException e)
		 {
			 System.out.println(e.getMessage());
		 }
		catch(SQLException e)
		 {
			 System.out.println(e.getMessage());
		 }
		 }
	}

