import java.util.*;

public class TreeOpp {
    public static void main(String[] args) throws Exception {
        TreeNode<Integer> root = new TreeNode<Integer>(10);
        TreeNode<Integer> root1 = new TreeNode<Integer>(11);
        TreeNode<Integer> root2 = new TreeNode<Integer>(12);
        TreeNode<Integer> root3 = new TreeNode<Integer>(13);
        TreeNode<Integer> root4 = new TreeNode<Integer>(14);
        TreeNode<Integer> root5 = new TreeNode<Integer>(15);
        TreeNode<Integer> root6 = new TreeNode<Integer>(16);
        root.children.add(root1);
        root.children.add(root2);
        root.children.add(root3);
        root.children.add(root4);
        root.children.add(root5);
        root1.children.add(root6);
        List<List<Integer>> ls = levelWisePrint(root);
        for (List<Integer> list : ls) {
            System.out.println(list);
        }
    }
    public static List<List<Integer>> levelWisePrint(TreeNode<Integer> root){
        Queue<TreeNode<Integer>> ql = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        ql.add(root);
        while(!ql.isEmpty()){
            int size = ql.size();
            List<Integer> subList = new ArrayList<Integer>();
            for(int i = 0;i<size;i++){
                TreeNode<Integer> current = ql.remove();
                // System.out.println(current.data);
                // subList.add(current.data);
                System.out.print(current.data+" ");
                for(int j = 0;j<current.children.size();j++){
                    // System.out.println("Inside loop "+current.children.get(i).data);
                    ql.add(current.children.get(j));
                }
            }
            System.out.println();
            ans.add(subList);
        }
        return ans;
    }
}
class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>> children;
    TreeNode(T data){
        this.data = data;
        this.children = new ArrayList<>();
    }
}
