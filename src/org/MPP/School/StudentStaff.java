package org.MPP.School;

public class StudentStaff extends Student implements IStaff
{
	Staff staff;

	public StudentStaff(String name, String phone, int age, double gpa, double salary) 
	
	{
		super(name, phone, age, gpa);
		staff = new Staff(name, phone, age, salary);
	
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) 
	{
		this.staff = staff;
	}
	

	public double getSalary()
	{
		return staff.getSalary();
	}
	

}
