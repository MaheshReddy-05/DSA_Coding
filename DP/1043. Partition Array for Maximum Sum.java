// Problem Link: https://leetcode.com/problems/partition-array-for-maximum-sum/?envType=daily-question&envId=2024-02-03
// Author: Mahesh Reddy B N 

class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int maxt = 0;
        for(int i:arr){
            maxt = Math.max(maxt,i);
        }
        int [][]dp = new int[k+1][arr.length+1];
        return helper(arr,0,0,0,k,dp);
    }
    public int helper(int[] arr,int k,int max,int si,int givK,int[][] dp){
        if(si>=arr.length) return 0;
        max = Math.max(max,arr[si]);
        k++;
        if(dp[k][si]!=0) return dp[k][si];
        if(k>=givK){
            return dp[k][si] = k*max+ helper(arr,0,0,si+1,givK,dp);
        }
        return dp[k][si]= Math.max(k*max + helper(arr,0,0,si+1,givK,dp),helper(arr,k,max,si+1,givK,dp));
    }
    
}