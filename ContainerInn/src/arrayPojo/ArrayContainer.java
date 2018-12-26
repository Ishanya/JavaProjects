package arrayPojo;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import Pojo.Employee;
import sorting.SortById;
import sorting.SortBySalary;

public class ArrayContainer {

	static Employee emp[]=new Employee[3];
	
	public static void main(String z[])
	{
		
		ArrayContainer ax=new ArrayContainer();
		
		ArrayContainer.employeeInitiate();
		
		for(int i=0;i<emp.length;i++)
		{
			
		}
	}
	
	public static void employeeInitiate()
	{
		
		emp[0]=new Employee("Ishanya","Is123",70000,LocalDate.parse("2017-02-03"));
		emp[1]=new Employee("Varun","Va34",40000,LocalDate.parse("2018-05-06"));
		emp[2]=new Employee("Bhanu","Bh345",50000,LocalDate.parse("2016-09-02"));
		
	//	List<Employee> al=new ArrayList<Employee>();
		/*for(int i=0;i<emp.length;i++)
		al.add(emp[i]);*/
		
	//	al=Arrays.asList(emp);
		//Employee[] emp1=(Employee[])al.toArray();
		
		//Array.sort(emp);							interface Comparable
		//Arrays.sort(emp,new SortBySalary());   interface Comparator
		Arrays.sort(emp,new SortById());			// interface Comparator
		for(Employee loop:emp)
		{
			System.out.println(loop);
		}
		
	}
	
	public int age(int i)
	{
		int year1 = Year.now().getValue();
		int year = Calendar.getInstance().get(Calendar.YEAR);
		
		LocalDate d=emp[i].getDob();
		DateTimeFormatter formatt=DateTimeFormatter.ofPattern("dd/mm/yyyy");
		String datte=d.format(formatt);
		String a[]=datte.split("/");
		int age=year1-Integer.parseInt(a[2]);
		return age;
		
	}
}
