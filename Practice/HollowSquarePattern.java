public class HollowSquarePattern {

    public static void main(String[] args) {

        /*
        * print the pattern
           * * * * * * *
           *           *
           *           *
           *           *
           * * * * * * *
        * */

        int row = 5;
        for(int i = 0; i < row; i++){
            if(i != 0 && i != row-1){
                System.out.print("* ");
                for(int k = 0; k < 5;k++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }else {
                for(int j = 0; j < 7;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}
