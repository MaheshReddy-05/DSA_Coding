import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        BTNode<Integer> root = new BTNode<Integer>(1);
        root = input(root,true,0,false);
        printTree(root);
    }
    public static BTNode input(BTNode<Integer> root,boolean head,int val,boolean isleft){
        if(head){
            System.err.println("Enter Root");
        }
        else if(isleft){
            System.out.println("Enter Left node of "+val+" :");
        }
        else {
            System.out.println("Enter Right node of "+val+" :");
        }
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if(data==-1) return null;
        BTNode<Integer> h = new BTNode<Integer>(data);
        h.left  =  input(h.left,false,data,true);
        h.right = input(h.right,false,data,false);
        return h;
    }
    public static void printTree(BTNode<Integer> head){
        if(head==null) return ;
        printTree(head.left);
        printTree(head.right);
        System.out.println(head.data);
    }
}


/*

1
 */
