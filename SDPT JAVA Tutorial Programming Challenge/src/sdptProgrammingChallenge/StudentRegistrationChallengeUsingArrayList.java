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



//Main Class
/*package main;
import java.util.ArrayList;
import Challenge.Student;
import java.util.Scanner;


public class Main {
    
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Student> stu = new ArrayList<Student>();
		while(true) {
			System.out.print("Do you want to continue with the registration process? y/n: ");
			String y = s.nextLine();
			
			if(y.equalsIgnoreCase("Y")) {
				
				while(true) {
					System.out.print("Enter first name: ");
					String fname = s.nextLine();
					
					System.out.print("Enter middle name: ");
					String mname = s.nextLine();
					
					System.out.print("Enter last name: ");
					String lname = s.nextLine();
					
					System.out.print("Enter course: ");
					String course = s.nextLine();
					
					System.out.print("Enter section: ");
					String section = s.nextLine();
					
					System.out.print("Enter year: ");
					String year = s.nextLine();
					
					stu.add(new Student(fname,mname,lname,course,section,year));
					
					System.out.println();
					System.out.print("Add another? y/n: ");
					String input = s.nextLine();
					
					if(input.equalsIgnoreCase("y")) {
						System.out.println();
						continue;
						
					}else {
						System.out.println();
						break;
					}
					
				}
					
				System.out.println();
				for(Student st: stu) {
					st.introSelf();
					st.displayInfo();
					System.out.println();
				}
			}else if(y.equalsIgnoreCase("N")) {
				System.out.println("Okay, :)");
				System.out.println();
			}else {
				System.out.println("Invalid Input! Try Again");
				System.out.println();
			}
			
			
			
		}
			
		}
		
		
		
		
	}*/
