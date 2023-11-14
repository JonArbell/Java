package assignment;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class Eggs {

	/*Assignment 03 
	code by Jon Arbell De Ocampo
	Sept 30, 2023*/
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		
		while(true) {
			System.out.print("Enter number of eggs: ");
			int eggs = s.nextInt();
			
			numberOfEggs(eggs);

		}
		
	}
	
	static void numberOfEggs(int numOfEggs) {
		
		int dozen = 0;
		int remainder = 0;
		
		if(numOfEggs>11) {
			dozen += numOfEggs/12;
			remainder = remainder + (numOfEggs% 12);
			
			if(remainder>1) {
				System.out.println("\n"+numOfEggs+" eggs is "+dozen+" full dozen (with "+remainder+" eggs remaining)\n");
			}else if(remainder == 1) {
				System.out.println("\n"+numOfEggs+" eggs is "+dozen+" full dozen (with "+remainder+" egg remaining)\n");
			}else {
				System.out.println("\n"+numOfEggs+" eggs is "+dozen+" full dozen\n");
			}

			
		}else if(numOfEggs >1&&numOfEggs<12){
			System.out.println("\nNumber of eggs are "+numOfEggs+"\n");
		}else if(numOfEggs ==1){
			System.out.println("\nOnly 1 egg\n");
		}else {
			System.out.println("\nInvalid input\n");
		}
		
	}
	
}
