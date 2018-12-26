package com.dao;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

import com.bean.Employee;
 
public class databaseFunction {
	
	static Connection con;
	static PreparedStatement ps;
	
	static public boolean connect(Employee e) throws SQLException, ClassNotFoundException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/techleap", "root","root");
			ps=con.prepareStatement("insert into TBL_Employee values(?,?,?,?)");
			ps.setString(1, e.getId());
			ps.setString(2, e.getName());
			ps.setInt(3, e.getAge());
			ps.setInt(4, e.getSalary());
			
			}catch(SQLException sq)
			{
				sq.printStackTrace();
				}
			int add=ps.executeUpdate();
			if(add>0)
			return true;
			else {
				return false;
			}
		
	}
	

}
