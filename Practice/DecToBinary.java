package practice;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class DecToBinary {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        while (true){
            try{
                System.out.println("Decimal to Binary\n");


                System.out.print("Enter a number: ");

                int x = s.nextInt();
                s.nextLine();


                ArrayList<Integer> binary = new ArrayList<>();

                for (int i = 0; i < x*32;i++){

                    binary.add(i,x%2);
                    x= x /2;

                    if(x < 1){
                        break;
                    }
                }


                for(int i = 0; i < binary.size(); i++){

                    System.out.print(binary.get(i)+" ");

                }

                System.out.println("\n");

            }catch (InputMismatchException e){
                System.out.println("Invalid input\n");
                s.nextLine();
            }
        }

    }

}
