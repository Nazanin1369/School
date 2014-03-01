package org.MPP.School;

public class Course 
{
	
	private String number;
	private String title;
	private int units;
	private Faculty teacher;
	
	//Constructors
	
	Course(String number, String title, int units, Faculty f)
	{
		this.number = number;
		this.title = title;
		this.units = units;
		this.teacher=f;
		f.addCourse(this);
	}
	
	//getters and setters
	
	public Faculty getTeacher() {
		return teacher;
	}

	public void setTeacher(Faculty teacher) {
		this.teacher = teacher;
	}

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	

}
