import java.util.Scanner;
// import java.util.ArrayList;
class Node<T>{
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Node<Integer> head = takeInput();
        // head = insertR(head, 4, 20);
        // printR(head);
        head = deleteR(head, 4, 4);
        printR(head);
    }
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node<Integer> head = null,tail = null;
        int data = sc.nextInt();
        while(data!= -1){
            Node<Integer> currentNode = new Node<Integer>(data);
            if(head == null){
                head = currentNode;
                tail = currentNode;
            }
            else{
                tail.next = currentNode;
                tail = currentNode;
            }
            data = sc.nextInt();
        }
        sc.close();
        return head;
    }
    public static Node<Integer> insertR(Node<Integer> head,int pos,int elem){
        if(head == null && pos>0){
            return head;
        }
        if(pos==0){
            Node<Integer> newHead = new Node<>(elem);
            newHead.next = head;
            return newHead;
        }
        else{
            head.next = insertR(head.next,pos-1,elem);
            return head;
        }
    }
    public static void printR(Node<Integer> head){
        while(head.next!= null){
            System.out.println(head.data);
            head = head.next;
        }
        if(head.next == null){
            System.out.println(head.data);
        }
    }
    public static Node<Integer> deleteR(Node<Integer> head,int elem,int pos){
        if(head==null && pos>0){
            return head;
        }
        if(pos==0){
            // head.next=head.next.next;
            return head.next;
        }
        else{   
            head.next = deleteR(head.next, elem, pos-1);
            return head;
        }
    }
}
