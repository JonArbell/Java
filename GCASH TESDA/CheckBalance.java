package gcash;

public class CheckBalance {
    Main main = new Main();


    void checkBalance(String number, int pin){

        boolean pinPass = false;

        for(int i = 0; i < main.account.database.size();i++){
            if(number.equals(main.account.database.get(i).getNumber())&&pin == main.account.database.get(i).getPin()){
                pinPass = true;
                System.out.println("Current balance: "+main.account.database.get(i).getBalance());
                break;
            }
        }

        if(!pinPass){
            System.out.println("Wrong pin.\n");
        }

    }

}
