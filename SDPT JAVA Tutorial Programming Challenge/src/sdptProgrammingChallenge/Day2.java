package sdptProgrammingChallenge;
import java.util.ArrayList;
import java.util.Scanner;


public class Day2 {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<ExtendedLinearArraySearch> nameList = new ArrayList<ExtendedLinearArraySearch>();
		
		//Size of elements
		System.out.print("Enter number of elements: ");
		int numElements = s.nextInt();
		s.nextLine();
		
		
		//Input
		String iName;
		System.out.println("\nAdd names ");
		for(int i = 0; i < numElements; i++) {
			System.out.print("\nname: ");
			iName = s.nextLine();
			nameList.add(i, new ExtendedLinearArraySearch(iName));
			System.out.println();
		}
		
		//Searching
		System.out.print("Search name: ");
		String search = s.nextLine();
		boolean exist = false;
		for(int i = 0; i < nameList.size();i++) {
			ExtendedLinearArraySearch name = nameList.get(i);
			if(name.getName().equals(search)) {
				System.out.println(search + " is exist in index "+ i);
				exist = true;
			}
			if(!exist) {
				System.out.println(search + " is doesn't exist in array ");
			}
		
		}
		
		}
		
	}
