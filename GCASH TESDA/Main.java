package gcash;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    static UserAuthentication account = new UserAuthentication();
    static CheckBalance checkBalance = new CheckBalance();
    static CashIn cashIn = new CashIn();
    static CashTransfer cashTransfer = new CashTransfer();
    static Transactions transactions = new Transactions();

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        while (true) {

            try {

                System.out.println("Welcome to Gcash!\n\n1. Create account\n2. Login account\n\n");

                System.out.print("Enter: ");
                int pick = s.nextInt();
                s.nextLine();

                switch (pick) {
                    case 1: {
                        System.out.println("\nAccount creation\n");
                        System.out.println("Enter '0' to cancel.\n");
                        int cancel;
                        //checking Name
                        String createName = null;
                        while (true) {

                            System.out.print("name: ");
                            String name = s.nextLine();
                            String regex = "[0-9]+";

                            if (name.isEmpty()) {
                                System.out.println("\nOops! It seems you left the name field blank. Please enter your name.\n");
                            }else if(name.equals("0")){
                                cancel = 0;
                                break;

                            } else {

                                if (name.matches(regex)) {
                                    System.out.println("\nNames should not contains 'numbers' except for roman numeral.\n");
                                } else {
                                    createName = name;
                                    cancel = 5;
                                    break;
                                }
                            }

                        }
                        //cancel
                        if (cancel == 0) {
                            break;
                        }


                        //checking age
                        int createAge = 0;
                        while (true) {

                            try{
                                System.out.print("age: ");
                                int age = s.nextInt();
                                s.nextLine();
                                if (age < 18&&age>0) {
                                    System.out.println("\nNeed parent consent.\n");
                                } else if (age == 0) {
                                    cancel = 0;
                                    break;
                                } else {
                                    createAge = age;
                                    break;
                                }
                            }catch (InputMismatchException e){
                                System.out.println("\nAge should not contain any characters.\n");
                                s.nextLine();
                                continue;
                            }
                        }

                        //cancel
                        if (cancel == 0) {
                            break;
                        }

                        //checking email
                        String createEmail = null;
                        while (true) {

                            System.out.print("email: ");
                            String email = s.nextLine();
                            String emailRegex = "^[A-Za-z0-9._%+-]+@(gmail\\.com|outlook\\.com|yahoo\\.com)$";

                            if (email.isEmpty()) {
                                System.out.println("\nOops! It seems you left the email field blank. Please enter your email.\n");
                            } else {

                                if (email.equals("0")) {
                                    cancel = 0;
                                    break;

                                } else if (!email.matches(emailRegex)) {
                                    System.out.println("\nPlease enter a valid email address.\n");
                                } else {
                                    createEmail = email;
                                    cancel = 5;
                                    break;
                                }
                            }
                        }

                        //cancel
                        if (cancel == 0) {
                            break;
                        }

                        //checking phone number
                        String createNumber = null;
                        while (true) {

                            System.out.print("mobile number: ");
                            String number = s.nextLine();
                            String regex = ".*[`a-zA-Z@!#$%^&*()_\\-+=/.,<>?'\"{}\\[\\]|\\\\~``].*";
                            if (number.isEmpty()) {
                                System.out.println("\nOops! It seems you left the mobile number field blank. Please enter your mobile number.\n");
                            } else if (number.matches(regex)){
                                System.out.println("\nMobile number should not have any characters.\n");
                            }else {

                                if (number.equals("0")) {
                                    cancel = 0;
                                    break;
                                } else if (number.length() != 11) {
                                    System.out.println("\nMobile number should 11 digits. Try Again.\n");

                                }else {
                                    createNumber = number;
                                    cancel = 5;
                                    break;
                                }

                            }
                        }

                        //cancel
                        if (cancel == 0) {
                            break;
                        }

                        //checking pin
                        int createPin = 0;
                        while (true) {

                            try {
                                System.out.print("pin: ");
                                int pin = s.nextInt();
                                s.nextLine();
                                String convertPin = Integer.toString(pin);
                                if (pin == 0) {
                                    cancel = 0;
                                    break;
                                } else if (convertPin.length() != 4) {
                                    System.out.println("\nPin should 4 digits. Try Again.\n");
                                } else {

                                    while (true) {
                                        System.out.print("confirm pin: ");
                                        int confirmPin = s.nextInt();
                                        s.nextLine();
                                        String convertConfirmPin = Integer.toString(confirmPin);
                                        if (convertConfirmPin.equals(convertPin)) {
                                            createPin = confirmPin;
                                            cancel = 5;
                                            break;
                                        }
                                        if (confirmPin == 0) {
                                            cancel = 0;
                                            break;
                                        } else {
                                            System.out.println("\nConfirm pin does not match to your pin. Try again.\n");
                                        }
                                    }
                                    break;
                                }
                            }catch (InputMismatchException e){
                                System.out.println("\nPin should not contain any characters.\n");
                                s.nextLine();
                                continue;
                            }

                        }

                        //cancel
                        if (cancel == 0) {
                            break;
                        }
                        account.database.add(new UserAuthentication(createName, createAge, createEmail, createNumber, createPin));
                        break;
                    }
                    case 2: {
                        System.out.println("\nLogin your account\n");
                        System.out.println("Enter '0' to cancel.\n");
                        int cancel;

                        //checking number
                        String logInNumber = null;
                        while (true) {

                            System.out.print("mobile number: ");
                            String number = s.nextLine();
                            String regex = ".*[`a-zA-Z@!#$%^&*()_\\-+=/.,<>?'\"{}\\[\\]|\\\\~``].*";
                            if (number.isEmpty()) {
                                System.out.println("\nOops! It seems you left the mobile number field blank. Please enter your mobile number.\n");
                            }else if (number.equals("0")){
                                cancel = 0;
                                break;

                            }else {

                                if (number.matches(regex)) {
                                    System.out.println("\nMobile number should not have any characters.\n");
                                } else if (number.length() != 11) {
                                    System.out.println("\nYour mobile number should 11 digits. Please try Again.\n");
                                } else {
                                    logInNumber = number;
                                    cancel = 5;
                                    break;
                                }

                            }
                        }

                        //cancel
                        if (cancel == 0) {
                            break;
                        }

                        //checking pin
                        int logInPin = 0;
                        while (true) {

                            try {
                                System.out.print("pin: ");
                                int pin = s.nextInt();
                                s.nextLine();
                                String convertPin = Integer.toString(pin);
                                if (pin == 0) {
                                    cancel = 0;
                                    break;
                                } else if (convertPin.length() != 4) {
                                    System.out.println("\nPin should 4 digits. Try Again.\n");
                                } else {
                                    logInPin = pin;
                                    cancel = 5;
                                    break;
                                }
                            }catch (InputMismatchException e){
                                System.out.println("\nInvalid input.\n");
                                s.nextLine();
                                continue;
                            }

                        }

                        //cancel
                        if (cancel == 0) {
                            break;
                        }

                        account.logInVerification(logInNumber, logInPin);


                        while (account.isLoggedIn) {

                            System.out.println("\nServices\n\na. Check balance\nb. Cash in\nc. Cash Transfer\nd. Transactions\ne. Change pin\nf. Logout\n");

                            System.out.print("Enter: ");
                            String service = s.nextLine();

                            switch (service) {

                                case "a": {

                                    System.out.println("Check Balance.\n");

                                    checkBalance.checkBalance(logInNumber, logInPin);
                                    break;
                                }
                                case "b": {
                                    System.out.println("Cash in.\n\nEnter '0' to cancel.\n");
                                    int cancelOfCashin;

                                    double balance = 0;
                                    while (true) {

                                        try {
                                            System.out.print("enter amount: ");
                                            double amount = s.nextDouble();
                                            s.nextLine();
                                            if (amount == 0) {
                                                break;
                                            } else {
                                                balance = amount;
                                                break;
                                            }
                                        }catch (InputMismatchException e){
                                            System.out.println("\nInvalid input.\n");
                                            s.nextLine();
                                            continue;
                                        }

                                    }
                                    cashIn.cashIn(logInNumber, balance);
                                    break;
                                }
                                case "c": {
                                    System.out.println("Cash transfer\n\nEnter '0' to cancel.\n");
                                    int cancelOfCashTransfer;

                                    double amountCashTransfer = 0;
                                    while (true){
                                        try {
                                            System.out.print("enter amount: ");
                                            double amount = s.nextDouble();
                                            s.nextLine();

                                            if (amount == 0) {
                                                cancelOfCashTransfer = 0;
                                                break;
                                            } else {
                                                cancelOfCashTransfer = 5;
                                                amountCashTransfer = amount;
                                                break;
                                            }
                                        }catch (InputMismatchException e){
                                            System.out.println("\nInvalid input.\n");
                                            s.nextLine();
                                            continue;
                                        }
                                    }
                                    //cancelTransfer
                                    if (cancelOfCashTransfer == 0){
                                        break;
                                    }



                                    //checking receiver
                                    String receiver = null;
                                    while (true) {
                                        System.out.print("Send to: ");
                                        String sendTo = s.nextLine();
                                        String regex = ".*[`a-zA-Z@!#$%^&*()_\\-+=/.,<>?'\"{}\\[\\]|\\\\~``].*";

                                        if (sendTo.isEmpty()) {
                                            System.out.println("\nOops! It seems you left the 'send to' field blank. Please enter a valid mobile number.\n");
                                        } else if (sendTo.equals("0")){
                                            cancelOfCashTransfer = 0;
                                            break;
                                        }else {

                                            if (sendTo.matches(regex)) {
                                                System.out.println("\nMobile number should not have any characters.\n");

                                            } else if (sendTo.length() != 11) {
                                                System.out.println("\nMobile number of receiver should 11 digits. Please try Again.\n");
                                            } else {
                                                receiver = sendTo;
                                                cancelOfCashTransfer = 5;
                                                break;
                                            }
                                        }
                                    }
                                    //cancelTransfer
                                    if (cancelOfCashTransfer == 0) {
                                        break;
                                    }


                                    //checking pin
                                    int pinForCashTransfer = 0;
                                    while (true) {

                                        try {
                                            System.out.print("pin: ");
                                            int pin = s.nextInt();
                                            s.nextLine();
                                            String convertPin = Integer.toString(pin);
                                            if (pin == 0) {
                                                cancelOfCashTransfer = 0;
                                                break;

                                            } else if (convertPin.length() != 4) {
                                                System.out.println("\nYour pin should 4 digits. Please try Again.\n");
                                            } else {
                                                pinForCashTransfer = pin;
                                                cancelOfCashTransfer = 5;
                                                break;
                                            }
                                        }catch (InputMismatchException e){
                                            System.out.println("\nInvalid input.\n");
                                            s.nextLine();
                                            continue;
                                        }



                                    }

                                    if (cancelOfCashTransfer == 0) {
                                        break;
                                    }
                                    cashTransfer.cashTransfer(logInNumber, pinForCashTransfer, receiver, amountCashTransfer);
                                    break;
                                }
                                case "d": {
                                    System.out.println("Transactions\n");

                                    transactions.getCashInTransaction(logInNumber);
                                    transactions.getCashTransferReceivedTransaction(logInNumber);
                                    transactions.getCashTransferSendTransaction(logInNumber);

                                    break;
                                }
                                case "e": {
                                    System.out.println("Change pin\n\nEnter '0' to cancel.\n");
                                    int cancelOfChangePin;

                                    //checking number
                                    String numberForChangePin = null;
                                    while (true) {

                                        System.out.print("Enter your number again: ");
                                        String number = s.nextLine();
                                        String regex = ".*[`a-zA-Z@!#$%^&*()_\\-+=/.,<>?'\"{}\\[\\]|\\\\~``].*";

                                        if (number.isEmpty()) {
                                            System.out.println("\nOops! It seems you left the mobile number field blank. Please enter your mobile number.\n");
                                        }else if (number.equals("0")){
                                            cancelOfChangePin = 0;
                                            break;

                                        } else {

                                            if (number.matches(regex)) {
                                                System.out.println("\nMobile number should not have any characters.\n");
                                            } else if (number.length() != 11) {
                                                System.out.println("\nYour mobile number should 11 digits. Please try Again.\n");
                                            } else {
                                                numberForChangePin = number;
                                                cancelOfChangePin = 5;
                                                break;
                                            }

                                        }
                                    }

                                    //cancel
                                    if (cancelOfChangePin == 0) {
                                        break;
                                    }

                                    //checking pin
                                    int pinForChangePin = 0;
                                    while (true) {

                                        try {
                                            System.out.print("pin: ");
                                            int pin = s.nextInt();
                                            s.nextLine();
                                            String convertPin = Integer.toString(pin);
                                            if (pin == 0) {
                                                cancelOfChangePin = 0;
                                                break;

                                            } else if (convertPin.length() != 4) {
                                                System.out.println("\nPin should 4 digits. Try Again.\n");
                                            } else {
                                                pinForChangePin = pin;
                                                cancelOfChangePin = 5;
                                                break;
                                            }
                                        }catch (InputMismatchException e){
                                            System.out.println("\nInvalid input.\n");
                                            s.nextLine();
                                            continue;
                                        }

                                    }

                                    //cancel
                                    if (cancelOfChangePin == 0) {
                                        break;
                                    }


                                    //enter desiredPin
                                    int desiredPin = 0;
                                    while (true) {

                                        try {
                                            System.out.print("desired pin: ");
                                            int pin = s.nextInt();
                                            s.nextLine();
                                            String convertPin = Integer.toString(pin);
                                            if (convertPin.length() != 4) {
                                                cancelOfChangePin = 0;
                                                break;

                                            } else if (convertPin.length() != 4) {
                                                System.out.println("\nDesired pin should 4 digits. Please try Again.\n");
                                            } else {

                                                while (true) {
                                                    System.out.print("confirm pin: ");
                                                    int confirmPin = s.nextInt();
                                                    s.nextLine();
                                                    String convertConfirmPin = Integer.toString(confirmPin);
                                                    if (convertConfirmPin.equals(convertPin)) {
                                                        desiredPin = confirmPin;
                                                        cancelOfChangePin = 5;
                                                        break;
                                                    }else if (confirmPin == 0) {
                                                        cancelOfChangePin = 0;
                                                        break;
                                                    } else {
                                                        System.out.println("\nConfirm desired pin does not match to your pin. Try again.\n");
                                                    }
                                                }
                                                break;
                                            }
                                        }catch (InputMismatchException e){
                                            System.out.println("\nInvalid input.\n");
                                            s.nextLine();
                                            continue;
                                        }
                                    }
                                    //cancel
                                    if (cancelOfChangePin == 0) {
                                        break;
                                    }

                                    account.changePin(numberForChangePin, pinForChangePin, desiredPin);
                                    break;
                                }
                                case "f": {
                                    account.isLoggedOut(service, logInNumber);
                                    break;
                                }
                                default:
                                    System.out.println("Invalid input");
                            }
                        }
                        break;
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input\n");
                s.nextLine();
                continue;
            }

        }
    }

}



