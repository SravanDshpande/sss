package com.cg.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.util.DBtil;

public class Update {

	public static void main(String[] args) throws Exception {
		
		
		String qry="update employee_tbl set empname='john' where empid=11";
		try {
		
		Connection con=DBtil.getConnection();
		
		PreparedStatement pstmt=con.prepareStatement(qry);
	     int rst=pstmt.executeUpdate();
		
		/*while(rst.next())
		{
			int id=rst.getInt("empid");
			String name=rst.getString("empname");
			double sal=rst.getDouble("empsal");
			System.out.println(id+" "+name+" "+sal);
		}*/
		System.out.println("Updated");
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
