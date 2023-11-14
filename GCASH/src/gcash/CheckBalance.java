package gcash;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckBalance {
    Main main = new Main();


    void checkBalance(String number){

        String url = "jdbc:mysql://127.0.0.1:3306/gcash";
        String usn = "root";
        String pass = "arbellpogitalaga";

        String sql = "select balance from users where phoneNumber = ?";

        try {

            Connection con = DriverManager.getConnection(url,usn,pass);

            PreparedStatement pr = con.prepareStatement(sql);

            pr.setString(1,number);

            ResultSet r = pr.executeQuery();

            if(r.next()){

                System.out.println("Balance: "+r.getDouble("balance"));
                con.close();
                pr.close();
                r.close();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
