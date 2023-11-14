package gcash;

public class CashIn {
    Transactions transactions = new Transactions();
    Main main = new Main();

    void cashIn(String number,double amount){

        for (int i = 0; i < main.account.database.size();i++){

            if(number.equals(main.account.database.get(i).getNumber())){

                boolean eightK = false;
                double total = main.account.database.get(i).getBalance()+amount;

                for(int j = 0; j < transactions.transactions.size();j++){

                    if(number.equals(transactions.transactions.get(j).getNumberCashIn())){

                        transactions.transactions.get(j).setTotalCashIn(total);
                        if(transactions.transactions.get(j).getTotalCashIn()>8000){
                            amount = amount - (amount*0.02);
                            total = main.account.database.get(i).getBalance()+amount;
                            main.account.database.get(i).setBalance(total);

                            System.out.println("\nYou have successfully received PHP "+amount);
                            System.out.println("A 2% service fee has been deducted from your wallet for reaching the PHP 8000.00 monthly limit for free over-the-counter cash ins. Your new balance is "+main.account.database.get(i).getBalance()+".");
                            eightK = true;
                            transactions.transactions.add(new Transactions(number,amount));
                            break;
                        }
                        break;
                    }
                }
                if(!eightK){
                    main.account.database.get(i).setBalance(total);

                    System.out.println("You have successfully received PHP "+amount);
                    transactions.transactions.add(new Transactions(number,amount));
                    break;
                }

                break;

            }

        }
    }
}
