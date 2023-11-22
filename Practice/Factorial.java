package practice;
public class Factorial {
    void factorial(long data){
        long result = data;
        while (data>1){
            data--;
            result*=data;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {

        ICCT main = new ICCT();

        main.factorial(10);


    }

}
