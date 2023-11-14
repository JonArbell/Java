package challenge;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        //Check vowels and consonants
        Scanner s = new Scanner(System.in);

        System.out.print("Enter letter: ");
        String in = s.nextLine();

        String [] vowels = {"a","e","i","o","u"};
        String [] consonants = {"b","c","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};

        boolean notInvalid = false;

        for(String vowel: vowels){
            if(in.equalsIgnoreCase(vowel) ){
                System.out.println(in+" is vowel");
                notInvalid = true;
            }
        }
        for(String consonant: consonants){
            if(in.equalsIgnoreCase(consonant) ){
                System.out.println(in+" is consonant");
                notInvalid = true;
            }
        }
        if(!notInvalid){
            System.out.println("Invalid Input");
        }
    }
}
