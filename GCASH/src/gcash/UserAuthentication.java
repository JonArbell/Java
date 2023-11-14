package gcash;

import org.w3c.dom.ls.LSOutput;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class UserAuthentication {

    Main main = new Main();

    public UserAuthentication(String name, int age,String email,String number,int pin) {

        boolean namePass = false;
        boolean agePass = false;
        boolean emailPass = false;
        boolean numberPass = false;
        boolean pinPass = false;

        String url = "jdbc:mysql://127.0.0.1:3306/gcash";
        String usn = "root";
        String pass = "arbellpogitalaga";

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

        }else {
            emailPass = false;
            return;
        }

        if(!number.equals(null)){
            numberPass = true;

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

            String createSql = "insert into users (full_Name,age,email,phoneNumber,pin,balance)values(?,?,?,?,?,?)";

            try {

                Connection con = DriverManager.getConnection(url,usn,pass);

                PreparedStatement pr = con.prepareStatement(createSql);

                pr.setString(1,name);
                pr.setInt(2,age);
                pr.setString(3,email);
                pr.setString(4,number);
                pr.setInt(5,pin);
                pr.setDouble(6,0);

                int add = pr.executeUpdate();

                if(add>0){

                    String selectSql = "select uid,full_Name from users where phoneNumber = ?";

                    PreparedStatement ps = con.prepareStatement(selectSql);

                    ps.setString(1,number);

                    ResultSet r = ps.executeQuery();

                    if(r.next()){
                        int uid = r.getInt(1);
                        String getName = r.getString("full_Name");

                        System.out.println("ID: "+uid+"\n"+getName+" is registered successfully\n");

                        r.close();
                        ps.close();
                        pr.close();
                        con.close();

                    }else {
                        r.close();
                        ps.close();
                        pr.close();
                        con.close();

                    }

                }

            }catch (Exception e){
                e.printStackTrace();
            }

        }else {
            return;
        }

    }

    boolean isLoggedIn = false;
    void logInVerification(String number, int pin){

        String url = "jdbc:mysql://127.0.0.1:3306/gcash";
        String usn = "root";
        String pass = "arbellpogitalaga";
        String logInSql = "select full_name,uid,pin from users where phoneNumber = ?";

        try {

            Connection con = DriverManager.getConnection(url,usn,pass);

            PreparedStatement pr = con.prepareStatement(logInSql);

            pr.setString(1,number);

            ResultSet resultSet = pr.executeQuery();

            if(resultSet.next()){

                int getPin = resultSet.getInt("pin");

                if(getPin == pin){
                    isLoggedIn = true;
                    System.out.println("ID: "+resultSet.getInt("uid")+"\n"+resultSet.getString("full_name")+" is logged in successfully");
                    con.close();
                    pr.close();
                    resultSet.close();
                }else {
                    System.out.println("Wrong pin.\n");
                    con.close();
                    pr.close();
                    resultSet.close();
                }

            }else {
                System.out.println("This number is not registered yet.\n");
                con.close();
                pr.close();
                resultSet.close();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    boolean isLoggedOut(String f, String number){
        boolean isloggedIn = true;

        if(f.equalsIgnoreCase("f")){
            isloggedIn = false;

            String url = "jdbc:mysql://127.0.0.1:3306/gcash";
            String usn = "root";
            String pass = "arbellpogitalaga";
            String sql = "select full_Name from users where phoneNumber = ?";

            try {

                Connection con = DriverManager.getConnection(url,usn,pass);
                PreparedStatement pr = con.prepareStatement(sql);

                pr.setString(1,number);

                ResultSet r = pr.executeQuery();

                if(r.next()){

                    System.out.println(r.getString("full_Name")+" has successfully logged out.\n");
                    con.close();
                    pr.close();
                    r.close();
                }

            }catch (Exception e ){
                e.printStackTrace();
            }

        }

        return isLoggedIn = isloggedIn;
    }


    void changePin(String number, int pin, int changePin){

        String url = "jdbc:mysql://127.0.0.1:3306/gcash";
        String usn = "root";
        String pass = "arbellpogitalaga";
        String sql = "select pin from users where phoneNumber = ?";

        try {

            Connection con = DriverManager.getConnection(url,usn,pass);

            PreparedStatement pr = con.prepareStatement(sql);

            pr.setString(1,number);

            ResultSet r = pr.executeQuery();

            if (r.next()){

                if(r.getInt("pin") == pin){

                    String setPin = "update users set pin = ?";

                    PreparedStatement updatePin = con.prepareStatement(setPin);

                    updatePin.setInt(1,changePin);

                    int rowsUpdate = updatePin.executeUpdate();

                    if(rowsUpdate>0){

                        System.out.println("Your PIN has been changed. Please log in again.\n");
                        isLoggedIn = false;
                        con.close();
                        pr.close();
                        r.close();
                        updatePin.close();
                    }else {
                        con.close();
                        pr.close();
                        r.close();
                        updatePin.close();

                    }

                }else {
                    System.out.println("Wrong pin.\n");
                    con.close();
                    pr.close();
                    r.close();
                }

            }else {
                System.out.println("Wrong number.\n");
                con.close();
                pr.close();
                r.close();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public UserAuthentication() {

    }

}
