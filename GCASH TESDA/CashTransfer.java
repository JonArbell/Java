package gcash;

public class CashTransfer {

    Main main = new Main();
    Transactions transactions = new Transactions();

    void cashTransfer(String sender, int pin,String receiver,double amount){
        boolean pinPass= false;
        boolean receiverPass = false;
        for(int i = 0; i < main.account.database.size();i++){

            if(sender.equals(main.account.database.get(i).getNumber())&&pin == main.account.database.get(i).getPin()){
                pinPass= true;

                if(main.account.database.get(i).getBalance()>=amount && main.account.database.get(i).getBalance()>0){


                    for(int j = 0;j<main.account.database.size();j++){
                        if(receiver.equals(main.account.database.get(i).getNumber())){

                            System.out.println("Cannot send to your gcash account.\n");
                            break;

                        } else if (receiver.equals(main.account.database.get(j).getNumber())) {
                            receiverPass = true;
                            double send =  main.account.database.get(i).getBalance()-amount;
                            double recieve =  main.account.database.get(j).getBalance()+amount;

                            main.account.database.get(i).setBalance(send);
                            main.account.database.get(j).setBalance(recieve);
                            System.out.println("You have successfully send PHP "+amount+" to "+main.account.database.get(j).getName());
                            transactions.transactions.add(new Transactions(sender,receiver,amount));
                            break;
                        }
                    }

                }else {
                    System.out.println("Insufficient balance.\n");
                    break;
                }


            }

        }
        if(!pinPass){
            System.out.println("Wrong pin.\n");
        }else if(!receiverPass){
            System.out.println("Receiver not found.\n");
        }

    }



}
