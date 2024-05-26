import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var s = new Scanner(System.in);

        while (true){

            try{

                System.out.print("Enter year: ");
                var year = s.nextInt();

                var enter_Date = LocalDate.of(year,1,1);

                for(var month: Month.values()){ //Loop through each month

                    System.out.println("\n"+month+" "+year); //Display the month and year

                    System.out.println("SUN MON TUE WED THU FRI SAT"); //Display all week days

                    var checkMonth = enter_Date.getMonth().equals(month); //Check if the current month is the same as the entered month

                    while (checkMonth){

                        if(enter_Date.getDayOfMonth() == 1)
                            for(var col = 1; col <= enter_Date.getDayOfWeek().getValue()%7 ; col++) //Add spacing for the first day of the month
                                System.out.print("\t");

                        System.out.print(
                                String.valueOf(enter_Date.getDayOfMonth()).length() <2 ?
                                        " " + enter_Date.getDayOfMonth() + "  " : //Print days with a ternary operator
                                        enter_Date.getDayOfMonth() + "  "
                        );

                        if(enter_Date.getDayOfWeek().getValue() == 6) // Print a new line every Saturday
                            System.out.println();

                        if(!enter_Date.isLeapYear() &&
                                enter_Date.getDayOfMonth() == 28 && //Check if the year is not a leap year and the month is February with 28 days, then stop the loop
                                enter_Date.getMonth().equals(Month.FEBRUARY)
                        )   checkMonth = false;

                        else if(enter_Date.getDayOfMonth() == enter_Date.getMonth().maxLength()) checkMonth = false; //Check if the year is a leap year and the month has reached its maximum length, then stop the loop

                        enter_Date = enter_Date.plusDays(1); //Increment the days

                    }
                    System.out.println();
                }

            }catch (Exception e){
                System.out.println("Invalid Input"); //Print if the user input is of an invalid type
                //System.out.println("Error: "+e); //For debugging purposes only
                s.nextLine();

            }
        }
    }
}
