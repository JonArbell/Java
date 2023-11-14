package challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfInputIntegers {
    public static void main(String[] args) {
        //Sum and average of input array numbers
        Scanner s = new Scanner(System.in);

        ArrayList<Double> arr = new ArrayList<Double>();

        double ave = 0;
        double sum = 0;
        while (true){
            System.out.print("Enter numbers: ");
            double in = s.nextDouble();
            arr.add(in);
            s.nextLine();
            System.out.print("Are you done? enter y if yes: ");
            String y = s.nextLine();
            if(y.equalsIgnoreCase("y")){
                break;
            }

        }

        for(double panis: arr){

            sum = sum + panis;

        }
        System.out.println("Sum: "+ sum);
        ave += sum / arr.toArray().length;

        System.out.println("Ave: " + ave);
    }
}
