package practice;

public class Matrix2 {
    public static void main(String[] args) {

        /*Write a java program that prints the following pattern on the screen.
        1  2  3  4   5   6
        6  8  10 12  14  16
        16 19 22 25  28  31
        31 35 39 43  47  51
        51 56 61 66  71  76
        76 82 88 94 100 106
        */
        int x = 1;
        int y = 0;
        for(int i = 1; i < 7; i++){
            for(int j = 1; j < 7; j++){
                String convert = Integer.toString(x);
                if(convert.length()==1){
                    System.out.print(x+"   ");
                }else if (convert.length()==2){
                    System.out.print(x+"  ");
                }else {
                    System.out.print(x+" ");
                }
                x++;
                x+=y;
            }
            y++;
            x-=y;
            System.out.println();
        }
    }
}
