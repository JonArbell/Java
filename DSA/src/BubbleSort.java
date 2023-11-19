
public class BubbleSort {

    public static void main(String[] args){

        int[] arr = {3,5,2,4,1};
        boolean swapped;
        for(int i = 0; i < arr.length;i++){
            swapped = false;
            for(int j =0;j< arr.length-1-i;j++){
                int currentVal = arr[j];
                int nextVal = arr[j+1];
                if(currentVal>nextVal){
                    swapped = true;
                    arr[j] = nextVal;
                    arr[j+1] = currentVal;
                }
            }
            if(!swapped){
                break;
            }
        }
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
