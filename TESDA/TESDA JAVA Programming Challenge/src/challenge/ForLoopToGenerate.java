package challenge;
import java.util.Scanner;
public class ForLoopToGenerate {
    //Integer input from the user and uses a for loop to generate

    public static void main(String[] args) {
        //Integer input from the user and uses a for loop to generate
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = s.nextInt();

        for(int i = 1; i < num;i++){

            for (int j = num; j > i;j--){
                System.out.print("*");
            }

            System.out.println();


        }

    }

}
