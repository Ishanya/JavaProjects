public class Employee {
	int empid;
	String empname;
	double empsal;
	
	Employee()
	{
		empsal=1223;
	}
	
	void display()
	{
		System.out.println(empid+" "+empname+" "+empsal);
	}
	
	double calGross()
	{
		double grosSalary=2*empsal;
		System.out.println(grosSalary);
		return grosSalary;
	}
}
