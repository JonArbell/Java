package gcash;

import java.util.ArrayList;

public class UserAuthentication {


    static ArrayList<UserAuthentication> database = new ArrayList<>();
    static ArrayList <Long> idSize = new ArrayList<>();
    Main main = new Main();
    private String name;
    private int age;
    private String email;
    private String number;
    private int pin;
    private double balance;
    private long id;

    public UserAuthentication(String name, int age,String email,String number,int pin) {

        boolean namePass = false;
        boolean agePass = false;
        boolean emailPass = false;
        boolean numberPass = false;
        boolean pinPass = false;

        if(!name.equals(null)){
            namePass = true;
        }else {
            namePass = false;
            return;
        }

        if(age != 0){
            agePass = true;
        }else {
            agePass = false;
            return;
        }

        if(!email.equals(null)){
            emailPass = true;

            for(int i = 0; i < main.account.database.size();i++){

                if(email.equals(main.account.database.get(i).getEmail())){
                    System.out.println("\nThis email is already registered.\n");
                    emailPass = false;
                    return;
                }

            }

        }else {
            emailPass = false;
            return;
        }

        if(!number.equals(null)){
            numberPass = true;

            for(int i = 0; i < main.account.database.size();i++) {

                if(number.equals(main.account.database.get(i).getNumber())) { //checking if the number is already registered
                    System.out.println("\nThis number is already registered.\n");
                    numberPass = false;
                    return;
                }
            }

        }else {
            numberPass = false;
            return;
        }



        if(pin != 0){
            pinPass = true;
        }else {
            pinPass = false;
            return;
        }

        if(numberPass&&namePass&&emailPass&&pinPass&&agePass){

            this.name = name;
            this.age = age;
            this.number = number;
            this.pin = pin;
            this.email = email;
            this.balance = 0.0;
            this.id = idSize.size();
            idSize.add(1L);

            System.out.println("ID: "+id+"\n"+name+" is registered successfully\n");

        }else {
            return;
        }

    }


    boolean isLoggedIn = false;
    void logInVerification(String number, int pin){
        boolean numPass = false;
        boolean numPin = false;

            for(int i = 0; i < main.account.database.size();i++){

                if(number.equals(main.account.database.get(i).getNumber())){
                    numPass = true;

                    if(pin == main.account.database.get(i).getPin()){
                        numPin = true;
                    }

                    if(numPass&&numPin){
                        System.out.println("ID: "+database.get(i).getId()+"\n"+database.get(i).getName()+" is logged in successfully");
                        isLoggedIn = true;
                        break;
                    }
                }
            }

        if(!numPass){
            System.out.println("This number is not registered yet.\n");
        }else if(!numPin){
            System.out.println("Wrong pin.\n");
        }


    }

    boolean isLoggedOut(String f, String number){
        boolean isloggedIn = true;

        if(f.equalsIgnoreCase("f")){
            isloggedIn = false;
        }

        if(!isloggedIn){
            for (int i = 0; i < main.account.database.size();i++){
                if(number.equals(main.account.database.get(i).getNumber())){
                    System.out.println(main.account.database.get(i).getName()+" has successfully logged out.\n");
                    isloggedIn = false;
                    break;
                }
            }

        }

        return isLoggedIn = isloggedIn;
    }


    void changePin(String number, int pin, int changePin){

        boolean numPass = false;
        boolean pinPass = false;

        for(int i = 0; i < main.account.database.size();i++) {

            if(number.equals(main.account.database.get(i).getNumber())){
                numPass = true;

                if(pin == main.account.database.get(i).getPin()){
                    pinPass = true;
                }

                if(pinPass&&numPass){
                    main.account.database.get(i).setPin(changePin);
                    System.out.println("Your PIN has been changed. Please log in again.\n");
                    isLoggedIn = false;
                    break;
                }
            }


        }

        if(!numPass){
            System.out.println("Wrong mobile number.\n");
        } else if (!pinPass) {
            System.out.println("Wrong pin.\n");
        }


    }


    public UserAuthentication() {

    }


    //getters
    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }
    long getId(){
        return this.id;
    }

    String getNumber(){
        return this.number;
    }

    double getBalance(){
        return this.balance;
    }
    double getPin(){
        return this.pin;
    }

    String getEmail(){
        return this.email;
    }

    //setters

    void setBalance(double balance){
        this.balance = balance;
    }
    void setName(String name){
        this.name = name;
    }

    void setPin(int pin){
        this.pin = pin;
    }

    void setAge(int age){
        this.age = age;
    }
    void setEmail(String email){
        this.email = email;
    }

}
