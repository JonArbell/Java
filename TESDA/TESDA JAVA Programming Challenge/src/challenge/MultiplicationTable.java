package challenge;

public class MultiplicationTable {

    public static void main(String[] args) {
        //Multiplication Table 10x10
        for(int i = 1; i <=10; i++) {
            for(int j = 1; j <=10; j++) {
                System.out.println(i+"*"+j+" = " +i*j);
            }
            System.out.println();
        }
    }

}