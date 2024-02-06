// Problem Link: https://leetcode.com/problems/longest-increasing-subsequence/description/
// Author: Mahesh Reddy B N


class Solution {
    public int lengthOfLIS(int[] nums) {
        int [][]dp = new int[nums.length+1][nums.length+1];
        return helper(nums,0,-1,dp);
    }
    public int helper(int[]nums,int si,int prev,int[][] dp){
        if(si>=nums.length) return 0;
        if(prev==-1){
            return Math.max(1+helper(nums,si+1,si,dp),helper(nums,si+1,prev,dp));
        }
        if(dp[si][prev]!=0) return dp[si][prev];
        int curr = nums[si];
        if(curr>nums[prev]){
            return dp[si][prev]=Math.max(1+helper(nums,si+1,si,dp),helper(nums,si+1,prev,dp));
        }
        return dp[si][prev]=helper(nums,si+1,prev,dp);
    }
}