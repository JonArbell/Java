package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arrOne[]={1,8,2,7,3,6,4,5,5,4,6,3,7,2,8,1};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < arrOne.length;i++){
            arr.add(arrOne[i]);
        }
        System.out.print("Enter number: ");
        byte num = s.nextByte();
        arr.add((int)num);
        arr.addFirst((int)num);
        for(int i = 0; i < arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }


    }

}
