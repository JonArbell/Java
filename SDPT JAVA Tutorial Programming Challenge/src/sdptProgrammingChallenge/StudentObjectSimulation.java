package sdptProgrammingChallenge;

public class Student {

	private String fName, midName,  lName,course, section, year;
	private float midterm, fin;
	
	
	public Student(String fName, String lName, String course, String section, String year){
		this.fName = fName;
		this.lName = lName;
		this.course = course;
		this.section = section;
		this.year = year;
		
		System.out.println("\n"+fName + " " + lName + " is registered.\n");
		
	}
	
	public Student(String fName, String midName,String lName,String course, String section, String year){
		this.fName = fName;
		this.midName = midName;
		this.lName = lName;
		this.course = course;
		this.section = section;
		this.year = year;
		
		if(midName == null || midName.isEmpty()) {
			System.out.println("\n"+fName + " " + lName + " is registered.\n");
		}else {
			System.out.println("\n"+fName + " " + midName+" "+lName + " is registered.\n");
		}
		
				
	}
	
	
	public Student(String fName,String midName, String lName, String course, String section, String year, float mid, float fin){
		this.fName = fName;
		this.midName = midName;
		this.lName = lName;
		this.course = course;
		this.section = section;
		this.year = year;
		this.midterm = mid;
		this.fin = fin;
		
		if(midName == null || midName.isEmpty()) {
			System.out.println("\n"+fName + " " + lName + " is registered.\n");		
		}else {
			System.out.println("\n"+fName + " " + midName+" "+lName + " is Registered.\n");
		}
			
	}
	
	public void introSelf() {
		if(midName == null || midName.isEmpty()) {
			System.out.println("Hi, I'm " + fName+" "+lName + ". Pursuing " + course + ", and I'm coming " + year +" this school year." + " My section is " + section + ".");
		}else {
			System.out.println("Hi, I'm " + fName + " " + midName+" "+lName + ". Pursuing " + course + ", and I'm coming " + year +" this school year." + " My section is " + section + ".");
		}
		
		
	}
	
	public void grade() {
		float ave = (midterm + fin) / 2;
		
		if(ave >= 100 ) {
			System.out.println("Invalid Grade");
		}else if(ave > 96) {
			System.out.println("Average: " +ave + "\nWith Highest Honors");
		}else if(ave > 93) {
			System.out.println("Average: " +ave + "\nWith High Honors");
		}else if(ave > 89) {
			System.out.println("Average: " +ave + "\nWith Honors");
		}else if(ave > 74) {
			System.out.println("Average: " +ave + "\nPassed");
		}else {
			System.out.println("Average: " +ave + "\nFailed");
		}		
			
	}
	
	public void displayInfo() {
		
		if(midName == null || midName.isEmpty()) {
			System.out.println("Fullname: " + fName+" "+lName);
			System.out.println("Section: " + section);
			System.out.println("Course: " + course);
			System.out.println("Year: " + year);
			
		}else {
			System.out.println("Fullname: " + fName + " " + midName+" "+lName);
			System.out.println("Section: " + section);
			System.out.println("Course: " + course);
			System.out.println("Year: " + year);
		}
			
	}
	
	
}


//Main Method
/*package main;
import java.util.Scanner;
import Mathematics.*;
import Challenge.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String fName = s.nextLine();

		System.out.print("Enter middle name: ");
		String mname = s.nextLine();
		
		System.out.print("Enter your last name: ");
		String lName = s.nextLine();
		
		System.out.print("Enter your course: ");
		String course = s.nextLine();
		
		System.out.print("Enter your section: ");
		String section = s.nextLine();
		
		System.out.print("Enter year: ");
		String year = s.nextLine();
		
		System.out.print("Enter your midterm grade: ");
		float midterm = s.nextFloat();
		
		System.out.print("Enter your final grade: ");
		float fin = s.nextFloat();
		
		Student st = new Student(fName, mname, lName, course, section, year,midterm, fin);
		
		st.introSelf();
		st.grade();
		
		
	}

}*/
