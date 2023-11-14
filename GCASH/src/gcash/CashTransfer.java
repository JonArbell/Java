package gcash;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CashTransfer {

    Main main = new Main();
    Transactions transactions = new Transactions();

    void cashTransfer(String sender, int pin,String receiver,double amount){

        String url = "jdbc:mysql://127.0.0.1:3306/gcash";
        String usn = "root";
        String pass = "arbellpogitalaga";

        try {

            String sqlSender = "select * from users where phoneNumber = ?";
            Connection con = DriverManager.getConnection(url,usn,pass);
            PreparedStatement prSender = con.prepareStatement(sqlSender);

            prSender.setString(1,sender);

            ResultSet rSender = prSender.executeQuery();

            if(rSender.next()){
                int getPin = rSender.getInt("pin");
                if(getPin == pin){

                    if(rSender.getDouble("balance")>=amount&&amount>0){

                        String sqlReceiver = "select * from users where phoneNumber = ?";
                        PreparedStatement prReceiver = con.prepareStatement(sqlReceiver);

                        prReceiver.setString(1,receiver);

                        ResultSet rReceiver = prReceiver.executeQuery();

                        if(rReceiver.next()){

                            double sendTotal = rSender.getDouble("balance") - amount;
                            double receivedTotal = rReceiver.getDouble("balance") + amount;

                            String sqlSet = "update users set balance = ? where phoneNumber = ?";

                            PreparedStatement prSend = con.prepareStatement(sqlSet);
                            PreparedStatement prReceived = con.prepareStatement(sqlSet);

                            prSend.setDouble(1,sendTotal);
                            prSend.setString(2,sender);
                            prReceived.setDouble(1,receivedTotal);
                            prReceived.setString(2,receiver);

                            int rowSend = prSend.executeUpdate();
                            int rowReceived = prReceived.executeUpdate();

                            if(rowSend>0 && rowReceived>0){
                                System.out.println("You have successfully send PHP "+amount+" to "+rReceiver.getString("full_Name"));

                                String sqlHistory = "insert into express_send(sender,receiver,amount,time_date)values(?,?,?,now())";

                                PreparedStatement prHistory = con.prepareStatement(sqlHistory);

                                prHistory.setString(1,sender);
                                prHistory.setString(2,receiver);
                                prHistory.setDouble(3,amount);

                                int rowHistory = prHistory.executeUpdate();

                                if(rowHistory>0){
                                    prHistory.close();
                                }else {
                                    prHistory.close();
                                }

                                con.close();
                                prReceiver.close();
                                prSender.close();
                                rSender.close();
                                rReceiver.close();
                                prSend.close();
                                prReceived.close();
                            }else {
                                System.out.println("Cannot send to your gcash account.\n");
                                con.close();
                                prReceiver.close();
                                prSender.close();
                                rSender.close();
                                rReceiver.close();
                                prSend.close();
                                prReceived.close();
                            }
                        }else {
                            System.out.println("Receiver not found.\n");
                            con.close();
                            prReceiver.close();
                            prSender.close();
                            rSender.close();
                            rReceiver.close();
                        }
                    }else {
                        System.out.println("Insufficient balance.\n");
                        con.close();
                        prSender.close();
                        rSender.close();

                    }
                }else {
                    System.out.println("Wrong pin.\n");
                    con.close();
                    prSender.close();
                    rSender.close();

                }
            }
        }catch (Exception e){

        }
    }

}
