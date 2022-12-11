// import java.util.*;
public class QueueOpp {
    public static void main(String[] args) throws Exception {
        queue obj = new queue();
        obj.enQueue(10);
        obj.enQueue(13);
        obj.enQueue(134);
        obj.display();
        // Queue<Integer> l = new LinkedList<Integer>();

    }
}
class queue {
    private int data[];
    int front = -1;
    int rare = -1;
    int size = 0;
    public queue(){
        data = new int[5];
        size = 5;
    }
    boolean isFull(){
        if((front == 0 && rare == data.length-1) || (front == rare + 1)){
            return true;
        }
        if(front == rare + 1){
            return true;
        }
        else{
            return false;
        }
    }
    public queue(int arl){
        data = new int[arl];
    }
    public void enQueue(int x){
        if((front == 0 && rare == data.length-1) || (front == rare + 1)){
            System.out.println("The stack is full");
        }
        else{
            if(front==-1)
                front = 0;
            rare = (rare+1)%data.length;
            data[rare] = x;
            System.out.println("Inserted Element" + x);
        }
    }
    public void display(){
        if(front==-1){
            System.out.println("Queue is empty");
        }
        else{
            for(int i = front ;i!=rare;i = (i+1)%data.length){
                System.out.println(data[i]);
            }
            System.out.println(data[rare]);
        }
    }
    public String deQueue(){
        if(front==-1 || front == rare){
            front = -1;
            rare = -1;
            return "Queue is empty";
        }
        else{
            System.out.println(data[front]);
            front = (front+1)%data.length;
            System.out.println(data[front]);
            return "Front had Updated";            
        }
    } 
}
