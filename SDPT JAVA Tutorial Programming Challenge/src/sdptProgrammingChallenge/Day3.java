package sdptProgrammingChallenge;
import java.util.Arrays;
import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a number of numbers: ");
		int size = s.nextInt();
		s.nextLine();
		
		int aray[] = new int[size];
		
		for(int i = 0; i < size; i++) {
			aray[i] = s.nextInt();
		}		
		
		System.out.print("Minimum number is ");
		getMin(aray);
		
		System.out.print("Maximum number is ");
		getMax(size, aray);
		
		}
	
	static void getMin(int arays[]) {
		
		Arrays.sort(arays);
		
		System.out.println(arays[0]);
		
	}
	static void getMax(int size, int arays[]) {
		
		Arrays.sort(arays);
		
		System.out.println(arays[size-1]);
		
	}

}
