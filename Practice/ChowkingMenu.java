package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ChowkingMenu {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true){
            System.out.println("MENU\n\n1 - Porkchop Lauriat | PHP 178\n2 - Sweet & Sour | PHP 165\n3 - Shanghai | PHP 150\n");
            System.out.println("Enter '0' for cancel");

            double total = 0;
            boolean cancel = false;

            try {
                boolean picking = true;

                System.out.println("Enter '5' if you're done\n");

                while (picking){

                    System.out.print("Enter: ");
                    byte pick = s.nextByte();

                    switch (pick){
                        case 1:
                            total += 178;
                            break;
                        case 2:
                            total += 165;
                            break;
                        case 3:
                            total += 150;
                            break;
                        case 0:
                            total = 0;
                            picking = false;
                            cancel = true;
                            break;
                        case 5:
                            if(total >0){
                                picking = false;
                                break;
                            }else {
                                System.out.println("Wala ka pang ina add to cart!!\n");
                                break;
                            }
                        default:
                            System.out.println("Invalid Input\n");
                    }

                }
            }catch (InputMismatchException e){
                System.out.println("Input should not contains any characters.\n");
                cancel = true;
                s.nextLine();
            }

            if(!cancel){
                System.out.println("Total: "+total);

                while (true){
                    System.out.println("Enter '0' to cancel.\n");
                    System.out.print("How much is your money?: ");
                    double balance = s.nextDouble();
                    s.nextLine();

                    if(balance>0){

                        if(balance<total){
                            System.out.println("Insufficient balance.\n");
                        } else {
                            balance = balance - total;
                            System.out.println("Change: "+balance);
                            break;
                        }
                    }else if (balance ==0) {
                        break;
                    }
                }
            }
        }
    }
        }