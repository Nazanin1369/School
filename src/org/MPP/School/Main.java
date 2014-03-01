package org.MPP.School;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		//Make an ArrayList of all departments in the university
		ArrayList<Department> allDepartments= new ArrayList<Department>();
		//Make a computer science department and add it to the university departments
		Department csDepartment = new Department("Computer Science");
		allDepartments.add(csDepartment);

		// Create faculty objects
		Faculty frankMoore = new Faculty("Frank Moore","472-5921",43,10000);	
		Faculty samHoward = new Faculty("Sam Howard","472-7222",55,9500);
		Faculty johnDoodle = new Faculty("John Doodle","472-6190",39,8600);

		csDepartment.addPerson(johnDoodle);
		csDepartment.addPerson(samHoward);
		csDepartment.addPerson(frankMoore);


		// Create student objects
		Student johnDoe = new Student("John Doe","472-1121",22,4.0);
		Student maryJones = new Student("Mary Jones","472-7322",32,3.80);
		Student leeJohnson = new Student("Lee Johnson","472-6009",19,3.65);

		csDepartment.addPerson(leeJohnson);
		csDepartment.addPerson(maryJones);
		csDepartment.addPerson(johnDoe);

		// Create staff objects
		Staff frankGore = new Staff("Frank Gore","472-3321",33,4050);
		Staff adamDavis = new Staff("Adam Davis","472-7552",50,5500);
		Staff davidHeck = new Staff("David Heck","472-8890",29,3600);
		StudentStaff sstaf = new StudentStaff("Student Staff", "988-9876", 30, 4.0 ,40000);

		csDepartment.addPerson(frankGore);
		csDepartment.addPerson(adamDavis);
		csDepartment.addPerson(davidHeck);
		csDepartment.addPerson(sstaf);



		// Create course objects	
		Course cs201 = new Course("cs201","programming",4, johnDoodle);
		Course cs360 = new Course("cs360","database",3, samHoward);
		Course cs404 = new Course("cs404","compiler",4, johnDoodle);
		Course cs240 = new Course("cs240","datastructure",2, johnDoodle);
		Course cs301 = new Course("cs301","Software engg",3, samHoward);
		Course cs450 = new Course("cs450","Advanced architecture",5,frankMoore);

		//devote courses to students
		johnDoe.addcourse(cs201);
		johnDoe.addcourse(cs360);
		maryJones.addcourse(cs450);
		maryJones.addcourse(cs450);
		maryJones.addcourse(cs201);
		leeJohnson.addcourse(cs240);
		leeJohnson.addcourse(cs201);
		sstaf.addcourse(cs450);




		double totsalary = 0;

		while(true)
		{
			putText("Enter first letter of ");
			putText("getTotalSalary, showAllMembers, unitsPerFaculty, allStudentsByTeacherView or quit : ");
			int choice = getChar();
			switch(choice)
			{
			case 'g':
				totsalary=csDepartment.getTotalSalary();
				putText("Total sum of all salaries is:");
				putText(String.valueOf(totsalary)+"\n");              
				break;
			case 's':
				csDepartment.showAllMembers();
				break;
			case 'u':
				csDepartment.unitsPerFaculty();
				break;
			case 'q': return;
			case 'a' : 
				csDepartment.showProfName();
				Scanner sc=new Scanner(System.in);
				putText("Enter teacher first letter name: ");
				String input = sc.next();
				
				if(input.equals("J"))
				{
					csDepartment.showAllStudentsByTeacher(csDepartment.profName.get(0));
				}
			    if(input.equals("S"))
				{
					csDepartment.showAllStudentsByTeacher(csDepartment.profName.get(0));
				}
		        if(input.equals("F"))
				{
					csDepartment.showAllStudentsByTeacher(csDepartment.profName.get(2));
				}
				
				break;
				
			default:
				putText("Invalid entry\n");
			}  // end switch
		}  // end while
	}  // end main()
	// -------------------------------------------------------------
	public static void putText(String s) //writes string s to the screen
	{
		System.out.println(s);
	}
	// -------------------------------------------------------------
	public static String getString() throws IOException  //reads a string from the keyboard input
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	// -------------------------------------------------------------
	public static char getChar() throws IOException //reads a character from the keyboard input
	{
		String s = getString();
		return s.charAt(0);
	}

	//-------------------------------------------------------------
	public static int getInt() throws IOException // reads an integers from the keyboard input
	{
		String s = getString();
		return Integer.parseInt(s);
	}
	// -------------------------------------------------------------


}



