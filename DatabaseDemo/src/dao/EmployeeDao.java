package dao;

import java.util.ArrayList;

import com.mysql.jdbc.Connection;

import model.Employee;

public interface EmployeeDao {
	
	public boolean saveEmployee(Employee e);
	public Employee getEmployee(int id);
	public ArrayList<Employee> display();
	//public Connection createConnection();

}
