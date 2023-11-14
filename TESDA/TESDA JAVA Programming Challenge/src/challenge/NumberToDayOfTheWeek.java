package challenge;

import java.util.Scanner;

public class NumberToDayOfTheWeek {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number 1-7 only: ");
        int day = s.nextInt();
        s.nextLine();

        switch(day) {
            case 1:
                System.out.println(day + " is Monday");
                break;
            case 2:
                System.out.println(day + " is Tuesday");
                break;
            case 3:
                System.out.println(day + " is Wednesday");
                break;
            case 4:
                System.out.println(day + " is Thursday");
                break;
            case 5:
                System.out.println(day + " is Friday");
                break;
            case 6:
                System.out.println(day + " is Saturday");
                break;
            case 7:
                System.out.println(day + " is Sunday");
                break;
            default:
                System.out.println(day + " is invalid input");
        }
    }
}
