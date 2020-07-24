package com.cg.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.util.DBtil;

public class Insert {
	public static void main(String[] args) throws Exception {
		
		
		String qry="insert into employee_tbl values(employee_seq.nextval,'None',9000)";
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
		System.out.println("Inserted");
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
