public class InvertedAndRotatedHalfTrianglePattern {

    public static void main(String[] args) {

        /*
        * print the pattern
                   *
                 * *
               * * *
             * * * *
           * * * * *
        *
        */

        int row = 5;
        int sizeStar = 1;
        for(int i = 0; i < row; i++){

            for(int k = row; k-i-1 > 0; k--){
                System.out.print("  ");
            }
            for(int j =0;j<sizeStar;j++){
                System.out.print("* ");
            }
            sizeStar++;
            System.out.println();
        }


    }

}
