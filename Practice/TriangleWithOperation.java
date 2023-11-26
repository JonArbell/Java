package practice;

public class TriangleWithOperator {

    public static void main(String[] args) {
        String one = "1";
        for(int i = 0; i < 9; i++,one+="1"){
            long convert = Long.parseLong(one);
            for(int j = 0; j < 9-i;j++){
                System.out.print("  ");
            }
            System.out.println(one+"x"+one+"="+convert*convert);
        }
    }
}
