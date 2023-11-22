package practice;

import java.util.Scanner;

public class Matrix {public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = s.nextInt();
    int row = (int) Math.sqrt(num);
    int col = (int) Math.sqrt(num);
    String convert = Double.toString(Math.sqrt(num));
    if(convert.charAt(2)=='0'){
        for(int i = 0; i < row;i++){
            for(int j = 0; j < col;j++ ){
                String y = "";
                y+=num;
                if(y.length()==2){
                    System.out.print(num+"  ");
                }else {
                    System.out.print(num+"   ");
                }
                num--;
            }
            System.out.println();
        }
    }else {
        for(int i = 0; i < row+1;i++){
            for(int j = 0; j < col;j++ ){
                if(num>0){
                    String y = "";
                    y+=num;
                    if(y.length()==2){
                        System.out.print(num+"  ");
                    }else {
                        System.out.print(num+"   ");
                    }
                    num--;
                }else {
                    break;
                }
            }
            System.out.println();
        }
    }

}
}
