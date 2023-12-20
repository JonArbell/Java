import java.util.Scanner;

public class Main {
    static int size = 5;
    static Person[] person = new Person[size];
    static int rear = -1;
    static int front = -1;
    static boolean isFull(){
        return rear == size-1 && front == 0;
    }
    static boolean isEmpty(){
        return rear == -1 && front == -1;
    }
    static int size(){
        return rear-front +1;
    }
    static void dequeue(){

        if(!isEmpty()){

            if(front == rear){
                System.out.println("Dequeue: "+person[front].getName());
                person[front] = null;
                front = -1;
                rear = -1;
                display();
            }else {
                System.out.println("Dequeue: "+person[front].getName());
                person[front] = null;
                front++;
                display();
            }

        }else System.out.println("Empty Queue!\n");
    }
    static void enqueue(Person per){

        if(!isFull()){
            if(front > -1){
                rear++;
                if(per.isPregnant()||per.isPwd()){
                    Person[] aray2 = new Person[rear+1];
                    if(person[1] != null){

                        if(person[1].isPwd() || person[1].isPregnant()){
                            int indexForLastPwdOrPreg = 1;
                            for(int i = 0;i<rear;i++){
                                if(person[i] != null) {
                                    if (person[i].isPwd() || person[i].isPregnant()) {
                                        aray2[i] = person[i];
                                        indexForLastPwdOrPreg++;
                                    } else if (i > 0) aray2[i + 1] = person[i];
                                    else aray2[i] = person[i];
                                }
                            }

                            if(indexForLastPwdOrPreg == aray2.length)aray2[indexForLastPwdOrPreg-1] = per;
                            else aray2[indexForLastPwdOrPreg] = per;

                            for(int i = 0; i < aray2.length;i++) person[i] = aray2[i];
                            System.out.println("Enqueue: "+person[rear].getName());
                        }else {
                            aray2[1] = per;
                            for(int i = 0; i < rear;i++){
                                if(i == 0) aray2[i] = person[i];
                                else aray2[i+1] = person[i];
                            }
                            for(int i = 0; i < aray2.length;i++) person[i] = aray2[i];
                            System.out.println("Enqueue: "+person[rear].getName());
                        }
                    }else {
                        aray2[1] = per;
                        for(int i = 0; i < rear;i++){
                            if(i == 0) aray2[i] = person[i];
                            else aray2[i+1] = person[i];
                        }
                        for(int i = 0; i < aray2.length;i++)person[i] = aray2[i];
                        System.out.println("Enqueue: "+person[rear].getName());
                    }

                }else {
                    person[rear] = per;
                    System.out.println("Enqueue: "+person[rear].getName());
                }
            }else {
                rear++;
                front++;
                person[front] = per;
                System.out.println("Enqueue: "+person[front].getName());
            }
        }else System.out.println("Full Queue!\n");

    }

    static void display(){
        int index = 0;
        for(Person i: person){
            if(i != null){
                System.out.println("\nIndex: "+index+"\nName: "+i.getName()+"\nAge: "+i.getAge()+"\nHealth Status: "+i.getHealthStatus()+"\n");
            }else {
                System.out.println("Index: "+index+" is null\n");
            }
            index++;
        }
    }
    static void peak(){
        System.out.println("\nName: "+person[front].getName()+"\nAge: "+person[front].getAge()+"\nHealth Status: "+person[front].getHealthStatus()+"\n");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true){

            System.out.print("Enter your name: ");
            String name = s.nextLine();

            System.out.print("Enter your age: ");
            int age = s.nextInt();

            System.out.print("\n1. Normal  2. Pregnant  3. PWD\n\nEnter your status: ");
            int stat = s.nextInt();
            s.nextLine();

            enqueue(new Person(name,age,stat));
            display();
            boolean done = false;
            while (!done){
                System.out.print("Do you want to dequeue? (Y/N): ");
                String inp = s.nextLine();

                if(inp.equalsIgnoreCase("y")) {
                    dequeue();
                    System.out.print("Do you want to dequeue again? (Y/N): ");
                    inp = s.nextLine();

                    if(inp.equalsIgnoreCase("n")) done = true;
                    else dequeue();

                }
                else if(inp.equalsIgnoreCase("n")) break;
                else System.out.println("Invalid Input\n");
            }
        }

    }

}
