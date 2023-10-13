Problem Link: https://leetcode.com/problems/minimum-falling-path-sum/description/;

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
        int dp[][] = new int[matrix.length][matrix[0].length];
        for(int[]a :dp){
            Arrays.fill(a,-1);
        }
        for(int i=0;i<matrix.length;i++){
            ans = Math.min(ans,pathcost(matrix,0,i,dp));
        }
        return ans;
    }
    public int pathcost(int[][]matrix,int i,int j,int[][] dp){
        if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length) return Integer.MAX_VALUE;
        if(i == matrix.length-1) {
            return matrix[i][j];
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int a = pathcost(matrix,i+1,j-1,dp);
        int b = pathcost(matrix,i+1,j,dp);
        int c = pathcost(matrix,i+1,j+1,dp);
        return dp[i][j]=matrix[i][j]+Math.min(a,Math.min(b,c));
    }
}