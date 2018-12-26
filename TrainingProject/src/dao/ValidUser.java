package dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


import model.SignedupUser;
import java.sql.*;
public class ValidUser {
	static FileInputStream fin=null;
	
	public static boolean valid(String lid, String lpass)  throws IOException, ClassNotFoundException
	{
	//	System.out.println(lname+" "+lpass);
		int flag=0;
		SignedupUser de=null;
		try {
			
		
		 fin=new FileInputStream("dta_object.ser");
		ObjectInputStream oin=new ObjectInputStream(fin);
		int i=0;
		while(i<20) {
			de=(SignedupUser)oin.readObject();
			System.out.println(de.getId());
		//	System.out.println(s);
			//oin.close();
			
			if(de.getId().equals(lid) && de.getPassword().equals(lpass)){
				oin.close();
			 flag = 1;
				return true;
		}
			i++;
		}
		if(flag==0)
		{
			oin.close();
			return false;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			if(fin!=null)
			fin.close();
		}
		
		return false;
	}
//...................DBMS.......CURD......................................	
	
	static Connection con;
	
	static Statement stmt;
		 static ResultSet rs;
	static PreparedStatement ps;
	
	public static boolean getCustomer(String lid, String lpass) throws ClassNotFoundException  {
		// TODO Auto-generated method stub
				
		//Employee e = new Employee();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/techleap", "root","root");
			
		stmt=con.createStatement();
		rs=stmt.executeQuery("select * from customer");
		
			if(rs.first())
			{
				String id=rs.getString(1);
				String pass=rs.getString(3);
				if(lid.equals(id) && lpass.equals(pass))
				{
					return true;
				}
			}
		}
		catch(SQLException sq)
		{
			sq.printStackTrace();
		}
	//	System.out.println(e.getId());
		return false;
	}
}
