package challenge;

import java.util.Scanner;

public class SumOfAllIntegerInputs {
    public static void main(String[] args) {
        //Sum of All integer Inputs
        Scanner s = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter size: ");
        int size = s.nextInt();
        System.out.println();

        int numbers[] = new int[size];
        int a = 0;
        for(int i = 0; i < size;i++){
            a+=1;
            System.out.print("Integer "+a + " is ");
            numbers[i]= s.nextInt();
            sum = sum + numbers[i];
        }
        System.out.println("\nSum of all integer: "+ sum);

    }
}
