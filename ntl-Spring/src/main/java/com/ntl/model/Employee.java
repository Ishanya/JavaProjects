package com.ntl.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int empId;
	private String empName;
	private double salary;
	private Project proj,pro;
	
	
	
	/**
	 * 
	 */
	public Employee() {
		super();
	}
	
	
	
	
	/**
	 * @param empId
	 * @param empName
	 * @param salary
	 * @param proj
	 */
	@Autowired
	public Employee(int empId, String empName, double salary, Project pro1,Project p1) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.proj = pro1;
		this.pro=p1;
	}




	/**
	 * @return the pro
	 */
	public Project getPro() {
		return pro;
	}




	/**
	 * @param pro the pro to set
	 */
	
	public void setPro(Project pro) {
		this.pro = pro;
	}




	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	/**
	 * @return the proj
	 */
	public Project getProj() {
		return proj;
	}
	/**
	 * @param proj the proj to set
	 */
	public void setProj(Project proj) {
		this.proj = proj;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
	public void display()
	{
		System.out.println(proj);
		System.out.println(pro);
	}
	
	public void iniit()
	{
		System.out.println("through init");
	}
	
	public void destroy()
	{
		System.out.println("destroying");
	}
	
	   public void printThrowException(){
		      System.out.println("Exception raised");
		      throw new IllegalArgumentException();
		   }
	
	
	
}
