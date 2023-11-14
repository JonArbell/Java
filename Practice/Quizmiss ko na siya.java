package javaFundamentals;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//Challenge
		System.out.println("======= Welcome to my Quizmiss ko na siya! =======");
		System.out.println();
		
		System.out.print("Enter your name: ");
		String userName = s.nextLine();
		System.out.println();
		
		System.out.println("Okay! " +userName + ", Are you ready?");
		System.out.println("Enter Y = Yes | N = No");
		System.out.print("Enter: ");
		String yN = s.nextLine();
		
		boolean notGameOver = true;
		int lives = 2;
		int correctAns = 0;
		while(notGameOver) {
			if(yN.equalsIgnoreCase("y")) {
				String answer;
				System.out.println();
				System.out.println("Remember! You only have 2 lives. So read carefully before you answer :) Goodluck!");
				System.out.println("Answer in lowercase only! Uppercase could not be consider\n" + "\nPassing score is 2/3");
				while(notGameOver) {
					
					//Question #1
					if(lives > 0) {
						System.out.println();
						System.out.println("Lives: "+lives);
						System.out.println();
						System.out.println("Question 1");
						System.out.println("    Who is our National Hero?");
						System.out.println("        a) Dr. Kwak kwak"+"\n        b) Dr. Jose Rizal" + "\n        c) Dr. Jose Manalo");
						System.out.print("Enter your answer: ");
						answer = s.nextLine();
						
						switch(answer) {
							case "a":
								System.out.println("Wrong\n");
								lives--;
								System.out.println("=================================================================================================================\n");
								break;
							case "b":
								System.out.println("Correct");
								correctAns += 1;
								System.out.println("=================================================================================================================\n");
								break;
							case "c":
								System.out.println("Wrong\n");
								lives--;
								System.out.println("=================================================================================================================\n");

								break;
							default:
								System.out.println("Invalid Input");
								lives--;
								System.out.println("=================================================================================================================\n");
						}
					}
					
					//Question #2
					if(lives > 0) {
						System.out.println("Lives: "+lives);
						System.out.println();
						System.out.println("Question 2");
						System.out.println("    Who is the current President of the Republic of the Philippines? ");
						System.out.println("        a) Leni Robredo" + "\n        b) Sarah Duterte" + "\n        c) Ferdinand Marcos Jr.");
						System.out.print("Enter your answer: ");
						answer = s.nextLine();
						
						switch(answer) {
						case "a":
							System.out.println("Wrong");
							lives--;
							System.out.println("=================================================================================================================\n");
							break;
						case "b":
							System.out.println("Wrong");
							lives--;
							System.out.println("=================================================================================================================\n");
							break;
						case "c":
							System.out.println("Correct");
							correctAns += 1;
							System.out.println("=================================================================================================================\n");
							break;
						default:
							System.out.println("Invalid Input");
							lives--;
							System.out.println("=================================================================================================================\n");
					}
					}
				
					//Question #3
					if(lives > 0) {
						System.out.println("Lives: "+lives);
						System.out.println();
						System.out.println("Question 3");
						System.out.println("    Who is our Instructor in Java Tutorial? ");
						System.out.println("        a) SDPT Solution" + "\n        b) Kakashi Hatake" + "\n        c) Michael Tan");
						System.out.print("Enter your answer: ");
						answer = s.nextLine();
						
						switch(answer) {
						case "a":
							System.out.println("Correct");
							correctAns += 1;
							System.out.println("=================================================================================================================\n");
							break;
						case "b":
							System.out.println("Wrong");
							lives--;
							System.out.println("=================================================================================================================\n");
							break;
						case "c":
							System.out.println("Wrong");
							lives--;
							System.out.println("=================================================================================================================\n");
							break;
						default:
							System.out.println("Invalid Input");
							lives--;
							System.out.println("=================================================================================================================\n");

					}
					}
					
				

					if(lives == 2) {
						
						System.out.println("Score: " + correctAns + "/3");
						System.out.println("Your remaining lives is 2! \n WOW! PERFECT! :0");
						notGameOver = false;
						lives = lives - 2;
						}else if(lives == 1) {
							
						System.out.println("Score: " + correctAns + "/3");
						System.out.println("Your remaining lives is 1! \n GOOD JOB! :)");
						notGameOver = false;
						lives = lives - 1;
						}else {
							
						System.out.println("Score: " + correctAns + "/3");
						System.out.println("Awts! GAME OVER!");
						notGameOver = false;
						System.out.println("Better luck next time! :)");
						
						}
				}

	
			
			}else if(yN.equalsIgnoreCase("n")) {
				System.out.println();
				System.out.println("Awts! Pakibilisan mag isip please!");
				System.out.println("Ano, ready ka na ba?");
				System.out.println("Y = Yes | N = No");
				System.out.print("Enter: ");
				yN = s.nextLine();
			}else {
				System.out.println();
				System.out.println("Invalid Input! Try Again\n");
				System.out.println("Are you ready?");
				System.out.println("Y = Yes | N = No");
				System.out.print("Enter: ");
				yN = s.nextLine();
			}
	
		}
		
		
		}
		
	}
