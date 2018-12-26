package client;

import java.sql.*;

public class Main {
	
	static Connection con;
	static Statement stmt;
	static ResultSet rs;
	static PreparedStatement ps;
	
	public static void main(String[] args) {
		//establish connection with database
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/techleap", "root","root");
			//System.out.println(con);
			stmt=con.createStatement();
			
			//int s=stmt.executeUpdate("insert into employee values(123459,'Govind',68000)");
			/*int s=stmt.executeUpdate("update employee set empName='Bhanu',empSalary=67000 where empId=123459");
			if(s!=0)
			{
				System.out.println(s+" row success");
			}*/
			// ps=con.prepareStatement("create table hello(name varchar(20))");
		ps=con.prepareStatement("insert into employee values(?,?,?)");
		 ps.setInt(1, 123461);
		 ps.setString(2, "Bhuvan");
		 ps.setInt(3,64000);
		 
		 ps.executeUpdate();
		 
		 rs=stmt.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println("ID: "+rs.getInt("empId")+" Name: "+rs.getString("empName")+" Salary: "+rs.getInt("empSalary"));
			}
		 
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("Class missing");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//statements for sql
		
		//consume result
		
	}

}
