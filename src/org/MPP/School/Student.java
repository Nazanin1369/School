package org.MPP.School;

import java.util.ArrayList;

public class Student extends Person
{
	private double gpa;
	ArrayList<Course> studentCourses = new ArrayList<Course>();
	
	//Constructor
	public Student(String name, String phone, int age, double gpa)
	{
		super(name, phone, age);
		this.gpa=gpa;
	}
	
	//Methods
	//------------------------------------------------------------
	public void addcourse(Course c)
	{
		studentCourses.add(c);
	}
	//------------------------------------------------------------
	public String getStudentByTeacherName(String teacherName)
	{
		String name = "";
		for(Course course : studentCourses)
		{
			if(course.getTeacher().getName().equals(teacherName))
			
				name = this.getName();
		}	
		
		return name;
		
		
	}

	//getters and setters
	
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	

}
