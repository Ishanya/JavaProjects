
public class employeeDemo {
	public static void main(String z[])
	{
		Employee e=new Employee();
		e.empid=1234;
		e.empname="Ishanya";
		e.empsal=70000;
		e.display();
		e.calGross();
		
		Employee e1=new Employee();
		e1.display();
		
		exampleCla q=new exampleCla();
		q.setter("new");
		q.getter();
	}
}
