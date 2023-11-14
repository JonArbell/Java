package challenge;

import java.util.Scanner;

public class ScoreToGrade {
    public static void main(String[] args) {
        //Score to Grade F - A
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = s.nextInt();
        s.nextLine();

        if(score > 89) {
            System.out.println("Grade: A");
        }else if(score > 79) {
            System.out.println("Grade: B");
        }else if(score > 69) {
            System.out.println("Grade: C");
        }else if(score > 59) {
            System.out.println("Grade: D");
        }else {
            System.out.println("Grade: F");
        }
    }
}
