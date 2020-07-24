package com.cg.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.util.DBtil;

public class Client {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println("enter sal");
		double salary=sc.nextDouble();
		Connection con=DBtil.getConnection();
		int employee_id=0;
		String cmd="insert into employee_tbl values(employee_seq.nextval,?,?)";
		PreparedStatement pstmt=con.prepareStatement(cmd);
		pstmt.setString(1, name);
		pstmt.setDouble(2, salary);
		pstmt.executeUpdate();
		cmd="select employee_seq.currval from dual";
		pstmt=con.prepareStatement(cmd);
		ResultSet rst=pstmt.executeQuery();
		if(rst.next())
		{
			employee_id=rst.getInt(1);
			
		}
		
		con.close();
		System.out.println("employee added successfully");
		System.out.println("employee id generated="+employee_id);
	}
	

}
