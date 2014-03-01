package org.MPP.School;

public class Staff extends Person implements IStaff
{
	private double salary;

	//Constructor
	public Staff(String name, String phone, int age, double salary)
	{
		super(name, phone, age);
		this.salary=salary;
	}
	
	//getters and setters
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
