import java.util.InputMismatchException;
import java.util.Scanner;

public class Furniture {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*Assignment 05
		code by Jon Arbell De Ocampo
		Oct 12, 2023*/
        
        while (true){
            try{
                System.out.println("1. Pine\t\t2. Oak\t\t3. Mahogani\n\n");

                System.out.print("Enter: ");
                byte input = s.nextByte();

                switch (input){

                    case 1:
                        System.out.println("Pine\nPrice: $100\n");
                        break;

                    case 2:
                        System.out.println("Oak\nPrice:  $225\n");
                        break;

                    case 3:
                        System.out.println("Mahogani\nPrice: $310\n");
                        break;

                    default:
                        System.out.println("Price: 0\n");
                }
            }catch (InputMismatchException e){
                System.out.println("Don't use any other characters.\n");
                s.nextLine();
            }
        }

    }

}
