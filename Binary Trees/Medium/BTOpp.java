package Medium;
import java.util.Scanner;
public class BTOpp{
    public static void main(String[] args) {
        BTN<Integer> Root = Input(true,0,false);
        // treeDisplay(Root);
        // System.out.println("Tree Hight" +treeHight(Root));
        
        balancedTree obj = modifyTreeBalanced(Root);
        System.out.println(obj.isBalanced);
    }
    public static int treeHight(BTN<Integer> Root){
        if(Root == null){
            return 0;
        }
        int left = treeHight(Root.left);
        int right = treeHight(Root.right);
        return (1+Math.max(left,right));
    }
    public static boolean treeBalanced(BTN<Integer> Root){
        if(Root==null){
            return true;
        }
        int leftTree = treeHight(Root.left);
        int rightTree = treeHight(Root.right);
        if(Math.abs(leftTree-rightTree)>1){
            return false;
        }
        boolean isLeftBalanced = treeBalanced(Root.left);
        boolean isRightBalanced = treeBalanced(Root.right);
        return isLeftBalanced&&isRightBalanced;
    }
    public static balancedTree modifyTreeBalanced(BTN<Integer> Root){
        if(Root == null){
            balancedTree ans = new balancedTree();
            ans.height = 0;
            ans.isBalanced = true;
            return ans;
        }
        balancedTree left = modifyTreeBalanced(Root.left);
        balancedTree right = modifyTreeBalanced(Root.right);
        balancedTree ans = new balancedTree();
        ans.height = 1+Math.max(left.height,right.height);
        ans.isBalanced = true;
        if(Math.abs(left.height - right.height)>1){
            ans.isBalanced = false;
        }
        if(!left.isBalanced || !right.isBalanced){
            ans.isBalanced = false;
        }
        return ans;
    }
    public static BTN<Integer> Input(boolean isRoot,int parent,boolean isLeft){
        
        if(isRoot){
            System.out.println("Enter Root Node");
        }
        else{
            if(isLeft){
                System.out.println("Enter Left Node of : "+ parent);
            }
            else{
                System.out.println("Enter Right Node of : "+ parent);
            }
        }
        try (Scanner sc = new Scanner(System.in)) {
            int data = sc.nextInt();
            if(data==-1){
                return null;
            }
            BTN<Integer> Root = new BTN<>(data);
            Root.left = Input(false,data,true);
            Root.right = Input(false,data,false);
            return Root;
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
}
class BTN<T>{
    T data;
    BTN<T> left = null;
    BTN<T> right = null;
    public BTN(T x){
        data = x;
    }
}
class balancedTree{
    int height;
    boolean isBalanced;
}