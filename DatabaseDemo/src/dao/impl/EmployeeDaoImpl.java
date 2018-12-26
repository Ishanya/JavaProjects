package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dao.EmployeeDao;
import model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	EmployeeDaoImpl edi=new EmployeeDaoImpl();
	static Connection con;
	static Statement stmt;
	static ResultSet rs;
	static PreparedStatement ps;
	ArrayList<Employee> al=new ArrayList<Employee>();
	EmployeeDaoImpl()
	{
		createConnection();
		System.out.println("connection successful!");
	}
	
	public void createConnection()
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/techleap", "root","root");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean saveEmployee(Employee e) {
		// TODO Auto-generated method stub
		try {
			 ps=con.prepareStatement("insert into employee values(?,?,?)");
			 ps.setInt(1, 123460);
			 ps.setString(2, "NRJ");
			 ps.setInt(3,66000);
			 
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

	@Override
	public Employee getEmployee(int id)  {
		// TODO Auto-generated method stub
		Employee e = null;
		
		//Employee e = new Employee();
		try {
		stmt=con.createStatement();
		rs=stmt.executeQuery("select * from employee where empId="+id);
		while(rs.next())
		{
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setSalary(rs.getInt(3));
			
		}
		}
		catch(SQLException sq)
		{
			sq.printStackTrace();
		}
		System.out.println(e.getId());
		return e;
	}

	@Override
	public ArrayList<Employee> display() {
		// TODO Auto-generated method stub
		Employee e=getEmployee(123456);
		for(Employee i:al)
		{
			
		}
		return null;
	}
	

}
