package com.Exercise39.model;

public class Employee {
	private String nameEmployee;
	private double salaryEmployee;
	
	public Employee()
	{
	}
	
	public Employee(String nameEmployee, double salaryEmployee)
	{
		this.salaryEmployee=salaryEmployee;
		this.nameEmployee=nameEmployee;
		
	}
	
	public double getSalary()
	{
		return this.salaryEmployee;
	}
	
	public void setSalary(double salaryEmployee)
	{
		this.salaryEmployee=salaryEmployee;
	}
	
	public String getNameEmployee()
	{
		return this.nameEmployee;
	}
	
	public void setNameEmployee(String nameEmployee)
	{
		this.nameEmployee=nameEmployee;
	}
	

}
