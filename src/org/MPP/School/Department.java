package org.MPP.School;

import java.util.ArrayList;

public class Department
{
	private String name;
	ArrayList<Person> persons=new ArrayList<Person>();
	ArrayList<String> profName = new ArrayList<String>();


	public Department(String name)
	{
		this.name=name;
	}

	public void addPerson(Person p)
	{
		persons.add(p);
	}
	//--------------------------------------------------------------------
	/*
	 * This method computes the sum of all the salaries (per month) paid to faculty and staff.
	 */
	public double getTotalSalary()
	{
		double staffTotal=0;
		double facultyTotal=0;
		double total=0;
		for(Person p : persons)
		{
			if(p instanceof Staff)
			{
				staffTotal += ((Staff) p).getSalary();
			}

			if(p instanceof Faculty)
			{
				facultyTotal += ((Faculty) p).getSalary();
			}
		}
		total=staffTotal+facultyTotal;
		return total;

	}

	//---------------------------------------------------------------------
	/*
	 * This method shows the name, phone number, 
	 * age and type (student, faculty or staff) of all members in the department.
	 */
	public void showAllMembers()
	{
		for(Person p : persons)
		{

			System.out.println("Member Type: "+p.getClass().getName()+", Name: "+p.getName()+", PhoneNumber: "+p.getPhone()
					+", Age: "+p.getAge());

		}

	}

	//---------------------------------------------------------------------------
	/*
	 * This method shows a list of all faculty names and the total number of units they teach.
	 */
	public void unitsPerFaculty()
	{


		for(Person p : persons)
		{

			if(p instanceof Faculty)
			{
				Faculty fa = (Faculty) p;
				System.out.println("Name: "+p.getName());
				System.out.println("Total Units: "+fa.getCourseUnit());
			}
		}


	}
	//----------------------------------------------------------------------
	/*
	 * This method prints all the professor names 
	 * and put it in profName ArrayList.
	 */
	public void showProfName()
	{


		for(Person p : persons)
		{
			if (p instanceof Faculty)
			{
				profName.add(p.getName());
				System.out.println(p.getName());
			}
		}
	}
	//-------------------------------------------------------------------------
	/*
	 * This method asks for the name of a faculty member, 
	 * and prints out the names of all students who take classes that are taught by this faculty member.
	 */
	public void showAllStudentsByTeacher(String name)
	{
		ArrayList<String> studentName=new ArrayList<String>();
		for(Person p : persons)
		{
			if(p instanceof Student)
			{
				Student student = (Student) p;
				studentName.add(student.getStudentByTeacherName(name));
			}

		}
		System.out.println("Students having course with Prof."+name+" are: ");
		for(String s : studentName)
		{
			System.out.println(s);
		}
	}
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
