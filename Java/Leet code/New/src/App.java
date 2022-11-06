import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        BTN<Integer> Root = F();
        // treeDisplay(Root);
        treePrint(Root);

    }
    public static void treePrint(BTN<Integer> Root){
        Queue<BTN<Integer>> qu = new LinkedList<>();
        if(Root==null){
            return;
        }
        qu.add(Root);
        while(!qu.isEmpty()){
            BTN<Integer> currentNode = qu.remove();
            System.out.println(currentNode.data);
            if(currentNode.left!=null){
                qu.add(currentNode.left);
            }
            if(currentNode.right!=null){
                qu.add(currentNode.right);

            }
        }
    }
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
    public static BTN<Integer>  F(){
        Queue<BTN<Integer>> qu = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Root Node : ");
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        BTN<Integer> rootNode = new BTN<Integer>(data);
        qu.add(rootNode);
        while(!qu.isEmpty()){
            BTN<Integer> currentNode = qu.remove();
            int Data = sc.nextInt();
            if(Data!=-1){
                BTN<Integer> crtNode = new BTN<Integer>(Data);
                currentNode.left = crtNode;
                qu.add(crtNode);
            }
            int rtData = sc.nextInt();
            if(rtData!=-1){
                BTN<Integer> crtNode = new BTN<>(rtData);
                currentNode.right = crtNode;
                qu.add(crtNode);
            }
        }
        return rootNode;
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
