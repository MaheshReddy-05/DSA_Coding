// Authior: Mahesh Reddy B N
// Problem Link: https://leetcode.com/problems/diameter-of-binary-tree/

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int []arr = new int[1];
        helper(root,arr);
        return arr[0]-1; // Here path is asked not the number of nodes so -1
    }
    public int helper(TreeNode root,int[] arr){
        if(root==null) return 0;
        int left = helper(root.left,arr);
        int right = helper(root.right,arr);
        arr[0] = Math.max(arr[0],1+left+right);
        return 1 + Math.max(left,right);
    }
}