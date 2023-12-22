public class FloydsTriangle {

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
        int num = 1;
        int incr = 0;
        for(int i = 0; i < row; i++){

            for(int j = 1; j <= num;j++){
                int x = incr + num-i;
                if(x>9)System.out.print(x+" ");
                else System.out.print(x+"  ");
                incr++;
            }
            num++;
            System.out.println();
        }


    }

}
