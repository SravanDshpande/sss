package com.cg.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
	public static void main(String[] args) throws Exception{
		
		String className="oracle.jdbc.driver.OracleDriver";
		String user="hr";
		String pass="hr";
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		
		Class.forName(className);
		
		Connection con=DriverManager.getConnection(url, user, pass);
		System.out.println("connection success");
		con.close();
	}
}