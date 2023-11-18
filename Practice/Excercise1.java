package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        byte arr[]={1,8,2,7,3,6,4,5,5,4,6,3,7,2,8,1};
        ArrayList<Byte> arrList = new ArrayList<>();
        for(byte i = 0; i < arr.length;i++){
            arrList.add(arr[i]);
        }
        System.out.print("Enter number: ");
        byte num = s.nextByte();
        arrList.add(num);
        arrList.addFirst(num);
        for(byte i = 0; i < arrList.size();i++){
            System.out.print(arrList.get(i)+" ");
        }
        System.out.println("\nDone!");
        arrList.clear();

        byte arr1[] = {1,5,2,4,3,3,4,2,5,1};
        arrList = new ArrayList<>();
        for(byte i = 0; i < arr1.length;i++) {
            arrList.add(arr1[i]);
        }
        System.out.print("Enter number: ");
        byte num1 = s.nextByte();
        arrList.add(num1);
        arrList.addFirst(num1);
        for(byte i = 0; i < arrList.size();i++){
            System.out.print(arrList.get(i)+" ");
        }
        System.out.println("\nDone!");
        arrList.clear();

        byte arr2[] = {1,2,2,1};
        arrList = new ArrayList<>();
        for(byte i = 0; i < arr2.length;i++) {
            arrList.add(arr2[i]);
        }
        System.out.print("Enter number: ");
        byte num2 = s.nextByte();
        arrList.add(num2);
        arrList.addFirst(num2);
        for(byte i = 0; i < arrList.size();i++){
            System.out.print(arrList.get(i)+" ");
        }
        System.out.println("\nDone!");
        arrList.clear();

        byte arr3[] = {1,3,2,2,3,1};
        arrList = new ArrayList<>();
        for(byte i = 0; i < arr3.length;i++) {
            arrList.add(arr3[i]);
        }
        System.out.print("Enter number: ");
        byte num3 = s.nextByte();
        arrList.add(num3);
        arrList.addFirst(num3);
        for(byte i = 0; i < arrList.size();i++){
            System.out.print(arrList.get(i)+" ");
        }
        System.out.println("\nDone!");
        arrList.clear();
    }

}
