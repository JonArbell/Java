package challenge;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        //Odd or even? positive or negative? or zero?
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = s.nextInt();

        if(num%2 == 0){
            System.out.println("Number " +num +" is Even");
        }else{
            System.out.println("Number " +num + " is Odd");
        }

        if(num > 0) {
            System.out.println("Number "+ num +" is Positive");
        }else if(num < 0){
            System.out.println("Number "+ num +" is Negative");
        }else{
            System.out.println("Number "+ num +" is Zero");
        }

    }

}
