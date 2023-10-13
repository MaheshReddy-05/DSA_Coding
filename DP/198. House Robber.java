Problem Link: https://leetcode.com/problems/house-robber/description/

class Solution {
    public int rob(int[] nums) {
    int dp[] = new int[nums.length];
    Arrays.fill(dp,-1);
    return helper(nums,dp,0);
    }
    public int helper(int[]nums,int[]dp,int i){
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int a = nums[i]+helper(nums,dp,i+2);
        int b = helper(nums,dp,i+1);
        return dp[i] = Math.max(a,b);
    }
}

Approach:
Pick and Not pic Approach