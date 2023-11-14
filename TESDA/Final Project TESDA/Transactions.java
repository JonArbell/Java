package gcash;

import java.util.ArrayList;
import java.time.LocalDateTime;
public class Transactions {
    static ArrayList <Transactions> transactions = new ArrayList<>();

    private double totalCashIn;
    private double amountCashIn;
    private String numberCashIn;
    private double amountCashTransferSend;
    private double amountCashTransferReceived;
    private String numberCashSend;
    private String numberCashReceived;
    private LocalDateTime dateTimeCashIn;
    private LocalDateTime dateTimeCashTransfer;



    Main main = new Main();


    //cashIn
    Transactions(String number, double amount){

        LocalDateTime now = LocalDateTime.now();

        this.numberCashIn = number;
        this.amountCashIn = amount;
        this.dateTimeCashIn =now;
        this.totalCashIn = amount;


    }


    //cash transfer
    Transactions(String sender, String receiver, double amount){

        LocalDateTime now = LocalDateTime.now();
        this.numberCashSend = sender;
        this.numberCashReceived = receiver;
        this.dateTimeCashTransfer =now;
        this.amountCashTransferSend = amount;
        this.amountCashTransferReceived = amount;

    }
    Transactions(){

    }


    //getCashIn
    void getCashInTransaction(String number){

        for(Transactions t: transactions){

            if(number.equals(t.getNumberCashIn())){
                System.out.println("Date and Time: "+t.getDateTimeCashIn()+"\nCash in: "+t.getAmountCashIn()+"\n");
            }

        }

    }

    //getCashTransferSend
    void getCashTransferSendTransaction(String number){


        for(int i = 0; i < transactions.size();i++){

            if(number.equals(transactions.get(i).getNumberCashSend())){

                System.out.println("Date and Time: "+transactions.get(i).getDateTimeCashTransfer()+"\nCash send to: "+transactions.get(i).getNumberCashReceived()+"\nAmount: "+transactions.get(i).getAmountCashTransferSend()+"\n");

            }

        }

    }

    //getCashTransferReceived
    void getCashTransferReceivedTransaction(String number){


        for(int i = 0; i < transactions.size();i++){

            if(number.equals(transactions.get(i).getNumberCashReceived())){
                System.out.println("Date and Time: "+transactions.get(i).getDateTimeCashTransfer()+"\nCash received from: "+transactions.get(i).getNumberCashSend()+"\nAmount: "+transactions.get(i).getAmountCashTransferReceived()+"\n");

            }

        }

    }



    String getNumberCashIn(){
        return this.numberCashIn;
    }

    String getNumberCashSend(){
        return this.numberCashSend;
    }
    String getNumberCashReceived(){
        return this.numberCashReceived;
    }


    double getAmountCashIn(){
        return this.amountCashIn;
    }

    double getTotalCashIn(){
        return this.totalCashIn;
    }

    double getAmountCashTransferSend(){
        return this.amountCashTransferSend;
    }
    double getAmountCashTransferReceived(){
        return this.amountCashTransferReceived;
    }


    LocalDateTime getDateTimeCashIn() {
        return dateTimeCashIn;
    }
    LocalDateTime getDateTimeCashTransfer() {
        return dateTimeCashTransfer;
    }

    void setTotalCashIn(double cash){
        this.totalCashIn = cash;
    }

}
