package challenge;

public class StringBuilder10characters {

    public static void main(String[] args) {
        //StringBuilder - 10 characters
        StringBuilder stringBuilder = new StringBuilder(10);
        stringBuilder.append("Hi, ");
        stringBuilder.append("World!");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.toString().length());


    }

}
