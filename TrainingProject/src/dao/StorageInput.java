package dao;

import java.io.*;
import java.sql.*;


import model.SignedupUser;

public class StorageInput {

	//static String str;
	static boolean val=true;
	//static FileWriter fw=null;
	 static FileOutputStream fileout=null;
	 static ObjectOutputStream outt=null;
	 
	public static void store(SignedupUser ip) throws IOException {
		// TODO Auto-generated method stub
		
		if(val) {
	//	 fw=new FileWriter("data.txt");
		 fileout=new FileOutputStream("dta_object.ser",true);
		 outt=new ObjectOutputStream(fileout);
		}
	
		outt.writeObject(ip);
		val=false;
	//	fw.write(id+" "+name+" "+pass+" "+cnfpass);
		
		//outt.close();
	}

	/*public static void gettingId(SignedupUser sign,String id) {
		// TODO Auto-generated method stub
		str=sign.getId();
	}*/
	
	
	// DBMS......................CURD Operations...!
	
	static Connection con;
	
 static Statement stmt;
 static  ResultSet rs;
 static PreparedStatement ps;
 
	
	
	public static boolean saveCustomer(SignedupUser ip) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/techleap", "root","root");
			
			 ps=con.prepareStatement("insert into Customer values(?,?,?)");
			 
			 ps.setString(1, ip.getId());
			 ps.setString(2, ip.getName());
			 ps.setString(3,ip.getPassword());
			 
			 
			 int s=ps.executeUpdate();
			 if(s>0)
			 {
				 return true;
			 }
			
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return false;
	}

	
}
