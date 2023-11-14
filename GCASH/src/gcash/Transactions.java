package gcash;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.sql.Statement;
public class Transactions {

    Main main = new Main();
    Transactions(){

    }

    //getCashIn
    void getCashInTransaction(String number){
        String url = "jdbc:mysql://127.0.0.1:3306/gcash";
        String usn = "root";
        String pass = "arbellpogitalaga";
        String sql = "SELECT * from cash_in where phoneNumber = ?";

        try{

            boolean historyCheck = false;
            Connection con = DriverManager.getConnection(url,usn,pass);

            PreparedStatement pr = con.prepareStatement(sql);

            pr.setString(1,number);


            ResultSet r = pr.executeQuery();

            while (r.next()){
                historyCheck = true;
                System.out.println("Cash In");
                System.out.println("Date and Time: "+r.getTimestamp("time_date")+"\nAmount: "+r.getDouble("amount")+"\n");
            }

            if(!historyCheck) {
                System.out.println("No history.\n");
                con.close();
                pr.close();
                r.close();
            }else {
                con.close();
                pr.close();
                r.close();
            }

        }catch (Exception e ){
            e.printStackTrace();
        }
    }

    //getCashTransferSend
    void getExpressSendTransaction(String number){

        String url = "jdbc:mysql://127.0.0.1:3306/gcash";
        String usn = "root";
        String pass = "arbellpogitalaga";
        String sql = "select * from express_send where sender = ? or receiver = ?";

        try {

            Connection con = DriverManager.getConnection(url,usn,pass);

            PreparedStatement pr = con.prepareStatement(sql);

            pr.setString(1,number);
            pr.setString(2,number);

            ResultSet r = pr.executeQuery();
            boolean historyCheck = false;
            while (r.next()){


                String getReceiver = r.getString("receiver");
                String getSender = r.getString("sender");

                if(number.equals(getReceiver)){
                    historyCheck = true;
                    System.out.println("Express Send");
                    System.out.println("Date and time: "+r.getTimestamp("time_date")+"\n"+"Cash received from: "+getSender+"\nAmount: "+r.getDouble("amount")+"\n");
                } else if (number.equals(getSender)) {
                    historyCheck = true;
                    System.out.println("Express Send");
                    System.out.println("Date and time: "+r.getTimestamp("time_date")+"\n"+"Cash send to: "+getReceiver+"\nAmount: "+r.getDouble("amount")+"\n");
                }
            }

            if(!historyCheck){
                System.out.println("No history.\n");
                con.close();
                pr.close();
                r.close();
            }else {
                con.close();
                pr.close();
                r.close();
            }



        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
