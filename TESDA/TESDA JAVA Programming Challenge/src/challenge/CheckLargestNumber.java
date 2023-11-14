package challenge;
import java.util.*;

public class CheckLargestNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int size = 3;
        int[] num = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Enter 3 number: ");
            num[i] = s.nextInt();
            s.nextLine();
        }

        if(num[0] > num[1]) {
            if(num[0] > num[2]) {
                System.out.println();
                System.out.println(num[0] + " is Greatest number");
            }
        }else if(num[1] > num[2]) {
            if(num[1] > num[0]) {
                System.out.println();
                System.out.println(num[1] + " is Greatest number");
            }
        }else if(num[2] > num[0]) {
            if(num[2] > num[1]) {
                System.out.println();
                System.out.println(num[2] + " is Greatest number");
            }
        }else if(num[0] == num[1]) {
            if(num[1] == num[2]) {
                System.out.println();
                System.out.println("All numbers are equal");
            }
        }



    }
}
/*
 * 0 = 5
 * 1 = 7
 * 2 = 10
 */
