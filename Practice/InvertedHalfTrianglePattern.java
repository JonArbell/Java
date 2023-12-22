public class InvertedHalfTrianglePattern {

    public static void main(String[] args) {

        /*
        * print the pattern
           * * * * *
           * * * *
           * * *
           * *
           *
        *
        */

        int row = 5;
        int sizeStar = 5;
        for(int i = 0; i < row; i++){

            for(int j = sizeStar; j > 0;j--){
                System.out.print("* ");
            }
            sizeStar--;
            System.out.println();
        }


    }

}
