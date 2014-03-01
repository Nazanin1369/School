package org.MPP.School;

import java.util.ArrayList;
import java.util.Iterator;

public class Faculty extends Person
{
	private double salary;
	ArrayList<Course> facultyCourses = new ArrayList<Course>();

	//Constructor
	public Faculty(String name, String phone, int age, double salary)
	{
		super(name, phone, age);
		this.salary=salary;
	}

	//Methods

	public void addCourse(Course c)
	{
		facultyCourses.add(c);
	}

	public int getCourseUnit()
	{
		int total=0;
		Iterator<Course> it = facultyCourses.iterator();
		while(it.hasNext())
		{
			Course c = it.next();
			total += c.getUnits();

		}
		return total;
	}
	
	
	//getters and setters
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public ArrayList<Course> getFacultyCourses() {
		return facultyCourses;
	}

	public void setFacultyCourses(ArrayList<Course> facultyCourses) {
		this.facultyCourses = facultyCourses;
	}





}
