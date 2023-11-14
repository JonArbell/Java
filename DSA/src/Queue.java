public class Queue {

    static int max = 5;
    static int queue[] = new int[max];

    static int front = -1;
    static int back = -1;

    static boolean isEmpty(){
        return front == -1 && back == -1;
    }

    static boolean isFull(){
        return back == max-1;
    }

    static void enqueue(int data){
        if(!isFull()){
            if(front == 0){
                back++;
                queue[back] = data;
                System.out.println("Enqueue "+queue[back]);
            }else{
                front++;
                back++;
                queue[back] = data;
                System.out.println("Enqueue "+queue[back]);
            }

        }else{
            System.out.println("Full Queue!");
        }

    }
    static void dequeue(){

        if(!isEmpty()){

            if(front+1>back){
                System.out.println("Dequeue "+queue[front]);
                queue[front] = 0;
                front = -1;
                back = -1;
            }else {
                System.out.println("Dequeue "+queue[front]);
                queue[front] = 0;
                front++;
            }

        }else{
            System.out.println("Empty Queue!");
        }

    }
    static int peak(){
        int peak = -1;

        if(!isEmpty()){
            System.out.println("Peak "+queue[front]);
        }

        return peak;

    }
    static void display(){

        if(!isEmpty()){
            for(int i = front; i <= back;i++){
                System.out.println(i+": "+queue[i]);
            }
        }else{
            System.out.println("Empty Queue!");
        }

    }
    static int size(){
        return back-front+1;
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        dequeue();
        peak();
        dequeue();
        System.out.println("Size: "+size());
        display();
    }

}
