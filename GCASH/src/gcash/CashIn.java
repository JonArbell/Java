package gcash;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CashIn {
    Transactions transactions = new Transactions();
    Main main = new Main();

    void cashIn(String number,double amount){


        try {

            String url = "jdbc:mysql://127.0.0.1:3306/gcash";
            String usn = "root";
            String pass = "arbellpogitalaga";
            String sqlSelect = "select balance from users where phoneNumber = ?";

            Connection con = DriverManager.getConnection(url,usn,pass);

            PreparedStatement pr = con.prepareStatement(sqlSelect);

            pr.setString(1,number);

            ResultSet resultSet = pr.executeQuery();

            if (resultSet.next()) {
                String updateStatement = "update users set balance = ? where phoneNumber = ?";

                PreparedStatement sqlSet = con.prepareStatement(updateStatement);

                sqlSet.setDouble(1,amount+resultSet.getDouble("balance"));
                sqlSet.setString(2,number);

                int rows = sqlSet.executeUpdate();
                String message = "You have successfully received PHP " + amount;
                String history = "insert into cash_in(phoneNumber,amount,time_date)values(?,?,now())";
                PreparedStatement prHistory = con.prepareStatement(history);

                prHistory.setString(1,number);
                prHistory.setDouble(2,amount);

                int rowHistory = prHistory.executeUpdate();

                if(rowHistory > 0){
                    prHistory.close();
                }else {
                    prHistory.close();
                }


                if(rows>0){

                    PreparedStatement updatedSql = con.prepareStatement(sqlSelect);

                    updatedSql.setString(1,number);

                    ResultSet updatedResult = updatedSql.executeQuery();

                    if(updatedResult.next()){
                        if(updatedResult.getDouble("balance")>8000){

                            PreparedStatement sqlUpdated = con.prepareStatement(updateStatement);
                            double total = amount*0.02;

                            sqlUpdated.setDouble(1,updatedResult.getDouble("balance")-total);
                            sqlUpdated.setString(2,number);

                            sqlUpdated.executeUpdate();

                            amount = amount -(amount*0.02);

                            message = "You have successfully received PHP " + amount;
                            message += "\nA 2% service fee has been deducted from your wallet for reaching the PHP 8000.00 monthly limit for free over-the-counter cash in.";

                            sqlUpdated.close();
                        }

                        PreparedStatement lastUpdatedSql = con.prepareStatement(sqlSelect);

                        lastUpdatedSql.setString(1,number);

                        ResultSet lastUpdatedResult = lastUpdatedSql.executeQuery();

                        lastUpdatedResult.next();

                        System.out.println(message);
                        System.out.println("Your new balance is " + lastUpdatedResult.getDouble("balance"));

                        con.close();
                        pr.close();
                        resultSet.close();
                        sqlSet.close();
                        updatedSql.close();
                        updatedResult.close();
                        lastUpdatedSql.close();
                        lastUpdatedResult.close();

                    }

                }

            }

        }catch (Exception e ){
            e.printStackTrace();
        }

    }
}
