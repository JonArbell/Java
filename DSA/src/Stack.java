public class Stack {

    static final int size = 5;
    static int top = -1;
    static int[] stack = new int[size];
    static boolean isEmpty(){
        return top == -1;
    }

    static boolean isFull(){
        return top == size-1;
    }

    static void push(int data){
        if(isFull()){
            System.out.println("Stack Overflow");
        }else {
            top++;
            stack[top] = data;
            System.out.println("Pushed "+stack[top]);
        }
    }
    static void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }else {
            System.out.println("Popped "+stack[top]);
            stack[top] = 0;
            top--;
        }
    }
    static int peek(){
        int data = 0;
        if(isEmpty()){
            System.out.print("No data ");
            data = stack[top+1];
        }else {
            data = stack[top];
        }
        return data;
    }
    static int size(){

        return top+1;
    }

    static void display(){

        for(int i = top; i >-1;i--){
            System.out.println(stack[i]);
        }

    }

    public static void main(String[] args) {
        push(5);
        pop();
        System.out.println(peek());
        push(7);
        System.out.println(peek());
    }

}
