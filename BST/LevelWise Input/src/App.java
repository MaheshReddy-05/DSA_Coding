import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Queue<Integer> h = new LinkedList<>();
        h.add(null);
        System.out.println(h.isEmpty());
    }
    /* public static BTN<Integer> levelWiseInput(){
        Queue<BTN<Integer>> obj = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
    } */
    public static void treeDisplay(BTN<Integer> Root){
        if(Root==null){
            return;
        }
        System.out.print(Root.data+":");
        if(Root.left != null){
            System.out.print("L"+Root.left.data +":");
        }
        if(Root.right !=null){
            System.out.print("R"+Root.right.data);
        }
        System.out.println();
        treeDisplay(Root.left);
        treeDisplay(Root.right);
    }
}
class BTN<T>{
    T data;
    BTN<T> left = null;
    BTN<T> right = null;
    public BTN(T x){
        data = x;
    }
}
